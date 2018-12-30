import java.util.Date;

/**
 * 
 */

/**
 * @author sammar
 *
 */
public class ImmutableClass {

	private String immutProp1;
	
	private String immutProp2;
	
	private int immutProp3;
	
	private Integer immutProp5;
	
	private Date immutProp4;
	
	private ImmutableClass(String immutProp1, String immutProp2, int immutProp3, Date immutProp4,Integer immutProp5) {
		this.immutProp1 = immutProp1;
		this.immutProp2 = immutProp2;
		this.immutProp3 = immutProp3;
		this.immutProp4 = immutProp4;
		this.immutProp5 = immutProp5;
	}

	public String getImmutProp1() {
		return immutProp1;
	}

	public String getImmutProp2() {
		return immutProp2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ImmutableClass [immutProp1=" + immutProp1 + ", immutProp2=" + immutProp2 + ", immutProp3=" + immutProp3
				+ ", immutProp5=" + immutProp5 + ", immutProp4=" + immutProp4 + "]";
	}

	public int getImmutProp3() {
		return immutProp3;
	}

	public Date getImmutProp4() {
		return new Date(immutProp4.getTime());
	}
	

	/**
	 * @return the immutProp5
	 */
	public Integer getImmutProp5() {
		return immutProp5;
	}
	/*public Date getImmutProp4() {
		return immutProp4;
	}*/
	
	public static ImmutableClass createInstance(String immutProp1, String immutProp2, int immutProp3, Date immutProp4, Integer immutProp5) {
		return new ImmutableClass(immutProp1, immutProp2, immutProp3, immutProp4,immutProp5);
	}
}
