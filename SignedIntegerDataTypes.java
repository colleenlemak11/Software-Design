package fundamentals;

public class SignedIntegerDataTypes {

	public static void main(String[] args) {
		byte b;		// 1 byte two's complement (8 bits),	[-128, +127]
		short s;	// 2 bytes two's complement (16 bits),	[-32768, +32767]
		// int i;		// 4 bytes two's complement (32 bits),		[-2147483648, +2147483647]
		
		b = -1;
		System.out.println("byte	" + b);
		b++;
		System.out.println("byte++	" + b);
		b = 127;
		System.out.println("byte	" + b);
		b++;
		System.out.println("byte++	" + b + " overflow");
		b--;
		System.out.println("byte--	" + b + " overflow \n");
		
		s = -1;
		System.out.println("short	" + s);
		s++;
		System.out.println("short++	" + s);
		s = 32767;
		System.out.println("short	" + s);
		s++;
		System.out.println("short++	" + s + " overflow");
		s--;
		System.out.println("short--	" + s + " overflow \n");
	}
}
