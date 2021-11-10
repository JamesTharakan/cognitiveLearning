package simple;

enum FruitType {
	APPLE, MANGO, GRAPE;
}

class Fruit {
	FruitType type;

	Fruit(FruitType ft) {
		type = ft;
	}

	public String toString() {
		return type + " ";
	}
}

public class Basket {

	public static void main(String[] args) {

		Fruit f1 = new Fruit(FruitType.APPLE);
		System.out.println(" I am " + f1);
	}
}


//Exception in thread "main" java.lang.NoSuchMethodError: 'void random.Fruit.<init>(random.FruitType)'
//	at random.Basket.main(Basket.java:23)
