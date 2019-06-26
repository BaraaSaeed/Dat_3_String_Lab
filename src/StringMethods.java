public class StringMethods {

	public static String capitalize(String word) {
		char firstLetter = word.charAt(0);
		String restOfuserWord = word.substring(1);

		return (Character.toUpperCase(firstLetter) + restOfuserWord.toLowerCase());
	}

	/****************************************/

	public static int wheresWaldo(String phrase) {
		return (phrase.indexOf("Waldo"));
	}

	/****************************************/

	public static String firstThingsFirst(String str1, String str2) {
		if (str1.compareToIgnoreCase(str2) < 0) {
			return (str1 + " " + str2);
		} else {
			return (str2 + " " + str1);
		}
	}

	/****************************************/

	// @SuppressWarnings("null")
	public static String reverse(String str) {
		char data[] = new char[str.length()];
		;
		for (int i = str.length() - 1; i >= 0; i--) {
			data[str.length() - 1 - i] = str.charAt(i);
		}
		String str2 = new String(data);
		return str2;
	}

	/****************************************/

	public static String afterMath(String phrase) {
		String restString = null;
		if (phrase.contains("math")) {
			restString = phrase.substring(phrase.indexOf("math"));
		}
		if (restString != null) {
			return (restString);
		} else {
			return ("dud");
		}

	}

	public static String camelCase(String phrase) {

		StringBuilder stringBuilder = new StringBuilder();
		String[] arrOfStr = phrase.split(" ");
		stringBuilder.append(arrOfStr[0]);

		for (int i = 1; i < arrOfStr.length; i++) {
			// char firstLetter = arrOfStr[i].charAt(0);
			// String restOfuserWord = arrOfStr[i].substring(1);
			// firstLetter = Character.toUpperCase(firstLetter);
			// arrOfStr[i] = firstLetter + restOfuserWord;
			stringBuilder.append(capitalize(arrOfStr[i]));
		}
		return stringBuilder.toString();

	}

}
