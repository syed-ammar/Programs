
public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private int empAge;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public int compareTo(Employee arg1) {
		int i = this.getEmpAge() - arg1.getEmpAge();
		if(i!=0){
			return i;
		}
		
		if(!this.getEmpName().equals(arg1.getEmpName())){
			return -1;
		}
		
		return this.getEmpId() - arg1.getEmpId();
		
	}
	
}
