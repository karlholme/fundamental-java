package object.oriented.java.figures;

public class Triangle implements Figure {

	public Double base;
	public Long height;
	public Double area = null;

	public Double getArea() {
		area = base * height / 2;
		return area;
	}

	public String toString(){
		return this.getClass().getName() + ", " + area;
	}

}
