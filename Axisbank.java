package week3.day1assignments;

public class Axisbank extends Bankinfo
{	
	public void deposit()
	{
		System.out.println("Displayed from deposit method inside Axisbank class");
	}
	public static void main(String[] args) 
	{
		Axisbank cpy=new Axisbank();
		cpy.deposit();
	}

}
