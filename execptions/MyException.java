package execptions;

class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException(String s) {
		super(s);
	}

	public static void main(String[] args){

		int number = -1;

		try {
			if (number <= 0) {
				throw new MyException("Invalid number");
			}
		} catch (MyException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
