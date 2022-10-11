package youtubeDemo_;

public class TeacherCreditManager implements BaseCreditManager, ICreditManager {
	@Override
	public void Calculate() {
		System.out.println("Öğretmen kredisi hesaplandı.");
	}

}
