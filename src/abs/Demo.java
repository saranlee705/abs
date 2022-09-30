package abs;

abstract class Demo1 {
	abstract void run();

}
class Honda extends Demo1{
	void run() {
		System.out.println("drive safely");
		
	}
	public static void main(String[] args) {
		Demo1 k = new Honda();
		k.run();
	}
	
}
