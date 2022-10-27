package Javaexamples;
import java.util.Scanner;
public class unaryop {

	  public static void main(String ar[])
	    {
	        int collab,qwerty,asdfg;
	        Scanner s=new Scanner(System.in);
	        System.out.println("\n Enter the name:");
	        String n=s.nextLine();
	        System.out.println("\n Enter the roll");
	        int no=s.nextInt();
	        System.out.println("\n Enter the age");
	        int a=s.nextInt();
	        System.out.println("Enter 2 sub marks: ");
	        int m1=s.nextInt();
	        int m2=s.nextInt();

	        int t= m1+m2;
	        int av=t/2;
	        int p=(t*100)/200;

	        System.out.println("\t \t \t ---Student Details---");
	        System.out.println("\t Name: "+n);
	        System.out.println("\t Roll No: "+no);
	        System.out.println("\t Age: "+a);
	        System.out.println("\t Marks-1: "+m1);
	        System.out.println("\t Marks-2: "+m2);
	        System.out.println("\t Total: "+t);
	        System.out.println("\t Average: "+av);
	        System.out.println("\t Percentage: "+p+"%");

	}

}
