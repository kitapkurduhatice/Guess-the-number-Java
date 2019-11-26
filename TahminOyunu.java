import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {

	private static int getRandomNumberInRange(int min, int max) 
	{

		
		if (min >= max)
		{
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();

		return r.nextInt((max - min) + 1) + min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min, max, tahmin, sayi;
		Scanner input = new Scanner(System.in);
		System.out.println("Tuttu�um say�y� bulabilecek misin?");
		System.out.print("Aral�k girin ( 100 999 gibi) : "); 
		min = input.nextInt();
		max = input.nextInt();
		//getRandomNumberInRange(min, max);
		
		System.out.println("Tahmin et:");
		tahmin = input.nextInt();
		sayi = getRandomNumberInRange(min, max);

		while (1 < 2)
		{

			if (tahmin < sayi)
			{
				System.out.println("Eksik s�yledin");
				System.out.println("Tahmin et:");
				tahmin = input.nextInt();

			}

			else if (tahmin > sayi) 
			{
				System.out.println("Fazla s�yledin");
				System.out.println("Tahmin et:");
				tahmin = input.nextInt();
			}

			else
			{
				System.out.println("Bravo bildin! Tuttu�um say� " + sayi + " idi.\nG�le g�le.. ");
				

			}
		}

	}
}
