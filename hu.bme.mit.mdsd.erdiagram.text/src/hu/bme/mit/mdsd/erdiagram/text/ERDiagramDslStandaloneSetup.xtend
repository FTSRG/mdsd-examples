/*
 * generated by Xtext 2.9.1
 */
package hu.bme.mit.mdsd.erdiagram.text


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ERDiagramDslStandaloneSetup extends ERDiagramDslStandaloneSetupGenerated {

	def static void doSetup() {
		new ERDiagramDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}