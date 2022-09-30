package abs;

public class Axisbank implements Bankk {

	@Override
	public void saving() {
System.out.println("save regularly");		
	}

	@Override
	public void current() {
System.out.println("current acc");		
	}

	@Override
	public void salary() {
System.out.println("salary acc");		
	}

	@Override
	public void joint() {
System.out.println("joined");		
	}

	@Override
	public void branchdetail() {
System.out.println("chennai");
System.out.println("anna nagar");
System.out.println("near metro");
	}
public static void main(String[] args) {
	Axisbank info = new Axisbank();
	info.branchdetail();
}
}
