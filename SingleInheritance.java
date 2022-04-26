package oops;

	class Father{
		void eat() {
			System.out.println("Father is eating");
		}
	}
	class Child extends Father{
		void sleep() {
			System.out.println("Child is sleeping");
		}
	}
	public class SingleInheritance {
		public static void main(String[] args) {
			
		
		Child ch = new Child();
		ch.eat();
		ch.sleep();
		
		}
	}
