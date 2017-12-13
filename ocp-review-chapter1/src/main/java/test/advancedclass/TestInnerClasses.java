package test.advancedclass;

import test.advancedclass.TestInnerClasses.A.D;
import test.advancedclass.TestInnerClasses.A.D.E;

public class TestInnerClasses {

	class A {
		private Integer element = 1;;
		
		class D{
			
			class E{
				
			}
		}
	}

	public void testMethod() {
		D d = new A().new D();
		E e = new A().new D().new E();
		
	}

	public static void main(String[] args) {
		TestInnerClasses test = new TestInnerClasses();
		A a = test.new A();
		
		System.out.println(a.element);
		
	}
}

interface TesteInterface{
	
	public void method();
}
