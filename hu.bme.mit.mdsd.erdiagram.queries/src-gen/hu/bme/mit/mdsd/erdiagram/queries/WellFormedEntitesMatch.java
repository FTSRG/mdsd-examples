package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.queries.util.WellFormedEntitesQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.wellFormedEntites pattern,
 * to be used in conjunction with {@link WellFormedEntitesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WellFormedEntitesMatcher
 * @see WellFormedEntitesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WellFormedEntitesMatch extends BasePatternMatch {
  private static List<String> parameterNames = makeImmutableList();
  
  private WellFormedEntitesMatch() {
    
  }
  
  @Override
  public Object get(final String parameterName) {
    return null;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    return false;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.wellFormedEntites";
  }
  
  @Override
  public List<String> parameterNames() {
    return WellFormedEntitesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{};
  }
  
  @Override
  public WellFormedEntitesMatch toImmutable() {
    return isMutable() ? newMatch() : this;
  }
  
  @Override
  public String prettyPrint() {
    return "[]";
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof WellFormedEntitesMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    return true;
  }
  
  @Override
  public WellFormedEntitesQuerySpecification specification() {
    try {
    	return WellFormedEntitesQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static WellFormedEntitesMatch newEmptyMatch() {
    return new Mutable();
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WellFormedEntitesMatch newMutableMatch() {
    return new Mutable();
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @return the (partial) match object.
   * 
   */
  public static WellFormedEntitesMatch newMatch() {
    return new Immutable();
  }
  
  private static final class Mutable extends WellFormedEntitesMatch {
    Mutable() {
      super();
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WellFormedEntitesMatch {
    Immutable() {
      super();
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
