package JUnitTest;

public class MessageUtil {
	private String message;
	/**
	 * @param args
	 */
	public MessageUtil(String message){
		this.message=message;
	}
	public String printMessage(){
		System.out.println(message);
		return message;
	}
}
