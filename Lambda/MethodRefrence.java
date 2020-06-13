public class MethodRefrence {
	public static void main(String[] args) {
		
		// passing the blank method  and there is another way of doing this
		// Thread th = new Thread( () -> printMessage());

		Thread th = new Thread(MethodRefrence :: printMessage);

		th.start();
	}

	public static void printMessage() {
		System.out.println("hello");
	}
}