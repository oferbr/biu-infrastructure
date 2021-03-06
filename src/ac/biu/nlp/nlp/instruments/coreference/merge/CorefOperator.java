package ac.biu.nlp.nlp.instruments.coreference.merge;

import java.util.HashMap;
import java.util.Map;

import ac.biu.nlp.nlp.general.match.Operator;
import ac.biu.nlp.nlp.instruments.coreference.TreeCoreferenceInformation;
import ac.biu.nlp.nlp.instruments.coreference.TreeCoreferenceInformationException;


// THE USER SHOULD HANDLE THE EXCEPTION (this.exception)

public class CorefOperator<T> implements Operator<T, WordWithCoreferenceTag>
{
	public void makeOperation()
	{
		if (null==this.exception)
		{
			if ( (this.node!=null) && (this.word!=null) )
			{
				if ( (this.word.getCoreferenceTag()!=null) && (this.word.getWord()!=null) )
				{
					Integer id = null;
					if (idMap.containsKey(word.getCoreferenceTag()))
					{
						id = idMap.get(word.getCoreferenceTag());
					}
					else
					{
						id = corefInformation.createNewGroup();
						idMap.put(word.getCoreferenceTag(), id);
					}
					try
					{
						corefInformation.addNodeToGroup(id, node);
					}
					catch(TreeCoreferenceInformationException e)
					{
						exception = e;
					}
				}
			}
		}
		
	}

	public void set(T lhs, WordWithCoreferenceTag rhs)
	{
		this.node = lhs;
		this.word = rhs;
	}
	
	
	
	public TreeCoreferenceInformationException getException()
	{
		return exception;
	}
	

	public TreeCoreferenceInformation<T> getCorefInformation()
	{
		return corefInformation;
	}





	protected Map<String, Integer> idMap = new HashMap<String, Integer>();
	protected T node;
	protected WordWithCoreferenceTag word;
	protected TreeCoreferenceInformation<T> corefInformation = new TreeCoreferenceInformation<T>();
	protected TreeCoreferenceInformationException exception = null;
}
