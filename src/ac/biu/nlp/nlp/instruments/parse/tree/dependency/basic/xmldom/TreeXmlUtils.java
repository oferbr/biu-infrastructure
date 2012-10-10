package ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom;

import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 * 
 * @author Asher Stern
 * @since Oct 3, 2012
 *
 */
public class TreeXmlUtils
{
	public static Element getChildElement(Element element, String childName) throws TreeXmlException
	{
		return getChildElement(element,childName,false);
	}
	
	public static Element getChildElement(Element element, String childName, boolean optional) throws TreeXmlException
	{
		Element childElement = null;
		NodeList nodeList = element.getChildNodes();
		for (int index=0;index<nodeList.getLength();++index)
		{
			Node node = nodeList.item(index);
			if (node instanceof Element)
			{
				Element elementOfNode = (Element)node;
				if (elementOfNode.getTagName().equals(childName))
				{
					if (childElement!=null) throw new TreeXmlException("More than one child: "+childName);
					childElement = elementOfNode;
				}
				
			}
		}
		
		if ( (!optional) && (null==childElement) )
		{
			throw new TreeXmlException("Missing child: "+childName);
		}
		
		return childElement;
	}
	
	public static List<Element> getChildElements(Element element, String childrenName)
	{
		List<Element> ret = new LinkedList<Element>();
		NodeList nodeList = element.getChildNodes();
		for (int index=0;index<nodeList.getLength();++index)
		{
			Node node = nodeList.item(index);
			if (node instanceof Element)
			{
				Element elementOfNode = (Element)node;
				if (elementOfNode.getTagName().equals(childrenName))
				{
					ret.add(elementOfNode);
				}
				
			}
		}
		return ret;
	}
	
	public static String getTextOfElement(Element element) throws TreeXmlException
	{
		String foundString = null;
		NodeList nodeList = element.getChildNodes();
		for (int index=0;index<nodeList.getLength();index++)
		{
			Node node = nodeList.item(index);
			if (node instanceof Text)
			{
				Text text = (Text) node;
				String str = text.getNodeValue();
				str = str.trim();
				if (str.length()>0)
				{
					if (foundString!=null) throw new TreeXmlException("Malformed XML. Element has more than one text.");
					foundString=str;
				}
			}
		}
		if (null==foundString) throw new TreeXmlException("Malformed XML. Text was not found");
		return foundString;
	}


}
