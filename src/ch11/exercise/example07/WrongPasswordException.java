package ch11.exercise.example07;

public class WrongPasswordException extends Exception {

	public WrongPasswordException() {
	}

	public WrongPasswordException(String message) {
		super(message);
	}

}
