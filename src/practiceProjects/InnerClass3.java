package practiceProjects;

public class InnerClass3 {
	private int id=34;
	public static void main(String[] args) {
		//outer class
		System.out.println("OuterClass");
		//inner class
		class A{
			//create show method in inner class
			public void show() {
				System.out.println("show method is called");
			}

		}
		//object creation for innerclass
		A a=new A();
		a.show();
		InnerClass3 in3=new InnerClass3();
		in3.print();

	}
	//create one print method
	public void print() {
		System.out.println("print method is called");
		//create a class in method
		class b{
			int a=3;
			int b=7;
			int c=a+b;
		}

		System.out.println(new b().c);
	}
	//constructor
	public InnerClass3() {
		System.out.println("constructor");
		//create a class in constructor
		class c{
			public int sai() {
				return 7;
			}
		}
		System.out.println(new c().sai()); 
	}

	public void saiicon() {
		System.out.println("saiicon method is called");
	}

}  