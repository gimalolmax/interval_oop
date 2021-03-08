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

	// representation invariants a.k.a. private invariants
	/**
	 * @invar The width is nonnegative.
	 * 		| 0 <= width
	 */
	private int width;
	private int upperBound;

	// getters or inspector methods --> defines the class's abstract state space = set of possible abstract values(immutable)/states(mutable)
	// immutable class --> abstract value of an instance
	// mutable class --> current abstract state of an instance


	/**
	 * @basic 
	 */
	public int getLowerBound() {
		return upperBound - width;
	}

	/**
	 * @basic 
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * @post The result equals the upper bound minus the lower bound.
	 * 		| result == getUpperBound() - getLowerBound()
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * 
	 * @post The result is not null.
	 * 		| result != null
	 * @post The sequence of elements equals the sequence starting at the lower bound (inclusive) and ending at the upepr bound (inclusive).
	 * 		| Arrays.equals(result, IntStream.range(getLowerBound(), getUpperBound() + 1).toArray())
	 */

	public int[] getElements() {
		int[] result = new int[width + 1];
		for (int i = 0; i < width + 1; i++)
			result[i] = upperBound - width + i;
		return result;

		//return IntStream.range(upperBound-width, upperBound + 1).toArray();
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
		this.width = upperBound-lowerBound;
		this.upperBound = upperBound;

	}

	//no mutators --> no methods that  change the object's abstract state --> immutabel class

}
