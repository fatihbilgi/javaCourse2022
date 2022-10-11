package youtubeDemo_;

public class MilitaryCreditManager implements BaseCreditManager, ICreditManager {
	@Override
	public void Calculate() {
		System.out.println("Asker kredisi hesaplandı.");
	}

}
