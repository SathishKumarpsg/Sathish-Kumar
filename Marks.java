import java.util.Scanner;
class Marks
{
public static void main(String args[])
{
int m1,m2,m3,m4,m5,total;
double percentage;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the five subject marks");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
m5=sc.nextInt();
total = m1+m2+m3+m4+m5;
System.out.println(" Total marks are " + total);
percentage = (total/500.0)*100;
System.out.println(" Total percentage is " + percentage);
if(percentage>=91 && percentage<=100)
{
System.out.println("Grade - O ");
}
else if(percentage>=81 && percentage<=90 )
{
System.out.println("Grade - A ");
}
else if(percentage>=71 && percentage<=60)
{
System.out.println("Grade - B  ");
}
else if(percentage>=61 && percentage<=70)
{
System.out.println("Grade - C  ");
}
else if(percentage>=51 && percentage<=60)
{
System.out.println("Grade - D  ");
}
else if(percentage>=35 && percentage<=50)
{
System.out.println("Grade - E  ");
}
else
{
System.out.println("Fail ");
}
}
}
