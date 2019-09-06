package object.oriented.java;

import object.oriented.java.figures.Rectangle;
import object.oriented.java.figures.Figure;
import object.oriented.java.figures.Square;
import object.oriented.java.figures.Triangle;

import java.util.ArrayList;
import java.util.List;

public class SomeHelperClass {

	protected List<Figure> getFigures() {
		Square s1 = new Square();
		Square s2 = new Square();
		s1.base = 1;
		s2.base = 2;

		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		t1.base = new Double(1);
		t2.base = 2.0;

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.base = 1;
		r2.base = 2;

		List<Figure> list = new ArrayList<Figure>();
		list.add(s1);
		list.add(s2);
		list.add(t1);
		list.add(t2);
		list.add(r1);
		list.add(r2);

		return list;
	}
}
