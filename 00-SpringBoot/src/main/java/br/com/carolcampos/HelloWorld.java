package br.com.carolcampos;

public class HelloWorld {

	private final long id;
	private final String message;	
	
	public HelloWorld(long id, String message) {		
		this.id = id;
		this.message = message;
	}
	
	public long getId() {
		return id;
	}
	
	public String getMessage() {
		return message;
	}
	
	
}
