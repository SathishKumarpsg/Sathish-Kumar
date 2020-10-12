import java.io.*;
import java.util.*;
public class Employees
{
	int db,mb,yb;
	float sal;
	String name;
	public static void main(String args[])
	{
		Employees emp = new Employees();
		emp.showDetails();
	}
	public void showDetails()
	{
		Scanner sc = new Scanner(System.in);
		int db,mb,yb;
		double sal,tax;
		String name;
		System.out.println("Enter your name : ");
		name = sc.next();
		System.out.println("Enter your birth date : ");
		db = sc.nextInt();
		System.out.println("Enter your birth month : ");
		mb = sc.nextInt();
		System.out.println("Enter your birth year : ");
		yb = sc.nextInt();
		System.out.println("Enter your monthly salary: ");
		sal = sc.nextDouble();
		sal = sal*12;	
	
		if(sal >= 500000)
		{
			tax = sal*0.20;
			System.out.println("name = " + name + "	 birth date = " + db + "  birth month = " + mb + "  birth year = " + yb + "  salary = " + sal + "  tax = " + tax);
		}
		else if(sal >=400000 && sal <=499999)
		{
			tax = sal *0.15;
			System.out.println("name = " + name + "  birth date = " + db + "  birth month = " + mb + "  birth year = " + yb + "  salary = " + sal + "  tax = " + tax);
		}
		else if(sal >=300000 && sal <=399999)
		{
			tax = sal *0.10;
			System.out.println("name = " + name + "  birth date = " + db + "  birth month = " + mb + "  birth year = " + yb + "  salary = " + sal + "  tax = " + tax);
		}
		else if(sal <= 200000)
		{
			tax = sal *0.05;
			System.out.println("name = " + name + "  birth date = " + db + "  birth month = " + mb + "  birth year = " + yb + "  salary = " + sal + "  tax = " + tax);
		}
	}
}