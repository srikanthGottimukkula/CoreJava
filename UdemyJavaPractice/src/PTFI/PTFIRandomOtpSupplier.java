package PTFI;

import java.util.function.IntSupplier;

//Program : To find out first 6 digits otp by using IntSupplier.
public class PTFIRandomOtpSupplier {
	public static void main(String[] args) {
		String otp = "";
		IntSupplier s = () -> (int) (Math.random() * 10);
		for (int i = 1; i <= 6; i++) {
			otp = otp + s.getAsInt();
		}
		System.out.println("The 6 digits otp is:"+otp);

	}
}
