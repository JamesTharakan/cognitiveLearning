package puzzles.hanckerRank.random;

public class sherlock {

}
public static String isValid(String s) {
	// Write your code here
	    Map<Character, Long> charFreq = s.codePoints().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
	    Map<Long, Long> freqCount = charFreq.values().stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
	    int keySetSize = freqCount.size();
	    // accept if all frequencies are the same / uniform
	    if (keySetSize < 2) {
	        return "YES";
	    }
	    // reject if more than 2 different frequencies (-1 in any cannot become uniform)
	    if (keySetSize > 2) {
	        return "NO";
	    }
	    Long[] freqs = freqCount.keySet().toArray(new Long[0]);
	    int bigFreqIndex = freqs[1] > freqs[0] ? 1 : 0;
	    long smallFreq = freqs[1 - bigFreqIndex];
	    long bigFreq = freqs[bigFreqIndex];
	    // edge case for smaller freq is single char
	    if (smallFreq == 1 && freqCount.get(smallFreq) == 1) {
	        return "YES";
	    }
	    // when there is only 1 character type with freq = big_freq, 
	    // and removing 1 of that char will make the freq_count uniform
	    if (bigFreq == smallFreq + 1 && freqCount.get(bigFreq) == 1l) {
	        return "YES";
	    }
	    return "NO";
	}