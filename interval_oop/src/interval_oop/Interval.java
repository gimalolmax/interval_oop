package interval_oop;

import java.util.Arrays;
import java.util.stream.IntStream;
/**
 *abstract state invariants: (a.k.a public invariants)
 *
 * @invar The width is nonnegative.
 * 		| getLowerBound() <= getUpperBound()
 * 
 * @immutable
 */
public class Interval {

	// getters or inspector methods --> defines the class's abstract state space = set of possible abstract values(immutable)/states(mutable)
	// immutable class --> abstract value of an instance
	// mutable class --> current abstract state of an instance


	/**
	 * @basic 
	 */
	public int getLowerBound() {
		throw new RuntimeException("not implemented yet");
	}

	/**
	 * @basic 
	 */
	public int getUpperBound() {
		throw new RuntimeException("not implemented yet");
	}

	/**
	 * @post The result equals the upper bound minus the lower bound.
	 * 		| result == getUpperBound() - getLowerBound()
	 */
	public int getWidth() {
		throw new RuntimeException("not implemented yet");
	}

	/**
	 * 
	 * @post The result is not null.
	 * 		| getElements() != null
	 * @post The sequence of elements equals the sequence starting at the lower bound (inclusive) and ending at the upepr bound (inclusive).
	 * 		| Arrays.equals(getElements(), IntStream.range(getLowerBound(), getUpperBound() + 1).toArray())
	 */

	public int[] getElements() {
		throw new RuntimeException("not implemented yet");
	}

	/**
	 * Initializes this object so that it represents the interval
	 * specified by the given lower and upper bound.
	 * 
	 * @pre The given lower bound is not greater than the given upper bound.
	 * 		| lowerBound <= upperBound
	 * @post This intervals lowerbound equals the given lower bound.
	 * 		| getLowerBound() == lowerBound
	 * @post This intervals upper bound equals the given uper bound.
	 * 		| getUpperBound() == upperBound
	 */
	public Interval(int lowerBound, int upperBound) {
		throw new RuntimeException("not implemented yet");
	}

	//no mutators --> no methods that  change the object's abstract state --> immutabel class

}
