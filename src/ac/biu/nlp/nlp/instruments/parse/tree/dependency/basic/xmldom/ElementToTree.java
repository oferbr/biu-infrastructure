package ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom;

import java.util.LinkedHashMap;
import java.util.Map;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import ac.biu.nlp.nlp.general.BidirectionalMap;
import ac.biu.nlp.nlp.general.SimpleBidirectionalMap;
import ac.biu.nlp.nlp.instruments.parse.representation.basic.Info;
import ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.BasicNode;
import static ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom.TreeToElement.*;

/**
 * 
 * @author Asher Stern
 * @since Oct 3, 2012
 *
 */
public class ElementToTree
{
	public ElementToTree(XmlTreePartOfSpeechFactory posFactory, Element element)
	{
		super();
		this.posFactory = posFactory;
		this.element = element;
	}


	public void createTree() throws TreeXmlException
	{
		mapNodeToUniqueId = new SimpleBidirectionalMap<BasicNode, String>();
		mapNodeToAntecedentId = new LinkedHashMap<BasicNode, String>();
		tree = createSubTree(element);
		updateAntecedents();
	}
	
	
	public BasicNode getTree() throws TreeXmlException
	{
		if (null==tree) throw new TreeXmlException("Please call createTree()");
		return tree;
	}





	private BasicNode createSubTree(Element nodeElement) throws TreeXmlException
	{
		String uniqueId = nodeElement.getAttribute(XML_UNIQUE_ID_ATTRIBUTE_NAME);
		if (null==uniqueId) throw new TreeXmlException("Malformed XML. Missing unique id of a node.");
		
//		NodeList nodeListInfoElement = nodeElement.getElementsByTagName(Info.class.getSimpleName());
//		if (nodeListInfoElement.getLength()!=1) throw new TreeXmlException("Malformed XML. Number of Info elements is not 1.");
//		Element infoElement = (Element) nodeListInfoElement.item(0);
		
		Element infoElement = TreeXmlUtils.getChildElement(nodeElement, Info.class.getSimpleName());
		ElementToInfo elementToInfo = new ElementToInfo(posFactory, infoElement);
		elementToInfo.createInfo();
		Info info = elementToInfo.getInfo();
		
		BasicNode node = new BasicNode(info);
		mapNodeToUniqueId.put(node,uniqueId);
		
		String antecedentId = nodeElement.getAttribute(ANTECEDENT_ATTRIBUTE_NAME);
		if (antecedentId!=null)
		{
			mapNodeToAntecedentId.put(node,antecedentId);
		}

//		NodeList nodeListChildrenElement = nodeElement.getElementsByTagName(CHILDREN_ELEMENT_NAME);
//		if (nodeListChildrenElement.getLength()>1) throw new TreeXmlException("Malformed XML. More than one children element.");
//		if (nodeListChildrenElement.getLength()==1)

		Element childrenElement = TreeXmlUtils.getChildElement(nodeElement, CHILDREN_ELEMENT_NAME,true);
		if (childrenElement!=null)
		{
			NodeList nodeListForChildren = childrenElement.getChildNodes();//  getElementsByTagName(BasicNode.class.getSimpleName());
			for (int index=0;index<nodeListForChildren.getLength();++index)
			{
				if (nodeListForChildren.item(index) instanceof Element)
				{
					if (((Element)nodeListForChildren.item(index)).getTagName().equals(BasicNode.class.getSimpleName()))
					{
						BasicNode child = createSubTree((Element)nodeListForChildren.item(index));
						node.addChild(child);
						
					}
				}
			}
		}
		
		return node;
	}

	
	private void updateAntecedents()
	{
		for (BasicNode node : mapNodeToAntecedentId.keySet())
		{
			node.setAntecedent(mapNodeToUniqueId.rightGet(mapNodeToAntecedentId.get(node)));
		}
	}
	
	private XmlTreePartOfSpeechFactory posFactory;
	private Element element;
	
	private BidirectionalMap<BasicNode, String> mapNodeToUniqueId;
	private Map<BasicNode, String> mapNodeToAntecedentId;
	
	private BasicNode tree = null;
}
