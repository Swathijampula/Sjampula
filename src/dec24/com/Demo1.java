package dec24.com;

public class Demo1 {
	static int a,b,c;
	static double x,y,z;
public static void  mul() { //static method
	a=125;
	b=5;
	c=a*b;
	System.out.println(c);
}
public static void  division() { //static method
	x=456;
	y=5;
	z=x/y;
	System.out.println(z);
}


	public static void main(String[] args) { //main method
		Demo1.mul();
		Demo1.division();
		

	}

}
