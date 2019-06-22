package task;

final class Circle {
	static double r;
	int num =10;
	void area(int num){
		System.out.println(num);
	}
	public static void main(String[] args) {
		Circle c1 = new Circle();
		r=2.5;
		System.out.println(3.14*r*r);
		c1.num =20;
		int a = c1.num ;
		c1.area(a);
		
		
	}
}
