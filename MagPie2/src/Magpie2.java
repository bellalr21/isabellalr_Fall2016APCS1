
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		statement = statement.trim();
		if (statement.length() == 0){
			response = "Say something, please.";
			return response;
		}
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("love") >= 0
				|| statement.indexOf("happy") >= 0
				|| statement.indexOf("smile") >= 0) {
			response = "You seem to be in a good mood.";
		} else if (statement.indexOf("Ms. Dreyer") >= 0
				|| statement.indexOf("Ms. Ronina") >= 0
				|| statement.indexOf("Mr. Lira") >= 0
				|| statement.indexOf("Ms. Michot") >= 0
				|| statement.indexOf("Mr. Jackson") >= 0) {
			response = "Sounds like a good teacher.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "I don't care.";
		} else if (whichResponse == 5) {
			response = "What does that mean?";
		}

		return response;
	}
}
