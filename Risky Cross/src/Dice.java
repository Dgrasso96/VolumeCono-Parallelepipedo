import java.util.Random;

public class Dice extends Lucky {

	private int y, min = 1, max = 6;

	public Dice(int n) {

		this.max = this.max * n;
	}

	@Override
	public void launch() {

		Random random = new Random();

		y = (this.max - min) + 1;

		x = random.nextInt(y) + min;

	}

}
