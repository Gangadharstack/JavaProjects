
public class Student 
{
	int StudentId;
	String StudentName;
	Course CourseObj;
	
	public Student()
	{
		StudentId=1001;
		StudentName="Gangadhar";	
        CourseObj=new Course("C1001","java","10000");
	}
	public void display()
	{
		System.out.println("StudentId:"+StudentId);
		System.out.println("StudentName:"+StudentName);
		
		CourseObj.showCourseDetail();
	}
	public static void main(String arg[])
	{
		Student Obj=new Student();
		Obj.display();
	}

}
