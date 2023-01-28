public class Cono extends Figure {

	private double r;

	public Cono(double r) {

		this.r = r;
	}

	@Override
	public double area() {

		return r * r * Math.PI;
	}

}
