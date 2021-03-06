package ac.biu.nlp.nlp.instruments.parse;

import java.util.List;

import ac.biu.nlp.nlp.general.immutable.ImmutableSet;
import ac.biu.nlp.nlp.instruments.coreference.TreeCoreferenceInformation;
import ac.biu.nlp.nlp.instruments.parse.tree.AbstractConstructionNode;
import ac.biu.nlp.nlp.instruments.parse.tree.AbstractNode;

/**
 * Generates multiple trees for a single sentence. The trees may be
 * partially overlapped.
 * <P>
 * <B>Currently - not in use.</B>
 * 
 * @author Asher Stern
 *
 * @param <T>
 * @param <S>
 */
public interface MultipleTreesParser<T, S extends AbstractNode<T,S>>
{
	public void init() throws ParserRunException;
	
	public void setSentence(String sentence);
	
	public void parse();

	// mutable parse tree methods
	
	public List<? extends AbstractConstructionNode<T, ?>> getNodesOrderedByWords() throws ParserRunException;
	
	public ImmutableSet<AbstractConstructionNode<T, ?>> getMutableParseTrees() throws ParserRunException;
	
	public TreeCoreferenceInformation<? extends AbstractConstructionNode<T, ?>> getCoreferenceInformationForMutableParseTrees() throws ParserRunException;

	// parse tree methods
	
	public ImmutableSet<S> getParseTrees() throws ParserRunException;

	public TreeCoreferenceInformation<S> getCoreferenceInformation() throws ParserRunException;
	
	
	public void reset();
	
	public void cleanUp();
}
