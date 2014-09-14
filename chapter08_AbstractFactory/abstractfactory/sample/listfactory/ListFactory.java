package abstractfactory.sample.listfactory;

import abstractfactory.sample.factory.Factory;
import abstractfactory.sample.factory.Link;
import abstractfactory.sample.factory.Page;
import abstractfactory.sample.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
