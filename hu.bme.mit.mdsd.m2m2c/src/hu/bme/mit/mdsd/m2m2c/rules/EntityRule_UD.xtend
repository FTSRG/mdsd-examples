package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.queries.Entity_UDMatcher
import hu.bme.mit.mdsd.m2m2c.util.TracingHelperUtility
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot

class EntityRule_UD extends AbstractRule{

	new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
		super(engine, manipulation, traceRoot)

		rule = createRule.name("EntityRule")
			// left hand side - queries a single entity
			.precondition(Entity_UDMatcher.querySpecification)
			.action(CRUDActivationStateEnum.CREATED) [
			println('''EntityRule CREATED [empty RHS] (�entity.name�)''')
			
		].action(CRUDActivationStateEnum.UPDATED) [
			println('''EntityRule UPDATED (�entity.name�)''')
			
			if(!entity.name.equals(table.name)){
				table.set(rdbPackage.namedElement_Name, entity.name)
			}	

		].action(CRUDActivationStateEnum.DELETED)[
			println('''EntityRule DELETED (�entity.name�)''')
			
			TracingHelperUtility.deleteTrace(trace, manipulation)
		].build
	}		
}