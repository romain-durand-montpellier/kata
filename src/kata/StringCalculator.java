package kata;

public class StringCalculator {

	// Add int in string and return return sum
	public int add(String values) {

		String[] intValues = values.split(",");
		int somme = 0;
		try {
			for (String i : intValues) {
				somme += Integer.parseInt(i);
			}
		} catch (Exception e) {

		}

		return somme;

	}

}
