package ac.biu.nlp.nlp.instruments.parse.easyfirst;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import ac.biu.nlp.nlp.instruments.parse.EnglishSingleTreeParser;
import ac.biu.nlp.nlp.instruments.parse.ParserRunException;
import ac.biu.nlp.nlp.instruments.parse.tree.AbstractNodeUtils;
import ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.BasicConstructionNode;
import ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.BasicNode;
import ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.BasicNodeConstructor;
import ac.biu.nlp.nlp.instruments.postagger.MaxentPosTagger;
import ac.biu.nlp.nlp.instruments.postagger.PosTagger;
import ac.biu.nlp.nlp.instruments.postagger.PosTaggerException;
import ac.biu.nlp.nlp.instruments.tokenizer.MaxentTokenizer;
import ac.biu.nlp.nlp.instruments.tokenizer.Tokenizer;
import ac.biu.nlp.nlp.instruments.tokenizer.TokenizerException;


/**
 * 
 * @author Asher Stern
 * @since Mar 22, 2011
 *
 */
public class EasyFirstParser implements EnglishSingleTreeParser
{
	public static final String URL_PROTOCOL = "http";
	public static final String URL_FILE = "/parse";
	public static final String DEFAULT_HOST = "localhost";
	public static final int DEFAULT_PORT = 8080;
	
	
	/**
	 * <B>tokenizer and posTagger are not initialized</B>
	 * @param host
	 * @param port
	 * @param tokenizer
	 * @param posTagger
	 * @throws ParserRunException
	 */
	public EasyFirstParser(String host, int port, Tokenizer tokenizer, PosTagger posTagger) throws ParserRunException
	{
		try
		{
			this.tokenizer = tokenizer;
			this.posTagger = posTagger;
			this.url = new URL(URL_PROTOCOL, host, port, URL_FILE);
		}
		catch (MalformedURLException e)
		{
			throw new ParserRunException("URL problem",e);
		}
	}
	
	public EasyFirstParser(String host, int port, String posTaggerModelFile) throws ParserRunException
	{
		try
		{
			this.tokenizer = new MaxentTokenizer();
			this.posTagger = new MaxentPosTagger(posTaggerModelFile);
			this.url = new URL(URL_PROTOCOL, host, port, URL_FILE);
		}
		catch(PosTaggerException e)
		{
			throw new ParserRunException("pos tagger problem",e);
		}
		catch (MalformedURLException e)
		{
			throw new ParserRunException("URL problem",e);
		}
	}
	
	
	// usually we use $JARS/stanford-postagger-full-2008-09-28/models/bidirectional-wsj-0-18.tagger
	public EasyFirstParser(String posTaggerModelFile) throws ParserRunException
	{
		this(DEFAULT_HOST,DEFAULT_PORT,posTaggerModelFile);
	}
	
	

	public void init() throws ParserRunException
	{
		try
		{
			this.tokenizer.init();
		}
		catch (TokenizerException e)
		{
			throw new ParserRunException("tokenizer initialization problem",e);
		}
		
		try
		{
			this.posTagger.init();
		}
		catch (PosTaggerException e)
		{
			try{this.tokenizer.cleanUp();}catch(Exception ee){}
			throw new ParserRunException("posTagger initialization problem",e);
		}
		
		initialized=true;
	}

	public void setSentence(String sentence)
	{
		reset();
		this.sentence = sentence;
	}

	/**
	 * @return true if this parser is initialized
	 */
	public boolean isInitialized() {
		return initialized;
	}
	
	public void parse() throws ParserRunException
	{
		if (!initialized)   throw new ParserRunException("You must call init() before doing anything with this parser");
		if (null==sentence) throw new ParserRunException("sentence is null");
		
		EasyFirstClient client = new EasyFirstClient(tokenizer, posTagger, url);
		client.parse(sentence);
		nodesList = client.getNodesAsList();
		mutableTree = client.getTree();
		wordsNodesList = client.getWordsNodesList();
	}

	public BasicConstructionNode getMutableParseTree() throws ParserRunException
	{
		if (mutableTree==null) throw new ParserRunException("Not parsed.");
		return mutableTree;
	}

	public BasicNode getParseTree() throws ParserRunException
	{
		if (tree==null)
		{
			if (mutableTree==null) throw new ParserRunException("Not parsed.");
			tree = AbstractNodeUtils.copyTree(mutableTree, new BasicNodeConstructor());
		}
		return tree;
	}

	public ArrayList<BasicConstructionNode> getNodesOrderedByWords() throws ParserRunException
	{
		if (wordsNodesList==null) throw new ParserRunException("Not parsed.");
		return wordsNodesList;
	}

	public ArrayList<BasicConstructionNode> getNodesAsList() throws ParserRunException
	{
		if (nodesList==null) throw new ParserRunException("Not parsed.");
		return nodesList;
	}

	public void reset()
	{
		this.tree = null;
		this.mutableTree = null;
		this.wordsNodesList = null;
		this.nodesList = null;
		this.sentence = null;
	}

	public void cleanUp()
	{
		if (initialized)
		{
			this.tokenizer.cleanUp();
			this.posTagger.cleanUp();
		}
	}

	private URL url;
	private Tokenizer tokenizer;
	private PosTagger posTagger;
	private boolean initialized = false;
	
	private String sentence = null;
	
	private BasicConstructionNode mutableTree;
	private ArrayList<BasicConstructionNode> wordsNodesList;
	private ArrayList<BasicConstructionNode> nodesList;
	
	private BasicNode tree;
}
