/*
 * generated by Xtext 2.20.0
 */
package hu.bme.mit.mdsd.erdiagram.text.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import hu.bme.mit.mdsd.erdiagram.text.ide.contentassist.antlr.internal.InternalERDiagramDslParser;
import hu.bme.mit.mdsd.erdiagram.text.services.ERDiagramDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ERDiagramDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ERDiagramDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ERDiagramDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAttributeTypeAccess().getAlternatives(), "rule__AttributeType__Alternatives");
			builder.put(grammarAccess.getMultiplicityTypeAccess().getAlternatives(), "rule__MultiplicityType__Alternatives");
			builder.put(grammarAccess.getERDiagramAccess().getGroup(), "rule__ERDiagram__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_3(), "rule__Entity__Group_3__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_4(), "rule__Entity__Group_4__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_4_2(), "rule__Entity__Group_4_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
			builder.put(grammarAccess.getRelationEndingAccess().getGroup(), "rule__RelationEnding__Group__0");
			builder.put(grammarAccess.getERDiagramAccess().getEntitiesAssignment_0(), "rule__ERDiagram__EntitiesAssignment_0");
			builder.put(grammarAccess.getERDiagramAccess().getRelationAssignment_1(), "rule__ERDiagram__RelationAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getKeyAssignment_2_1(), "rule__Entity__KeyAssignment_2_1");
			builder.put(grammarAccess.getEntityAccess().getIsAAssignment_3_1(), "rule__Entity__IsAAssignment_3_1");
			builder.put(grammarAccess.getEntityAccess().getAttributesAssignment_4_1(), "rule__Entity__AttributesAssignment_4_1");
			builder.put(grammarAccess.getEntityAccess().getAttributesAssignment_4_2_1(), "rule__Entity__AttributesAssignment_4_2_1");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_0(), "rule__Attribute__NameAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_2(), "rule__Attribute__TypeAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getIsTransientAssignment_3(), "rule__Attribute__IsTransientAssignment_3");
			builder.put(grammarAccess.getRelationAccess().getLeftEndingAssignment_0(), "rule__Relation__LeftEndingAssignment_0");
			builder.put(grammarAccess.getRelationAccess().getRightEndingAssignment_2(), "rule__Relation__RightEndingAssignment_2");
			builder.put(grammarAccess.getRelationEndingAccess().getMultiplicityAssignment_0_0(), "rule__RelationEnding__MultiplicityAssignment_0_0");
			builder.put(grammarAccess.getRelationEndingAccess().getNullableAssignment_0_1(), "rule__RelationEnding__NullableAssignment_0_1");
			builder.put(grammarAccess.getRelationEndingAccess().getTargetAssignment_1(), "rule__RelationEnding__TargetAssignment_1");
			builder.put(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), "rule__RelationEnding__UnorderedGroup_0");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ERDiagramDslGrammarAccess grammarAccess;

	@Override
	protected InternalERDiagramDslParser createParser() {
		InternalERDiagramDslParser result = new InternalERDiagramDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ERDiagramDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ERDiagramDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
