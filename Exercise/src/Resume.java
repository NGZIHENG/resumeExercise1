
import java.util.*;

public class Resume {

	public static void main(String[] args) {
		printName();
		
		printAge();
		
		printCGPA();
		
		printGrade();
		
		printTotalGPA();
		
		printSkill();
		}
		
		public static void printName() {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter your name:");
			String name = in.next();
			System.out.println("Name:" + name);
		}
		
		public static void printAge() {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter your age:");
			int age = in.nextInt();
			System.out.println("Age:" + age);
		}
		
		public static void printCGPA() {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter your CGPA:");
			double cgpa=in.nextDouble();
			System.out.println("CGPA:" + cgpa); 
		}
		
		public static void printGrade() {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter your grade:");
			String str=in.next();
			char grade=str.charAt(1);
			System.out.println("Grade:" + grade);
		}
		
		public static void printTotalGPA() {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter GPA Semester 1:");
			double num1=in.nextDouble();
			System.out.print("Enter GPA Semester 2:");
			double num2=in.nextDouble();
			
			double sum=num1+num2;
			double totalgpa=sum/2;
			System.out.println("CGPA for current semester:" + totalgpa);
		}
		public static void printSkill() {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter Professional Skill:");
			String skill=in.next();
			System.out.println("Professional Skill:" + skill);
			
		}

}
