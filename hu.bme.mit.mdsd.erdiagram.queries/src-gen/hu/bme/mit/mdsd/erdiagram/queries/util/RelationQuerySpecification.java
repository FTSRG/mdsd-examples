package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.RelationMatch;
import hu.bme.mit.mdsd.erdiagram.queries.RelationMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RelationMatcher in a type-safe way.
 * 
 * @see RelationMatcher
 * @see RelationMatch
 * 
 */
@SuppressWarnings("all")
public final class RelationQuerySpecification extends BaseGeneratedEMFQuerySpecification<RelationMatcher> {
  private RelationQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RelationQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RelationMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RelationMatcher.on(engine);
  }
  
  @Override
  public RelationMatch newEmptyMatch() {
    return RelationMatch.newEmptyMatch();
  }
  
  @Override
  public RelationMatch newMatch(final Object... parameters) {
    return RelationMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Relation) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static RelationQuerySpecification INSTANCE = make();
    
    public static RelationQuerySpecification make() {
      return new RelationQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RelationQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.relation";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("r");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("r", "hu.bme.mit.mdsd.erdiagram.Relation"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_r = body.getOrCreateVariableByName("r");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_r, "r")
      		));
      		// 	Relation(r)
      		new TypeConstraint(body, new FlatTuple(var_r), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
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