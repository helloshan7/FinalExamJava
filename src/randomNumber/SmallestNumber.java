package randomNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] randomNumbers = generateRandomNumbers(500);

		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();

		int nthSmallest = findSmallestNumber(randomNumbers, n);

		System.out.println("The " + n + "th smallest number is: " + nthSmallest);
	}

	public static int[] generateRandomNumbers(int count) {

		Random random = new Random();
		int[] numbers = new int[count];

		for (int i = 0; i < count; i++) {
			numbers[i] = random.nextInt(999);
		}

		return numbers;

	}

	public static int findSmallestNumber(int[] numbers, int n) {

		Arrays.sort(numbers);

		return numbers[n - 1];

	}

}
