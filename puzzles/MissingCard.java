package puzzles;

public class MissingCard {

	public static void main(String[] args) {
		int cards[][]={
						{1,2,3,4,5,6,7,8,9,10,11,12,13},
						{1,2,3,4,5,6,7,9,10,11,12,13},
						{1,2,3,4,5,6,7,8,9,10,11,12,13},
						{1,2,3,4,5,6,7,8,9,10,11,12,13}
									};
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards[i].length; j++) {
				int card =cards[i][j];
			}
			System.out.println(" ");
		}

	}

}

class card{
	public int club;
	public int value;
}
