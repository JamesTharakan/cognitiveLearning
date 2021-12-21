package designPatterns.behavioural.observer;

public class InShortMedia implements INewsUpdator {

	NewsAgency na;

	InShortMedia() {
	}

	InShortMedia(NewsAgency na) {
		this.na = na;
	}

	public void publish(String news) {
		System.out.println("Inshort : " + news);

	}

	public void publish() {
		System.out.println(
				"Once we got the notifcation, InShortMedia got the news/something else from agency: " + na.getNews());

	}

}
