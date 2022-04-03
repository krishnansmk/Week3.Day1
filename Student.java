package week3.org.student;

import week3.org.department.Department;

public class Student extends Department
{
	void studentName()
	{
		System.out.println("Displayed from studentName() inside Student class");
	}
	public void studentDept()
	{
		System.out.println("Displayed from studentDepartment() inside Student class");
	}
	public void studentId()
	{
		System.out.println("Displayed from studentId() inside Student class");
	}
	public static void main(String[] args) 
	{
		Student stu=new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
	}

}
