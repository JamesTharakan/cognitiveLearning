package simple;

public class PrivateVariable {

	public static void main(String[] args) {

		testPrivate obj = new testPrivate();

//		obj.priVar = 33;
		obj.setpriVar(33);

		obj.publicVar = 44;

		obj.protectedVar = 55;
	}
}

class testPrivate {
	private int priVar = 3;

	public int publicVar = 4;

	protected int protectedVar = 5;

	public int getpriVar() {
		return priVar;
	}

	public void setpriVar(int pVar) {
		this.priVar = pVar;
	}

}