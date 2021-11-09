package package1;
public class Hello {

	public static void main(String[] args) {
		int x = 142;
		//x += 5;   // x = x + 5
		//x -= 5;   // x = x - 5
		//x *= 5;   // x = x * 5
		//x /= 4;   // x = x / 4
		x %= 142;     // x = x % 5
		System.out.println(x);
	}

}
