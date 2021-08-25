package javalang;

public class Employee
{
	 int employeeId;
	 String employeeName;
	 
	 public Employee() {
		 employeeId=1001;
		 employeeName="ganges";
		 
	 }
	 public static void main(String arg[])
	 {
		 Employee employeeObj=new Employee();
		 System.out.println(employeeObj);
	 }

}
