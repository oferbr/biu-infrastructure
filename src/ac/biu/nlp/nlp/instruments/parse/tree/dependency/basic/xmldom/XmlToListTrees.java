package ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom;

import static ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom.ListTreesToXml.CORPUS_INFORMATION_ELEMENT_NAME;
import static ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom.ListTreesToXml.SENTENCE_ELEMENT_NAME;
import static ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom.ListTreesToXml.TREE_AND_SENTENCE_ELEMENT_NAME;
import static ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom.TreeXmlUtils.getChildElement;
import static ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom.TreeXmlUtils.getTextOfElement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.BasicNode;


/**
 * 
 * @author Asher Stern
 * @since Oct 3, 2012
 *
 */
public class XmlToListTrees
{
	public XmlToListTrees(String xmlFileName,
			XmlTreePartOfSpeechFactory posFactory)
	{
		super();
		this.xmlFileName = xmlFileName;
		this.posFactory = posFactory;
	}



	public void createListTrees() throws TreeXmlException
	{
		getDocument();
		readDocument();
	}
	
	
	
	public List<TreeAndSentence> getListTrees() throws TreeXmlException
	{
		if (null==listTrees) throw new TreeXmlException("Please call createListTrees()");
		return listTrees;
	}
	
	public String getCorpusInformation() throws TreeXmlException
	{
		if (null==listTrees) throw new TreeXmlException("Please call createListTrees()");
		return corpusInformation;
	}



	private void readDocument() throws TreeXmlException
	{
		Element documentElement = document.getDocumentElement();
		
		Element corpusInformationElement = getChildElement(documentElement,CORPUS_INFORMATION_ELEMENT_NAME,true);
		if (corpusInformationElement!=null)
		{
			corpusInformation  = getTextOfElement(corpusInformationElement);
		}
		else
		{
			corpusInformation=null;
		}

		List<Element> allSentences = TreeXmlUtils.getChildElements(documentElement, TREE_AND_SENTENCE_ELEMENT_NAME);
		listTrees = new ArrayList<TreeAndSentence>(allSentences.size());
		for (Element treeAndSentenceElement : allSentences)
		{
			addElementToList(treeAndSentenceElement);
		}
	}
	
	private void addElementToList(Element treeAndSentenceElement) throws TreeXmlException
	{
		String sentence = getTextOfElement(getChildElement(treeAndSentenceElement, SENTENCE_ELEMENT_NAME));
		Element treeElement = getChildElement(treeAndSentenceElement, BasicNode.class.getSimpleName());
		ElementToTree elementToTree = new ElementToTree(posFactory,treeElement);
		elementToTree.createTree();
		BasicNode tree = elementToTree.getTree();
		
		TreeAndSentence treeAndSentence = new TreeAndSentence(sentence, tree);
		listTrees.add(treeAndSentence);
	}
	
	private void getDocument() throws TreeXmlException
	{
		try
		{
			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(xmlFileName));
		}
		catch(ParserConfigurationException e)
		{
			throw new TreeXmlException("read xml file failed. See nested exception.",e);
		} catch (SAXException e)
		{
			throw new TreeXmlException("read xml file failed. See nested exception.",e);
		}
		catch (IOException e)
		{
			throw new TreeXmlException("read xml file failed. See nested exception.",e);
		}
	}

	private String xmlFileName;
	private XmlTreePartOfSpeechFactory posFactory;
	
	private Document document;
	
	private String corpusInformation = null;
	private List<TreeAndSentence> listTrees = null;

}
