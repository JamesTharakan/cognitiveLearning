package designPatterns.behavioural.observer;

public class TestObserverPattern {

	public static void main(String[] args) {

		NewsAgency agency = new NewsAgency();

		agency.addMedias(new TwitterMedia());
		agency.addMedias(new InShortMedia());

		agency.pushNewsIntoSystem("I am the news");

//		***************************************
		
		NewsAgency agencyTwo = new NewsAgency();
		// when below objects gets notified about a update from the
		// observant(newAgency),
		// they fetch the newsAgency
		TwitterMedia tm = new TwitterMedia(agencyTwo);
		InShortMedia sm = new InShortMedia(agencyTwo);

		agencyTwo.addMedias(sm);
		agencyTwo.addMedias(tm);

		agencyTwo.onlyPushNewsIntoSystem("The news");

	}

}
