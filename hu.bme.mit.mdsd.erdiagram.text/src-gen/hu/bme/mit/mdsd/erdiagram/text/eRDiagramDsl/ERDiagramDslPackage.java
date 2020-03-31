/**
 * generated by Xtext 2.20.0
 */
package hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagramDslFactory
 * @model kind="package"
 * @generated
 */
public interface ERDiagramDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eRDiagramDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bme.hu/mit/mdsd/erdiagram/text/ERDiagramDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eRDiagramDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ERDiagramDslPackage eINSTANCE = hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl.init();

  /**
   * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramImpl <em>ER Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramImpl
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getERDiagram()
   * @generated
   */
  int ER_DIAGRAM = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ER_DIAGRAM__ENTITIES = 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ER_DIAGRAM__RELATION = 1;

  /**
   * The number of structural features of the '<em>ER Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ER_DIAGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.EntityImpl
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__KEY = 1;

  /**
   * The feature id for the '<em><b>Is A</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__IS_A = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 3;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.AttributeImpl
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Is Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__IS_KEY = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.RelationImpl
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 3;

  /**
   * The feature id for the '<em><b>Left Ending</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__LEFT_ENDING = 0;

  /**
   * The feature id for the '<em><b>Right Ending</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__RIGHT_ENDING = 1;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.RelationEndingImpl <em>Relation Ending</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.RelationEndingImpl
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getRelationEnding()
   * @generated
   */
  int RELATION_ENDING = 4;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_ENDING__MULTIPLICITY = 0;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_ENDING__NULLABLE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_ENDING__TARGET = 2;

  /**
   * The number of structural features of the '<em>Relation Ending</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_ENDING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.AttributeType <em>Attribute Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.AttributeType
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getAttributeType()
   * @generated
   */
  int ATTRIBUTE_TYPE = 5;

  /**
   * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.MultiplicityType <em>Multiplicity Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.MultiplicityType
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getMultiplicityType()
   * @generated
   */
  int MULTIPLICITY_TYPE = 6;


  /**
   * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagram <em>ER Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ER Diagram</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagram
   * @generated
   */
  EClass getERDiagram();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagram#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagram#getEntities()
   * @see #getERDiagram()
   * @generated
   */
  EReference getERDiagram_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagram#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relation</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagram#getRelation()
   * @see #getERDiagram()
   * @generated
   */
  EReference getERDiagram_Relation();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity#getKey()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Key();

  /**
   * Returns the meta object for the reference list '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity#getIsA <em>Is A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Is A</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity#getIsA()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_IsA();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Attribute#isIsKey <em>Is Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Key</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Attribute#isIsKey()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_IsKey();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Relation#getLeftEnding <em>Left Ending</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Ending</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Relation#getLeftEnding()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_LeftEnding();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Relation#getRightEnding <em>Right Ending</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Ending</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Relation#getRightEnding()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_RightEnding();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding <em>Relation Ending</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Ending</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding
   * @generated
   */
  EClass getRelationEnding();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#getMultiplicity()
   * @see #getRelationEnding()
   * @generated
   */
  EAttribute getRelationEnding_Multiplicity();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#isNullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#isNullable()
   * @see #getRelationEnding()
   * @generated
   */
  EAttribute getRelationEnding_Nullable();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.RelationEnding#getTarget()
   * @see #getRelationEnding()
   * @generated
   */
  EReference getRelationEnding_Target();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Type</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.AttributeType
   * @generated
   */
  EEnum getAttributeType();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.MultiplicityType <em>Multiplicity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicity Type</em>'.
   * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.MultiplicityType
   * @generated
   */
  EEnum getMultiplicityType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ERDiagramDslFactory getERDiagramDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramImpl <em>ER Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramImpl
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getERDiagram()
     * @generated
     */
    EClass ER_DIAGRAM = eINSTANCE.getERDiagram();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ER_DIAGRAM__ENTITIES = eINSTANCE.getERDiagram_Entities();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ER_DIAGRAM__RELATION = eINSTANCE.getERDiagram_Relation();

    /**
     * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.EntityImpl
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__KEY = eINSTANCE.getEntity_Key();

    /**
     * The meta object literal for the '<em><b>Is A</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__IS_A = eINSTANCE.getEntity_IsA();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.AttributeImpl
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__IS_KEY = eINSTANCE.getAttribute_IsKey();

    /**
     * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.RelationImpl
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Left Ending</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__LEFT_ENDING = eINSTANCE.getRelation_LeftEnding();

    /**
     * The meta object literal for the '<em><b>Right Ending</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__RIGHT_ENDING = eINSTANCE.getRelation_RightEnding();

    /**
     * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.RelationEndingImpl <em>Relation Ending</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.RelationEndingImpl
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getRelationEnding()
     * @generated
     */
    EClass RELATION_ENDING = eINSTANCE.getRelationEnding();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_ENDING__MULTIPLICITY = eINSTANCE.getRelationEnding_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_ENDING__NULLABLE = eINSTANCE.getRelationEnding_Nullable();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_ENDING__TARGET = eINSTANCE.getRelationEnding_Target();

    /**
     * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.AttributeType <em>Attribute Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.AttributeType
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getAttributeType()
     * @generated
     */
    EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

    /**
     * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.MultiplicityType <em>Multiplicity Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.MultiplicityType
     * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslPackageImpl#getMultiplicityType()
     * @generated
     */
    EEnum MULTIPLICITY_TYPE = eINSTANCE.getMultiplicityType();

  }

} //ERDiagramDslPackage
