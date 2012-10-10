package ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom;

import ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.BasicNode;

/**
 * 
 * @author Asher Stern
 * @since October 2, 2012
 *
 */
public class TreeAndSentence
{
	public TreeAndSentence(String sentence, BasicNode tree)
	{
		super();
		this.sentence = sentence;
		this.tree = tree;
	}
	
	
	
	public String getSentence()
	{
		return sentence;
	}
	public BasicNode getTree()
	{
		return tree;
	}



	private final String sentence;
	private final BasicNode tree;
}
