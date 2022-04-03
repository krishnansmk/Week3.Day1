package week3.day1assignments;

public class Students 
{
	public void getStudentinfo()
	{
		System.out.println("From normal getstudentinfo method");
	}
	public void getStudentinfo(int studid)
	{
		System.out.println("Student ID received is.."+studid);
	}
	public void getStudentinfo(int studid, String name)
	{
		System.out.println("Student information received is..Student ID :"+studid+" & Student name : "+name);
	}
	
	public static void main(String[] args) 
	{
		Students obj=new Students();
		obj.getStudentinfo();
		obj.getStudentinfo(12345);
		obj.getStudentinfo(6789, "Mohanakrishnan");
	}

}
