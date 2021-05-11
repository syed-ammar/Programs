import java.util.Date;

/**
 * 
 */

/**
 * @author sammar
 *
 */
public class ImmutableClassMain {
	public static void main(String[] args) {
		ImmutableClass im1 = ImmutableClass.createInstance("Hi", "Syed", 23, new Date(), new Integer(5));
		System.out.println(im1);
		im1.getImmutProp4().setYear(2012);
		System.out.println(im1);
	}
}
