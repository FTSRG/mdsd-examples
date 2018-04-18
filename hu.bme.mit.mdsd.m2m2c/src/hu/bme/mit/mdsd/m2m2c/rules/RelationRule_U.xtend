package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.queries.Relation_UMatcher
import hu.bme.mit.mdsd.rdb.Column
import hu.bme.mit.mdsd.rdb.Table
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot

class RelationRule_U extends AbstractRule{

    new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
        super(engine, manipulation, traceRoot)
        
		rule = createRule.name("RelationRule")
			// left hand side - queries a single relation
			.precondition(Relation_UMatcher.querySpecification)
			.action(CRUDActivationStateEnum.CREATED) [
			println('''RelationRule CREATED [empty RHS] (�relation.name�)''')
			
		].action(CRUDActivationStateEnum.UPDATED) [
			println('''RelationRule UPDATED (�relation.name�)''')
			
			if(!relation.name.equals(switchTable.name)){
				switchTable.set(rdbPackage.namedElement_Name, relation.name)
			}			

		].build
	}
	
	def updateColumnIfNecessary(Column column, Table table){
//		if()
//		column?.set(rdbPackage.foreignKey_ReferencedKey, table.columns.filter(Key).head)
//		column?.set(rdbPackage.namedElement_Name, columnRight.referencedKey.name)
//		column?.set(rdbPackage.column_Type, columnRight.referencedKey.type)
	}    
}