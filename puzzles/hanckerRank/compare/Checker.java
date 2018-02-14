package puzzles.hanckerRank.compare;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

	public int compare(Player a, Player b) {
		if (a.score == b.score)
			return a.name.compareTo(b.name);
		return ((Integer) b.score).compareTo(a.score);
	}

}
