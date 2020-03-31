/*
 * generated by Xtext 2.20.0
 */
grammar InternalERDiagramDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package hu.bme.mit.mdsd.erdiagram.text.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package hu.bme.mit.mdsd.erdiagram.text.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hu.bme.mit.mdsd.erdiagram.text.services.ERDiagramDslGrammarAccess;

}
@parser::members {
	private ERDiagramDslGrammarAccess grammarAccess;

	public void setGrammarAccess(ERDiagramDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleERDiagram
entryRuleERDiagram
:
{ before(grammarAccess.getERDiagramRule()); }
	 ruleERDiagram
{ after(grammarAccess.getERDiagramRule()); } 
	 EOF 
;

// Rule ERDiagram
ruleERDiagram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getERDiagramAccess().getGroup()); }
		(rule__ERDiagram__Group__0)
		{ after(grammarAccess.getERDiagramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelation
entryRuleRelation
:
{ before(grammarAccess.getRelationRule()); }
	 ruleRelation
{ after(grammarAccess.getRelationRule()); } 
	 EOF 
;

// Rule Relation
ruleRelation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationAccess().getGroup()); }
		(rule__Relation__Group__0)
		{ after(grammarAccess.getRelationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelationEnding
entryRuleRelationEnding
:
{ before(grammarAccess.getRelationEndingRule()); }
	 ruleRelationEnding
{ after(grammarAccess.getRelationEndingRule()); } 
	 EOF 
;

// Rule RelationEnding
ruleRelationEnding 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationEndingAccess().getGroup()); }
		(rule__RelationEnding__Group__0)
		{ after(grammarAccess.getRelationEndingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule AttributeType
ruleAttributeType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getAlternatives()); }
		(rule__AttributeType__Alternatives)
		{ after(grammarAccess.getAttributeTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule MultiplicityType
ruleMultiplicityType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicityTypeAccess().getAlternatives()); }
		(rule__MultiplicityType__Alternatives)
		{ after(grammarAccess.getMultiplicityTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getINTEnumLiteralDeclaration_0()); }
		('int')
		{ after(grammarAccess.getAttributeTypeAccess().getINTEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); }
		('double')
		{ after(grammarAccess.getAttributeTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeTypeAccess().getSTRINGEnumLiteralDeclaration_2()); }
		('string')
		{ after(grammarAccess.getAttributeTypeAccess().getSTRINGEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); }
		('boolean')
		{ after(grammarAccess.getAttributeTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeTypeAccess().getDATETIMEEnumLiteralDeclaration_4()); }
		('datetime')
		{ after(grammarAccess.getAttributeTypeAccess().getDATETIMEEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicityType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicityTypeAccess().getOneEnumLiteralDeclaration_0()); }
		('one')
		{ after(grammarAccess.getMultiplicityTypeAccess().getOneEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getMultiplicityTypeAccess().getManyEnumLiteralDeclaration_1()); }
		('many')
		{ after(grammarAccess.getMultiplicityTypeAccess().getManyEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERDiagram__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERDiagram__Group__0__Impl
	rule__ERDiagram__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ERDiagram__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERDiagramAccess().getEntitiesAssignment_0()); }
	(rule__ERDiagram__EntitiesAssignment_0)*
	{ after(grammarAccess.getERDiagramAccess().getEntitiesAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERDiagram__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERDiagram__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ERDiagram__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERDiagramAccess().getRelationAssignment_1()); }
	(rule__ERDiagram__RelationAssignment_1)*
	{ after(grammarAccess.getERDiagramAccess().getRelationAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_2()); }
	(rule__Entity__Group_2__0)?
	{ after(grammarAccess.getEntityAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_3()); }
	(rule__Entity__Group_3__0)*
	{ after(grammarAccess.getEntityAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_4()); }
	(rule__Entity__Group_4__0)?
	{ after(grammarAccess.getEntityAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__0__Impl
	rule__Entity__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getKeyKeyword_2_0()); }
	'key'
	{ after(grammarAccess.getEntityAccess().getKeyKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getKeyAssignment_2_1()); }
	(rule__Entity__KeyAssignment_2_1)
	{ after(grammarAccess.getEntityAccess().getKeyAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_3__0__Impl
	rule__Entity__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getIsAKeyword_3_0()); }
	'isA'
	{ after(grammarAccess.getEntityAccess().getIsAKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getIsAAssignment_3_1()); }
	(rule__Entity__IsAAssignment_3_1)
	{ after(grammarAccess.getEntityAccess().getIsAAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4__0__Impl
	rule__Entity__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_0()); }
	'{'
	{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4__1__Impl
	rule__Entity__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getAttributesAssignment_4_1()); }
	(rule__Entity__AttributesAssignment_4_1)
	{ after(grammarAccess.getEntityAccess().getAttributesAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4__2__Impl
	rule__Entity__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_4_2()); }
	(rule__Entity__Group_4_2__0)*
	{ after(grammarAccess.getEntityAccess().getGroup_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_3()); }
	'}'
	{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4_2__0__Impl
	rule__Entity__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getCommaKeyword_4_2_0()); }
	','
	{ after(grammarAccess.getEntityAccess().getCommaKeyword_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getAttributesAssignment_4_2_1()); }
	(rule__Entity__AttributesAssignment_4_2_1)
	{ after(grammarAccess.getEntityAccess().getAttributesAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_0()); }
	(rule__Attribute__NameAssignment_0)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getAttributeAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); }
	(rule__Attribute__TypeAssignment_2)
	{ after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getIsKeyAssignment_3()); }
	(rule__Attribute__IsKeyAssignment_3)?
	{ after(grammarAccess.getAttributeAccess().getIsKeyAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Relation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__0__Impl
	rule__Relation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getLeftEndingAssignment_0()); }
	(rule__Relation__LeftEndingAssignment_0)
	{ after(grammarAccess.getRelationAccess().getLeftEndingAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__1__Impl
	rule__Relation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getIsRelatedWithKeyword_1()); }
	'is related with'
	{ after(grammarAccess.getRelationAccess().getIsRelatedWithKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getRightEndingAssignment_2()); }
	(rule__Relation__RightEndingAssignment_2)
	{ after(grammarAccess.getRelationAccess().getRightEndingAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationEnding__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationEnding__Group__0__Impl
	rule__RelationEnding__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationEnding__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0()); }
	(rule__RelationEnding__UnorderedGroup_0)
	{ after(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationEnding__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationEnding__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationEnding__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationEndingAccess().getTargetAssignment_1()); }
	(rule__RelationEnding__TargetAssignment_1)
	{ after(grammarAccess.getRelationEndingAccess().getTargetAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationEnding__UnorderedGroup_0
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
	}
:
	rule__RelationEnding__UnorderedGroup_0__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
	restoreStackSize(stackSize);
}

