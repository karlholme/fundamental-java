package object.oriented.java.figures;

public class Square implements Figure {

	public int base;
	public Integer area = null;

	public Integer getArea() {
		area = base * base;
		return area;
	}

	public String toString(){
		return this.getClass().getName() + ", " + area;
	}

}
