package edu.pitt.lab9;

public class Lab9 {

	public static void main(String[] args) {

		// Circle
		Circle c1 = new Circle();
		Circle c2 = new Circle(4);
		Circle c3 = new Circle(9, "White");

		System.out.println(c1.getRadius());
		System.out.println(c1.getColor());
		System.out.println(c1.getArea());
		System.out.println();

		System.out.println(c2.getRadius());
		System.out.println(c2.getColor());
		System.out.println(c2.getArea());
		System.out.println();

		System.out.println(c3.getRadius());
		System.out.println(c3.getColor());
		System.out.println(c3.getArea());
		System.out.println();

		c1.setRadius(10);
		c1.setColor("Ultramarine");

		System.out.println(c1.getRadius());
		System.out.println(c1.getColor());
		System.out.println(c1.getArea());
		System.out.println();
		System.out.println();
		System.out.println();

		// Cylinder
		Cylinder cyl1 = new Cylinder();
		Cylinder cyl2 = new Cylinder(4, 20);
		Cylinder cyl3 = new Cylinder(6, 9, "Orange");

		System.out.println(cyl1.getRadius());
		System.out.println(cyl1.getColor());
		System.out.println(cyl1.getArea());
		System.out.println(cyl1.getHeight());
		System.out.println(cyl1.getVolume());
		System.out.println();

		System.out.println(cyl2.getRadius());
		System.out.println(cyl2.getColor());
		System.out.println(cyl2.getArea());
		System.out.println(cyl2.getHeight());
		System.out.println(cyl2.getVolume());
		System.out.println();

		System.out.println(cyl3.getRadius());
		System.out.println(cyl3.getColor());
		System.out.println(cyl3.getArea());
		System.out.println(cyl3.getHeight());
		System.out.println(cyl3.getVolume());
		System.out.println();

		cyl1.setRadius(4.3);
		cyl1.setColor("Ultramarine");
		cyl1.setHeight(6.9);

		System.out.println(cyl1.getRadius());
		System.out.println(cyl1.getColor());
		System.out.println(cyl1.getArea());
		System.out.println(cyl1.getHeight());
		System.out.println(cyl1.getVolume());
		System.out.println();

		// Student
		Student stu = new Student("Krishna K.", "Sutherland West 211", "Biochemistry", 1, 28000);

		System.out.println(stu.toString());

		stu.setAddress("Cupertino");
		stu.setFee(20000);
		stu.setName("Krishna Katakota");
		stu.setProgram("Computer Science");
		stu.setYear(3);

		System.out.println(stu.toString());

		// Staff
		Staff s = new Staff("Krishna K.", "158 Redstone Dr.", 120000.00);

		System.out.println(s.toString());

		s.setSchool("University of Pittsburgh");

		System.out.println(s.toString());

	}
}