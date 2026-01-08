import java.util.*;
class A{
	int age;
	String name;
	public void read(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name and age :");
		name=s.nextLine();
		age=s.nextInt();
	}
	public void disp(){
		System.out.println("name :"+name);
		System.out.println("age  :"+age);
	}
}
class B extends A{
		Scanner s=new Scanner(System.in);
		int salary;
		public void read(){
			super.read();
			System.out.println("enter the salary :");
			salary=s.nextInt();
		}
		public void disp(){
			super.disp();
			System.out.println("salary :" +salary);
		}
		

		
}
class Functiono{
	public static void main(String args[]){
		A a=new A();
		B b=new B();
		a.read();
		b.read();
		a.disp();
		b.disp();
		
	}
}