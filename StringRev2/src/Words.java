
public class Words {
	StringBuilder newTextBackwards = new StringBuilder();
	String textBackwards;

	public String convertString(String words) {

		for (int i = 0; i < words.length(); i++) {
			newTextBackwards.append(words.charAt(words.length() - 1 - i));
		}
		textBackwards = newTextBackwards.toString();

		return textBackwards;
	}
}
