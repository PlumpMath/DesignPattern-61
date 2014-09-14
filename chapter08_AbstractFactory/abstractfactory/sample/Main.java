package abstractfactory.sample;

import abstractfactory.sample.factory.Factory;
import abstractfactory.sample.factory.Link;
import abstractfactory.sample.factory.Page;
import abstractfactory.sample.factory.Tray;

public class Main {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main listfactory.ListFactory");
			System.out.println("Example 2: java Main tablefactory.TableFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);

		Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
		Link jp_yahoo = factory.createLink("Yhaoo!Japan", "http://www.yahoo.co.jp/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");

		Tray traynews = factory.createTray("新聞");
		traynews.add(asahi);
		traynews.add(yomiuri);

		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);

		Tray trayserach = factory.createTray("サーチエンジン");
		trayserach.add(trayyahoo);
		trayserach.add(excite);
		trayserach.add(google);

		Page page = factory.createPage("LinkPage", "結城 浩");
		page.add(traynews);
		page.add(trayserach);
		page.output();

	}

}
