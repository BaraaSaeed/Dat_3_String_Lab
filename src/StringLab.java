
public class StringLab {

	public static void main(String[] args) {

		String theWord = "bLaZE";
		capitalize(theWord);
		wheresWaldo("Striped Waldo!");
		firstThingsFirst("Baraa", "Ali");
		reverse(theWord);
		soLong("Baraa", "Ali");
		afterMath("She aced the mathematics test!");
		letterize("Java");

		System.out.println("\nThe following are StringMethods methods called and printed inside the main method:\n");
		System.out.println(StringMethods.capitalize(theWord));
		System.out.println(StringMethods.wheresWaldo("Striped Waldo!"));
		System.out.println(StringMethods.firstThingsFirst("Baraa", "Ali"));
		System.out.println(StringMethods.reverse(theWord));
		System.out.println(StringMethods.afterMath("She aced the mathematics test!"));
		System.out.println(StringMethods.camelCase("desert survival skills"));

	}

	/****************************************/
	public static void capitalize(String word) {
		char firstLetter = word.charAt(0);
		String restOfuserWord = word.substring(1);

		System.out.println(Character.toUpperCase(firstLetter) + restOfuserWord.toLowerCase());
	}

	/****************************************/

	public static void wheresWaldo(String phrase) {
		System.out.println(phrase.indexOf("Waldo"));
	}

	/****************************************/

	public static void firstThingsFirst(String str1, String str2) {
		if (str1.compareToIgnoreCase(str2) < 0) {
			System.out.println(str1 + " " + str2);
		} else {
			System.out.println(str2 + " " + str1);
		}
	}

	/****************************************/

	public static void reverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");
	}

	/****************************************/
	public static void soLong(String str1, String str2) {
		if (str1.length() > str2.length()) {
			System.out.println("the longer string is " + str1);
		} else if (str2.length() > str1.length()) {
			System.out.println("the longer string is " + str2);
		} else {
			System.out.println("they are equal  " + str1 + " " + str2);
		}
	}

	/****************************************/

	public static void afterMath(String phrase) {
		String restString = null;
		if (phrase.contains("math")) {
			restString = phrase.substring(phrase.indexOf("math"));
		}
		if (restString != null) {
			System.out.println(restString);
		} else {
			System.out.println("dud");
		}

	}

	/****************************************/
	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
}
