package abs;

public class overloading {
	 static int add(int a , int b) {
		return a+b;
	}
	 static int add(int a,int b,int c) {
		return a+b+c;
	}
	 static String add(int a , String b) {
		return a+b;
	}
	static class over{
	
	public  static void main(String[] args) {
		System.out.println(overloading.add(1, 1));
		System.out.println(overloading.add(1, 1, 1));
		System.out.println(overloading.add(1, "kj"));
              
	}

}
}