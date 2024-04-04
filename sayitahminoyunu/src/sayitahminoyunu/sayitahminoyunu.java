package sayitahminoyunu;
import java.util.Random;
import java.util.Scanner;
public class sayitahminoyunu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int can =5;
		int yanlistahmin = 0;
		int sayi = rand.nextInt(100);
		int tahmin;
		String tahminler = " ";
		
		System.out.println("Sayı tahmin oyununa hoşgeldiniz!");
		while(can > 0) {
		System.out.println("0-99 bir sayı tahmin ediniz :");
		tahmin = input.nextInt();
		input.nextLine();
		tahminler += String.valueOf(tahmin)+ " ";
		if(tahmin<0 || tahmin > 100) {
			yanlistahmin ++;
		
		if(yanlistahmin % 2 == 0) {
			
			System.out.println("Kalan canınız :" + --can);
		}
		continue;
		}
		if(sayi == tahmin) {
			System.out.println("Tebrikler doğru bildiniz !");
			System.out.println("Tahminleriniz :" + tahminler);
			break;
		}
		else {
			can--;
			System.out.println("Yanlış tahmin !");
			System.out.println("Kalan canınız :" + can);
			if(tahmin > sayi) {
				System.out.println("Daha küçük bir sayı tahmin ediniz!");
			}
			else {
				System.out.println("Daha büyük bir sayı tahmin ediniz!");
			}
			continue;
		}
	}
		if(can ==0) {
		System.out.println("Oyunu kaybettiniz!");
		System.out.println("Tahminleriniz :" + tahminler);
		System.out.println("Doğru sayı :" + sayi);
		}
	}
}
