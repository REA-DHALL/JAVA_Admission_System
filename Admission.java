import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.lang.String;
 class Student{
private String name;
private String fatherName;
private String motherName;
private int age;
private int percentage;
private String email;
private String query;
Scanner B= new Scanner(System.in);
Student(){}
Student(String n,String f,String m,int a, int p){
name=n;
fatherName=f;
motherName=m;
age=a;
percentage=p;
}
void register(){
this.getData();
this.displayData();
}
void Enquiry(){
System.out.println("Name:");
name=B.next();
System.out.println("Email:");
email=B.next();
System.out.println("Query:");
query =B.next();
this.queryWrite();
System.exit(0);
}
void queryWrite(){
try{
FileWriter fw=new FileWriter("abc.txt",true);
BufferedWriter bf=new BufferedWriter(fw);
bf.write(name);
bf.newLine();
bf.write(email);
bf.newLine();
bf.write(query);
bf.newLine();
bf.close();
}
catch(IOException e){
System.out.println(e);
}
}
void getData(){
System.out.println("Enter Your Details\n");
System.out.println("Name:");
name=B.next();
System.out.println("Father's Name:");
fatherName=B.next();
System.out.println("Mother's Name:");
motherName=B.next();
System.out.println("Age:");
age=B.nextInt();
try{
if (age < 18){
throw new ArithmeticException();
}
}
catch(ArithmeticException e){
System.out.println("\nInvalid Age\n");
System.exit(0);}
System.out.println("Percentage:");
percentage=B.nextInt();
this.writeData();
}

void displayData(){
System.out.println("Name:"+ name);
System.out.println("Father's Name:"+ fatherName);
System.out.println("Mother's Name:"+ motherName);
System.out.println("Age:"+ age);
System.out.println("Percentage:"+ percentage);
System.exit(0);
}
void writeData(){
try{
FileWriter fw=new FileWriter("data.txt",true);
BufferedWriter bf=new BufferedWriter(fw);
bf.write(name);
bf.newLine();
bf.write(fatherName);
bf.newLine();
bf.write(motherName);
bf.newLine();
String str1= Integer.toString(age);
bf.write(str1);
bf.newLine();
str1 = Integer.toString(percentage);
bf.write(str1);
bf.newLine();
bf.close();
}
catch(IOException e){
System.out.println(e);
}
}
private class Course{
public void courseDetail(){ 
System.out.println("Courses\n");
System.out.println("1.MANAGEMENT\n2.INFORMATION TECHNOLOGY\n3.LAW\n4.FINE ARTS\n");
}
}
void displayCourse(){ Course c= new Course();
c.courseDetail();
System.exit(0); }
}

class Admission{

public static void main(String [] args){
Student s1=new Student();
       while(true){
       System.out.println("*******WELCOME FOR ADMISSION*********\n");
System.out.println("\n1. REGISTER\n2. ENQUIRY\n3.COURSE DETAIL\n4.Exit\n");
Scanner s= new Scanner(System.in);
int n=s.nextInt();
switch(n){
case 1: s1.register();
break;
case 2: s1.Enquiry();
break;
case 3: s1.displayCourse();
break;
case 4:System.exit(0);
break;
default:
System.out.println("Invalid Entry");
            }
           }
          }

         }
