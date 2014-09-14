package abstractfactory.sample.tablefactory;

import abstractfactory.sample.factory.Factory;
import abstractfactory.sample.factory.Link;
import abstractfactory.sample.factory.Page;
import abstractfactory.sample.factory.Tray;

public class TableFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new TablePage(title, author);
	}

}
