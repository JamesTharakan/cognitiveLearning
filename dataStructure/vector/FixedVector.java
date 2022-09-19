package dataStructure.vector;

class FixedVector {
	public static int count;
	private Object data[];
	private int length = 0;

	public FixedVector(int size) {
		count++;
		data = new Object[size];
	}

	public void add(Object ob) throws Exception {
		if (length < data.length) {
			data[length++] = ob;
		} else {
			throw new Exception();
		}
	}

	public Object get(int index) {
		if (index < length) {
			return data[index];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public Object clone() {
		FixedVector c = new FixedVector(data.length);
		for (int i = 0; i < length; ++i) {
			c.data[i] = data[i];
		}
		return c;
	}

	public static void main(String argv[]) {
		FixedVector n = new FixedVector(10);
		try {
			n.get(1);
		} catch (Exception ie) {
			System.out.println("ERROR 1"+ie.getMessage());
		}
	}
}
