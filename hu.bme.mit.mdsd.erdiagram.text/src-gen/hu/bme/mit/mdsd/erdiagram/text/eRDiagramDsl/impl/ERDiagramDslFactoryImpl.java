/**
 * generated by Xtext 2.20.0
 */
package hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl;

import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ERDiagramDslFactoryImpl extends EFactoryImpl implements ERDiagramDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ERDiagramDslFactory init()
  {
    try
    {
      ERDiagramDslFactory theERDiagramDslFactory = (ERDiagramDslFactory)EPackage.Registry.INSTANCE.getEFactory(ERDiagramDslPackage.eNS_URI);
      if (theERDiagramDslFactory != null)
      {
        return theERDiagramDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ERDiagramDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ERDiagramDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ERDiagramDslPackage.ER_DIAGRAM: return createERDiagram();
      case ERDiagramDslPackage.ENTITY: return createEntity();
      case ERDiagramDslPackage.ATTRIBUTE: return createAttribute();
      case ERDiagramDslPackage.RELATION: return createRelation();
      case ERDiagramDslPackage.RELATION_ENDING: return createRelationEnding();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ERDiagramDslPackage.ATTRIBUTE_TYPE:
        return createAttributeTypeFromString(eDataType, initialValue);
      case ERDiagramDslPackage.MULTIPLICITY_TYPE:
        return createMultiplicityTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ERDiagramDslPackage.ATTRIBUTE_TYPE:
        return convertAttributeTypeToString(eDataType, instanceValue);
      case ERDiagramDslPackage.MULTIPLICITY_TYPE:
        return convertMultiplicityTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERDiagram createERDiagram()
  {
    ERDiagramImpl erDiagram = new ERDiagramImpl();
    return erDiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationEnding createRelationEnding()
  {
    RelationEndingImpl relationEnding = new RelationEndingImpl();
    return relationEnding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue)
  {
    AttributeType result = AttributeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicityType createMultiplicityTypeFromString(EDataType eDataType, String initialValue)
  {
    MultiplicityType result = MultiplicityType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMultiplicityTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERDiagramDslPackage getERDiagramDslPackage()
  {
    return (ERDiagramDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ERDiagramDslPackage getPackage()
  {
    return ERDiagramDslPackage.eINSTANCE;
  }

} //ERDiagramDslFactoryImpl
