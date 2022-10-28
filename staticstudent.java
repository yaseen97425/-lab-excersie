package Javaexamples;

public class staticstudent {
		int rollno;
		String name;
		static String college="Anudip";
		staticstudent(int r, String n){
			rollno=r;
			name=n;
		}
			void display (){System.out.println(rollno+" "+name+" "+college);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 staticstudent s1 = new staticstudent(111,"Karan");  
		 staticstudent s2 = new staticstudent(222,"Aryan");  
		 s1.display();  
		 s2.display();  
	}
		
}
		
