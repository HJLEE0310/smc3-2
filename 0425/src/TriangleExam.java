
public class TriangleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(10.2, 17.3);
		
		System.out.println(t.area());
		
		t.change_l(7.5);
		t.change_h(9.2);
		
		System.out.println(t.area());
	}

}

class Triangle {
	double l;
	double h;
	
	public Triangle(double l, double h) {
		this.l = l;
		this.h = h;
	}
	
	public void change_l(double l) {
		this.l = l;
	}
	
	public void change_h(double h) {
		this.h = h;
	}
	
	public double area() {
		return l*h/2;
	}
}