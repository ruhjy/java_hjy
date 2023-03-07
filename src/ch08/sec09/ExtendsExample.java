package ch08.sec09;

public class ExtendsExample {
	public static void main(String[] args) {

		InterfaceCImpl impl = new InterfaceCImpl();

		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB(); // methodB() is undefined for the type InterfaceA
		System.out.println();

		InterfaceB ib = impl;
//		ib.methodA(); // methodA() is undefined for the type InterfaceB
		ib.methodB();
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
