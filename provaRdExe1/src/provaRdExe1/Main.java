package provaRdExe1;

public class Main {

	public static void main(String[] args) {

		int listNumbers[] = { 1, 2, 5, 8, 9 };

		for (int i = 0; i < listNumbers.length; i++) {
			System.out.print(listNumbers[i]);
			if (i != 0) {
				if (listNumbers[i - 1] + 1 == listNumbers[i]) {
					System.out.println(" ");
				} else {
					System.out.println(" não é sequencial");
				}
			} else {
				System.out.println(" ");
			}
		}
	}

}
