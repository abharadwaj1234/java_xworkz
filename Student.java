class Student{

String name;
int rollNumber;
String collegeName;
String branch;

void reading(){
System.out.println(name+""+collegeName+""+rollNumber+""+branch+ "student is reading..");
}

void singing(){
System.out.println(name+""+collegeName+""+rollNumber+""+branch+ "student is singing..");
}

public static void main(String args[])
{
Student Abhishek = new Student();
Abhishek.name = "Abhishek";
Abhishek.rollNumber = 1;
Abhishek.collegeName = "APS";
Abhishek.branch = "IT";
Abhishek.reading();
Abhishek.singing();

Student Jyothi = new Student();
Jyothi.name = "Jyothi";
Jyothi.rollNumber = 2;
Jyothi.collegeName = "JSS";
Jyothi.branch = "CS";
Jyothi.reading();
Jyothi.singing();

Student Sumukh = new Student();
Sumukh.name = "Sumukh";
Sumukh.rollNumber = 3;
Sumukh.collegeName = "Reva";
Sumukh.branch = "IS";
Sumukh.reading();
Sumukh.singing();

}
}






