package emailAdmin;

public class PasswordChecks {

	protected static boolean isPasswordValid(String userPassword, boolean isUserPassword) {

		int length = userPassword.length();
		//		if (length < 8) {
		//			System.out.println("\nThe length of the password should be atleast 8 characters.");
		//			return false;
		//		}

		int upperCaseCount = 0, lowerCaseCount = 0, digitCount = 0, specialCharacterCount = 0;

		for (int i = 0; i < length - 1; i++) {
			char ch1 = userPassword.charAt(i);
			char ch2 = userPassword.charAt(i + 1);
			if ((ch1 >= 'A' && ch1 <= 'Z')) {
				if (ch2 >= 'A' && ch2 <= 'Z') {
					if (isUserPassword)
						System.out.println("\nDO NOT keep the CAPTAIL letters together.");
					return false;
				}
				upperCaseCount++;
			}
			else if (ch1 >= 'a' && ch2 <= 'z') {
				lowerCaseCount++;
			}
			else if (ch1 >= '0' && ch1 <= '9') {
				if (ch2 >= '0' && ch2 <= '9') {
					if (isUserPassword)
						System.out.println("\nDO NOT keep the digits together.");
					return false;
				}
				digitCount++;
			}
			else {
				if ( !( (ch2 >= 'A' && ch2 <= 'Z') || (ch2 >= 'a' && ch2 <= 'z') || (ch2 >= '0' && ch2 <= '9'))) {
					if (isUserPassword)
						System.out.println("\nDO NOT keep special characters together.");
					return false;
				}
				specialCharacterCount++;
			}
		}

		//checking the last character
		char ch = userPassword.charAt(length - 1);
		if (ch >= 'A' && ch <= 'Z') {
			upperCaseCount++;
		}
		else if (ch >= 'a' && ch <= 'z') {
			lowerCaseCount++;
		}
		else if (ch >= '0' && ch <= '9') {
			digitCount++;
		}
		else {
			specialCharacterCount++;
		}


		if (upperCaseCount < 1) {
			if (isUserPassword)
				System.out.println("\nThe password should contain at least 1 CAPITAL letters.");
			return false;
		}
		if (lowerCaseCount < 1) {
			if (isUserPassword)
				System.out.println("\nThe password should contain at least 1 small letters.");
			return false;
		}
		if (digitCount < 1) {
			if (isUserPassword)
				System.out.println("\nThe password should contain at least 1 numers.");
			return false;
		}
		if (specialCharacterCount < 1) {
			if (isUserPassword)
				System.out.println("\nThe password should contain at least 1 special characters.");
			return false;
		}

		return true;
	}


	

}
