package designPatterns.behavioural.observer;

public class TwitterMedia implements INewsUpdator {
	NewsAgency na;

	TwitterMedia() {
	}

	TwitterMedia(NewsAgency na) {
		this.na = na;
	}

	public void publish(String news) {
		System.out.println("Tweet : " + news);

	}

	public void publish() {
		System.out.println(
				"Once we got the notifcation, TwitterMedia got the news/something else from agency: " + na.getNews());

	}

}
