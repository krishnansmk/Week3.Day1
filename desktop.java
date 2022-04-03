package week3.day1assignments;

public class desktop extends Computer
{

	public void desktopSize()
	{
		System.out.println("Displayed from desktopSize() inside desktop class");
	}
	public static void main(String[] args) 
	{
		desktop desk=new desktop();
		desk.computerModel();
		desk.desktopSize();
	}

}
