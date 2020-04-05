package puzzles.hanckerRank.random;

public class Moutain {

	public static void main(String[] args) {

		String steps="UDDDUDUU";
		int sealLevel = 0;
		int noOfValleys=0;

		boolean isUp =false;
		
		for (int i = 0; i < steps.length(); i++) {
			char step= steps.charAt(i);
			if(step=='U')
				sealLevel++;
			else
				sealLevel--;
			
			if(sealLevel == 0 && step=='U')
				noOfValleys++;
		}
		
		
		System.out.println("Moutain.main():: "+noOfValleys);
		
	}

}
