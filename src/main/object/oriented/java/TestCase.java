package object.oriented.java;

import object.oriented.java.figures.Figure;
import java.util.List;

public class TestCase {

	public static void main(String[] args) {
		SomeHelperClass someHelperClass = new SomeHelperClass();
		List<Figure> figures = someHelperClass.getFigures();
	}
}
