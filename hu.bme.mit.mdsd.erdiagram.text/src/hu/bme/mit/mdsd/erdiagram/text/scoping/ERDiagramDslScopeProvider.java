/*
 * generated by Xtext 2.20.0
 */
package hu.bme.mit.mdsd.erdiagram.text.scoping;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Attribute;
import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagram;
import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagramDslPackage;
import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity;

/**
 * This class contains custom scoping description.
 * 
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class ERDiagramDslScopeProvider extends AbstractERDiagramDslScopeProvider {

	public IScope getScope(EObject context, EReference reference) {
		// Setting scope for the isA reference in Entity
		if (context instanceof Entity && reference == ERDiagramDslPackage.Literals.ENTITY__IS_A) {
			ERDiagram erDiagram = (ERDiagram) context.eContainer();
			Collection<Entity> referrableEntities = new ArrayList<Entity>(erDiagram.getEntities());
			referrableEntities.remove(context); // Removing itself
			return Scopes.scopeFor(referrableEntities);
		}
		// Setting scope for the key reference in Entity
		if (context instanceof Entity && reference == ERDiagramDslPackage.Literals.ENTITY__KEY) {
			Entity entity = (Entity) context;
			Collection<Attribute> referrableAttributes = new ArrayList<Attribute>(entity.getAttributes());
			referrableAttributes.removeIf(it -> it.isIsKey() == false); // Removing not key attributes
			return Scopes.scopeFor(referrableAttributes);
		}
		return super.getScope(context, reference);
	}

}
