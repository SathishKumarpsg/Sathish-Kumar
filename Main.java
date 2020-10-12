import java.io.*;
class Employee
{
String name = "Saurab",city = "Channel";
int age = 23;
void show_Employee_Details()
{
   System.out.println("The name is " + name);
   System.out.println("The age is " + age);
   System.out.println("The city is " + city);
}
}
class Main
{
public static void main(String args[])
{
Employee em = new Employee();
em.show_Employee_Details();
}

}