package puzzles.hanckerRank.oneweek;

import java.io.IOException;

public class TimeConversion {
	public static void main(String[] args) throws IOException {
		System.out.println(timeConversion("12:40:22AM"));
		System.out.println(timeConversion("12:45:54PM"));
		System.out.println(timeConversion("06:40:03AM"));
		System.out.println(timeConversion("07:05:45PM"));
		
	}

	public static String timeConversion(String s) {
		String hourString = s.substring(0, 2);
		int hour = Integer.parseInt(hourString);

		String answerPostFix=s.substring(2, s.length() - 2);


		if (s.charAt(s.length() - 2) == 'P') {
				hour = 12 + (hour%12);
		}else {
			if(hour ==12)
				hour = 0;
		}
		
		answerPostFix =  hour + answerPostFix;

		if (hour < 10) {
			answerPostFix = "0" + answerPostFix;
		}
		return answerPostFix;
		 
		 
	}
}
//12:40:22AM	00:40:22
//12:45:54PM  : 12:45:54
//06:40:03AM 	:06:40:03
//07:05:45PM 	:19:05:45