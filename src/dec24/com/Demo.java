package dec24.com;

public class Demo {
	int a,b,c;
	double x,y,z;
public void add() { //nonstatic method
	a=100;
	b=80;
	c=a+b;
	System.out.println(c);
}
public void floating() {
	x=134;
	y=3;
	z=x/y;
	System.out.println(z);
}

	public static void main(String[] args) {
		//creating reference objec tfor non static
		Demo d=new Demo();
		d.add();
		d.floating();
		
		
		

	}

}
