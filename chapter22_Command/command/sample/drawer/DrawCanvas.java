package command.sample.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import command.sample.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {
	private Color color = Color.red;
	private int radius = 6;
	private MacroCommand history;

	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}
	public void paint(Graphics g){
		System.out.println("★再描画開始★");
		history.execute();
		System.out.println("★再描画終了★");
	}

	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);

	}

}
