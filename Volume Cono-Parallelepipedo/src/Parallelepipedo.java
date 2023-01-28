
public class Parallelepipedo extends Figure {

	private double l;

	public Parallelepipedo(double l) {
		this.l = l;
	}

	@Override
	public double area() {

		return l * l;
	}

}
