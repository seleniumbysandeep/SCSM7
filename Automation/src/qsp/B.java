package qsp;

public class B {

	public static void main(String[] args) {
		
		A a1=new A(10);
		int x = a1.getValue();		//utilization
		System.out.println(x);	
		a1.setValue(30);            //utilization
		System.out.println(a1.getValue());
	}
}
