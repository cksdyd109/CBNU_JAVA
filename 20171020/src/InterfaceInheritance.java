interface c1
{
	void method1();
	void method2();
}
interface c2
{
	void method3();
}

interface c3 extends c1,c2
{
	void method4();
}

class C implements c3
{
	public void method1()
	{
		System.out.println("method1()메소드의 구현");
	}
	public void method2()
	{
		System.out.println("method2()메소드의 구현");
	}
	public void method3()
	{
		System.out.println("method3()메소드의 구현");
	}
	public void method4()
	{
		System.out.println("method4()메소드의 구현");
	}
}

public class InterfaceInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
     	obj.method1();
     	obj.method2();
     	obj.method3();
     	obj.method4();

	}

}
