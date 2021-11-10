import java.util.*;
class Student
{
 String USN;
 String name;
 int n;
 double SGPA=0;
 int total_credits=0;
 int credits[];
 double marks[];
Scanner sc=new Scanner(System.in);

void accept()
{
System.out.println("Enter Full Name of the Student");
name=sc.nextLine();
System.out.println("Enter the USN of the student:");
USN=sc.nextLine();
System.out.println("Enter number of subjects:");
n=sc.nextInt();
credits=new int[n];
marks=new double[n];
System.out.println("Enter details of the subjects:");
for(int i=0;i<n;i++)
{
System.out.println("Enter the credits for subject"+(i+1));
credits[i]=sc.nextInt();
System.out.println("Enter the marks for subject"+(i+1));
marks[i]=sc.nextInt();
calculate(credits[i],marks[i],i);
}
}
void calculate(int credit, double marks, int j)
{
total_credits=total_credits+credit;
if(marks>=90&& marks<=100)
{
SGPA=SGPA+(10*credit);
}
else if(marks>=80 && marks<=89)
{SGPA=SGPA+(9*credit);
}
else if(marks>=70 && marks<=79)
{
SGPA=SGPA+(8*credit);
}
else if(marks>=60 && marks<=69)
{
SGPA=SGPA+(7*credit);
}
else if(marks>=50 && marks<=59)
{
SGPA=SGPA+(6*credit);
}
else if(marks>=40 && marks<=49)
{
SGPA=SGPA+(5*credit);
}
else
{
System.out.println("Failed in Subject"+(j+1));
}
}
void display()
{
System.out.println("Details of the student:");
System.out.println("USN:"+USN);
System.out.println("name:"+ name);
System.out.println("SGPA of Student: "+(SGPA/total_credits));
}
}
class Students
{
public static void main(String args[])
{
Student s1=new Student();
s1.accept();
s1.display();
}
}