rule__RelationEnding__UnorderedGroup_0__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getRelationEndingAccess().getMultiplicityAssignment_0_0()); }
					(rule__RelationEnding__MultiplicityAssignment_0_0)
					{ after(grammarAccess.getRelationEndingAccess().getMultiplicityAssignment_0_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getRelationEndingAccess().getNullableAssignment_0_1()); }
					(rule__RelationEnding__NullableAssignment_0_1)
					{ after(grammarAccess.getRelationEndingAccess().getNullableAssignment_0_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
	restoreStackSize(stackSize);
}

rule__RelationEnding__UnorderedGroup_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationEnding__UnorderedGroup_0__Impl
	rule__RelationEnding__UnorderedGroup_0__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationEnding__UnorderedGroup_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationEnding__UnorderedGroup_0__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__ERDiagram__EntitiesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getERDiagramAccess().getEntitiesEntityParserRuleCall_0_0()); }
		ruleEntity
		{ after(grammarAccess.getERDiagramAccess().getEntitiesEntityParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERDiagram__RelationAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getERDiagramAccess().getRelationRelationParserRuleCall_1_0()); }
		ruleRelation
		{ after(grammarAccess.getERDiagramAccess().getRelationRelationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__KeyAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getKeyAttributeCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getEntityAccess().getKeyAttributeIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEntityAccess().getKeyAttributeIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getEntityAccess().getKeyAttributeCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__IsAAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getIsAEntityCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getEntityAccess().getIsAEntityIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEntityAccess().getIsAEntityIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getEntityAccess().getIsAEntityCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__AttributesAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_1_0()); }
		ruleAttribute
		{ after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__AttributesAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_2_1_0()); }
		ruleAttribute
		{ after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0()); }
		ruleAttributeType
		{ after(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__IsKeyAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getIsKeyKeyKeyword_3_0()); }
		(
			{ before(grammarAccess.getAttributeAccess().getIsKeyKeyKeyword_3_0()); }
			'key'
			{ after(grammarAccess.getAttributeAccess().getIsKeyKeyKeyword_3_0()); }
		)
		{ after(grammarAccess.getAttributeAccess().getIsKeyKeyKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__LeftEndingAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getLeftEndingRelationEndingParserRuleCall_0_0()); }
		ruleRelationEnding
		{ after(grammarAccess.getRelationAccess().getLeftEndingRelationEndingParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__RightEndingAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getRightEndingRelationEndingParserRuleCall_2_0()); }
		ruleRelationEnding
		{ after(grammarAccess.getRelationAccess().getRightEndingRelationEndingParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationEnding__MultiplicityAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationEndingAccess().getMultiplicityMultiplicityTypeEnumRuleCall_0_0_0()); }
		ruleMultiplicityType
		{ after(grammarAccess.getRelationEndingAccess().getMultiplicityMultiplicityTypeEnumRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationEnding__NullableAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationEndingAccess().getNullableNullableKeyword_0_1_0()); }
		(
			{ before(grammarAccess.getRelationEndingAccess().getNullableNullableKeyword_0_1_0()); }
			'nullable'
			{ after(grammarAccess.getRelationEndingAccess().getNullableNullableKeyword_0_1_0()); }
		)
		{ after(grammarAccess.getRelationEndingAccess().getNullableNullableKeyword_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationEnding__TargetAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationEndingAccess().getTargetEntityCrossReference_1_0()); }
		(
			{ before(grammarAccess.getRelationEndingAccess().getTargetEntityIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRelationEndingAccess().getTargetEntityIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getRelationEndingAccess().getTargetEntityCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;