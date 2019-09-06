package object.oriented.java.figures;

public class Square implements Figure {

	public Integer base;
	public Double area = null;

	public Double getArea() {
		area = Double.valueOf(base * base);
		return area;
	}

	public String toString(){
		return this.getClass().getName() + ", " + area;
	}

}
