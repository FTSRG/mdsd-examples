/*
 * generated by Xtext 2.20.0
 */
package hu.bme.mit.mdsd.erdiagram.text;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ERDiagramDslStandaloneSetup extends ERDiagramDslStandaloneSetupGenerated {

	public static void doSetup() {
		new ERDiagramDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}