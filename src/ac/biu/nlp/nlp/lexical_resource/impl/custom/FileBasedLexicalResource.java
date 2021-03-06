package ac.biu.nlp.nlp.lexical_resource.impl.custom;

import java.io.IOException;

import ac.biu.nlp.nlp.general.ValueSetMapFromStringCreator;
import ac.biu.nlp.nlp.general.configuration.ConfigurationException;
import ac.biu.nlp.nlp.general.configuration.ConfigurationParams;
import ac.biu.nlp.nlp.representation.CanonicalPosTag;
import ac.biu.nlp.nlp.representation.UnsupportedPosTagStringException;

/**
 * <p>A lexical resource based on a two-column text-file. 
 * <p>Each line in the file corresponds to a single left->right entailment rule.
 * <p>The "left" and "right" are separated by a separator, defined in the configuration.
 * <p>The rules of this resource are all related to a single Part of Speech, given in the configuration.
 * <p>The resource name and relation name are also given in the configuration.
 *
 * @author Erel Segal Halevi
 * @since 2012-07-24
 */
public class FileBasedLexicalResource extends ValueSetMapLexicalResource {

	/**
	 * @param params configuration params for initialization. Should include:
	 * <li>table_file - path to the file that contains the rules, in table format. Can also be a URL.
	 * <li>table_separator - pattern of column-separator, e.g. "->".
	 * <li>part_of_speech - canonical name of the part-of-speech for this rule-base. For possible values, see {@link CanonicalPosTag}.
	 * <li>relation_name - name of relation to put in rules (the same for all rules).
	 * <li>(NOTE: The params.getModuleName() is used as the resource_name).  
	 */
	public FileBasedLexicalResource(ConfigurationParams params) throws UnsupportedPosTagStringException, IOException, ConfigurationException {
		super(
				ValueSetMapFromStringCreator.mapFromConfigurationParams(params), 
				params.getEnum(CanonicalPosTag.class, "part_of_speech"), 
				params.getModuleName(),
				params.getString("relation_name"));
	}
}
