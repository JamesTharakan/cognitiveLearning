package designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

	List<INewsUpdator> medias = new ArrayList<INewsUpdator>();

	String news;

	public String getNews() {
		return news;
	}

	public void addMedias(INewsUpdator media) {
		medias.add(media);
	}

	public boolean removeMedia(INewsUpdator media) {
		return medias.remove(media);
	}

	void pushNewsIntoSystem(String n) {
		news = n;
		medias.forEach(m -> m.publish(news));
	}

	void onlyPushNewsIntoSystem(String n) {
		news = n;
		for (INewsUpdator m : medias) {
			m.publish();		//Notice , the notify methods only notifies , the listener fetches the new by themself
		}
	}

}
