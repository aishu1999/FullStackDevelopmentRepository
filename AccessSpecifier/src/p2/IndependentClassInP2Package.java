package p2;

import p1.Protection;

public class IndependentClassInP2Package {
	Protection o= new Protection();
	public IndependentClassInP2Package() {
		System.out.println("It is a class Constructor!!");
	//	System.out.println("private_a :" +o.private_a);
	//	System.out.println("defalut_b :"+ o.defalut_b);
	//	System.out.println("protected_c :" +o.protected_c);
		System.out.println("public_d :"+o.public_d);
		
	}

}
