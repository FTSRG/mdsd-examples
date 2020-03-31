/**
 * generated by Xtext 2.20.0
 */
package hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Ending</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#isNullable <em>Nullable</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagramDslPackage#getRelationEnding()
 * @model
 * @generated
 */
public interface RelationEnding extends EObject
{
  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.MultiplicityType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.MultiplicityType
   * @see #setMultiplicity(MultiplicityType)
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagramDslPackage#getRelationEnding_Multiplicity()
   * @model
   * @generated
   */
  MultiplicityType getMultiplicity();

  /**
   * Sets the value of the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.MultiplicityType
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(MultiplicityType value);

  /**
   * Returns the value of the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nullable</em>' attribute.
   * @see #setNullable(boolean)
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagramDslPackage#getRelationEnding_Nullable()
   * @model
   * @generated
   */
  boolean isNullable();

  /**
   * Sets the value of the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#isNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nullable</em>' attribute.
   * @see #isNullable()
   * @generated
   */
  void setNullable(boolean value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Entity)
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagramDslPackage#getRelationEnding_Target()
   * @model
   * @generated
   */
  Entity getTarget();

  /**
   * Sets the value of the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Entity value);

} // RelationEnding
