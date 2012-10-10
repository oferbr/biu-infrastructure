package ac.biu.nlp.nlp.instruments.parse.tree.dependency.basic.xmldom;

import ac.biu.nlp.nlp.representation.CanonicalPosTag;
import ac.biu.nlp.nlp.representation.PartOfSpeech;
import ac.biu.nlp.nlp.representation.UnsupportedPosTagStringException;

/**
 * 
 * @author Asher Stern
 * @since Oct 3, 2012
 *
 */
public interface XmlTreePartOfSpeechFactory
{
	public PartOfSpeech createPartOfSpeech(CanonicalPosTag canonicalPosTag, String partOfSpeechRepresentation) throws UnsupportedPosTagStringException;
}
