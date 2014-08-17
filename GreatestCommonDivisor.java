public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(greatestCommonDivisor(315, 54));

	}

	public static int greatestCommonDivisor(int a, int b) {

		while (b > 0) {
			int remainder = a % b;
			a = b;
			b = remainder;
		}
		return a;

	}

}
