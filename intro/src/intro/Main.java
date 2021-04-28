package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetBranchButton = "Ýnternet Þubeye Gir!";

		double dollarYesterday = 8.15;
		double dollarToday = 8.20;

		System.out.println(internetBranchButton);

		if (dollarToday < dollarYesterday) {
			System.out.println("Dolar düþtü görseli");
		} else if (dollarToday > dollarYesterday) {
			System.out.println("Dolar yükseldi görseli");
		} else {
			System.out.println("Dolar Eþittir görseli");
		}

		String[] credits = { 
				"Hýzlý Kredi",
				"Mutlu Emekli Kredisi", 
				"Konut Kredisi", 
				"Çiftçi Kredisi", 
				 };

		for (String credit : credits) {
			System.out.println(credit);
		}

		for (int i = 0; i < credits.length; i++) {
			System.out.println(credits[i]);
		}

		int number1 = 10;
		int number2 = 20;
		number1 = number2;
		number2 = 100;
		System.out.println(number1);

		int[] numbers1 = { 1, 2, 3, 4, 5 };
		int[] numbers2 = { 10, 20, 30, 40, 50 };
		numbers1 = numbers2;
		numbers2[0] = 100;
		System.err.println(numbers1[0]);

		String city1 = "Ankara";
		String city2 = "Kocaeli";
		city1 = city2;
		city2 = "Afyon";
		System.out.println(city1);

	}
}
