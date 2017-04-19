/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.OtherEndingMatch;
import hu.bme.mit.mdsd.erdiagram.queries.OtherEndingMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate OtherEndingMatcher in a type-safe way.
 * 
 * @see OtherEndingMatcher
 * @see OtherEndingMatch
 * 
 */
@SuppressWarnings("all")
public final class OtherEndingQuerySpecification extends BaseGeneratedEMFQuerySpecification<OtherEndingMatcher> {
  private OtherEndingQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static OtherEndingQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected OtherEndingMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OtherEndingMatcher.on(engine);
  }
  
  @Override
  public OtherEndingMatcher instantiate() throws ViatraQueryException {
    return OtherEndingMatcher.create();
  }
  
  @Override
  public OtherEndingMatch newEmptyMatch() {
    return OtherEndingMatch.newEmptyMatch();
  }
  
  @Override
  public OtherEndingMatch newMatch(final Object... parameters) {
    return OtherEndingMatch.newMatch((hu.bme.mit.mdsd.erdiagram.RelationEnding) parameters[0], (hu.bme.mit.mdsd.erdiagram.RelationEnding) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link OtherEndingQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link OtherEndingQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static OtherEndingQuerySpecification INSTANCE = new OtherEndingQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static OtherEndingQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEnding = new PParameter("ending", "hu.bme.mit.mdsd.erdiagram.RelationEnding", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "RelationEnding")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOther = new PParameter("other", "hu.bme.mit.mdsd.erdiagram.RelationEnding", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "RelationEnding")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEnding, parameter_pOther);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.otherEnding";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ending","other");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_ending = body.getOrCreateVariableByName("ending");
      		PVariable var_other = body.getOrCreateVariableByName("other");
      		PVariable var_relation = body.getOrCreateVariableByName("relation");
      		new TypeConstraint(body, new FlatTuple(var_ending), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
      		new TypeConstraint(body, new FlatTuple(var_other), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_ending, parameter_pEnding),
      		   new ExportedParameter(body, var_other, parameter_pOther)
      		));
      		// 	Relation.leftEnding(relation, ending)
      		new TypeConstraint(body, new FlatTuple(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_relation, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "leftEnding")));
      		new Equality(body, var__virtual_0_, var_ending);
      		// 	Relation.rightEnding(relation, other)
      		new TypeConstraint(body, new FlatTuple(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_relation, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "rightEnding")));
      		new Equality(body, var__virtual_1_, var_other);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_ending = body.getOrCreateVariableByName("ending");
      		PVariable var_other = body.getOrCreateVariableByName("other");
      		PVariable var_relation = body.getOrCreateVariableByName("relation");
      		new TypeConstraint(body, new FlatTuple(var_ending), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
      		new TypeConstraint(body, new FlatTuple(var_other), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_ending, parameter_pEnding),
      		   new ExportedParameter(body, var_other, parameter_pOther)
      		));
      		// 	Relation.rightEnding(relation, ending)
      		new TypeConstraint(body, new FlatTuple(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_relation, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "rightEnding")));
      		new Equality(body, var__virtual_0_, var_ending);
      		// 	Relation.leftEnding(relation, other)
      		new TypeConstraint(body, new FlatTuple(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_relation, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "leftEnding")));
      		new Equality(body, var__virtual_1_, var_other);
      		bodies.add(body);
      	}
      	{
      		PAnnotation annotation = new PAnnotation("QueryBasedFeature");
      		addAnnotation(annotation);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
