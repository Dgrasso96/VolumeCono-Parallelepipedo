import java.util.Random;

public class Coin extends Lucky {

	@Override
	public void launch() {

		Random random = new Random();

		x = random.nextInt(2);

	}

}
