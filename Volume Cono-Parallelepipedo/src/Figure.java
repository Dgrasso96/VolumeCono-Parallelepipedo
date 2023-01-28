
public abstract class Figure {

	abstract double area();

	public double volume(double h) {

		return area() * h;
	}

}
