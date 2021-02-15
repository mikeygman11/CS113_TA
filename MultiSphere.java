package cs113;

public class MultiSphere {
	
	public static void main(String[] args) {
		
		Sphere a = new Sphere(7.8);
		Sphere b = new Sphere(1);
		Sphere c = new Sphere(2);
		Sphere d = new Sphere(5);
		System.out.println(a.getDiameter());
		a.setDiameter(10);
		System.out.println(a.getDiameter());
		System.out.println(a.volume());
		
	}

}
