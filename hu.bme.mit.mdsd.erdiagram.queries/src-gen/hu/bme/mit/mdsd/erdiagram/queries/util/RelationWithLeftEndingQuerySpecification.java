package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithLeftEndingMatch;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithLeftEndingMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RelationWithLeftEndingMatcher in a type-safe way.
 * 
 * @see RelationWithLeftEndingMatcher
 * @see RelationWithLeftEndingMatch
 * 
 */
@SuppressWarnings("all")
public final class RelationWithLeftEndingQuerySpecification extends BaseGeneratedEMFQuerySpecification<RelationWithLeftEndingMatcher> {
  private RelationWithLeftEndingQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RelationWithLeftEndingQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RelationWithLeftEndingMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RelationWithLeftEndingMatcher.on(engine);
  }
  
  @Override
  public RelationWithLeftEndingMatch newEmptyMatch() {
    return RelationWithLeftEndingMatch.newEmptyMatch();
  }
  
  @Override
  public RelationWithLeftEndingMatch newMatch(final Object... parameters) {
    return RelationWithLeftEndingMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Relation) parameters[0], (hu.bme.mit.mdsd.erdiagram.RelationEnding) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static RelationWithLeftEndingQuerySpecification INSTANCE = make();
    
    public static RelationWithLeftEndingQuerySpecification make() {
      return new RelationWithLeftEndingQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RelationWithLeftEndingQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.relationWithLeftEnding";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("r","rle");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("r", "hu.bme.mit.mdsd.erdiagram.Relation"),new PParameter("rle", "hu.bme.mit.mdsd.erdiagram.RelationEnding"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_r = body.getOrCreateVariableByName("r");
      		PVariable var_rle = body.getOrCreateVariableByName("rle");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_r, "r"),
      		   new ExportedParameter(body, var_rle, "rle")
      		));
      		// 	Relation.leftEnding(r, rle)
      		new TypeConstraint(body, new FlatTuple(var_r), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_r, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "leftEnding")));
      		new Equality(body, var__virtual_0_, var_rle);
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
