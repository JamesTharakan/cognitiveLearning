package hanckerRank.random;

public class InfiniteString {

	public static void main(String[] args) {
		String str = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";

		char[] strArray = str.toCharArray();

		long subString = 549382313570l; // 16481469408
		long mod = subString % strArray.length;
		long finalCount = 0;
		long occurence = noOfOccurrence('a', strArray);

		finalCount += (subString / strArray.length) * occurence;
		
		if (mod != 0) {
			long div = subString % strArray.length;
			for (int i = 0; i < div; i++) {
				if ('a' == strArray[i])
					finalCount++;
			}
		}
		System.out.println("InfiniteString.main():: finalCount" + finalCount);
	}

	private static long noOfOccurrence(char c, char[] strArray) {
		long count = 0;

		for (int i = 0; i < strArray.length; i++) {
			if (c == strArray[i])
				count++;
		}
		System.out.println("InfiniteString.noOfOccurrence():: count :" + count);
		return count;
	}
}
