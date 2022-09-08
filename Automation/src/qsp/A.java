package qsp;

public class A {
	
private int i;     //declartion

public A(int k) {
	i=k;			//initialisation
}

public int getValue() {      //giving only read acces
	return i;
	}

public void setValue(int j) {	//giving write access
	i=j;
	}
}
