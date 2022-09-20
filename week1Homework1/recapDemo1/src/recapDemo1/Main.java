package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 29;
		int sayi2 = 25;
		int sayi3 = 2;
		//Benim çözümüm
		/*
		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("Sayı 1 en büyüktür.");
		}
		else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("Sayı 2 en büyüktür");
		}
		else {
			System.out.println("Sayı 3 en büyüktür");
		}
		*/
		
		// Engin Hocanın Çözümü
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = "+enBuyuk);

	}

}
