
public class SalariedEmployee extends Employee 
{
	int salary;
	
	public SalariedEmployee()
	{
		EmployeeId=1001;
		EmployeeName="gangadhar";
		salary=2400;
    }
	public void showDetail() 
	{
     System.out.println("EmployeeId:"+EmployeeId);
     System.out.println("EmployeeName:"+EmployeeName);
     System.out.println("salary:"+salary);
   }
	public static void main(String arg[])
	{
		SalariedEmployee employeeObj=new SalariedEmployee();
		employeeObj.showDetail();
	}
}
