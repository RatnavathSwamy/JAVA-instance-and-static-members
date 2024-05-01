
/*instancestaticmember main class*/
package com.in.sts;

public class Mein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fun b=new Fun();   //object created only to access instace member
		System.out.println(b.a);
		b.get();   //accessed through objects
	
		Fun.meth();   //accessed through class name
		
		

	}

}
