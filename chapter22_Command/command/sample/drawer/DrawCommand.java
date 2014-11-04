package command.sample.drawer;

import java.awt.Point;

import command.sample.command.Command;

public class DrawCommand implements Command {
	protected Drawable drawabble;
	private Point position;
	public DrawCommand(Drawable drawable, Point position){
		this.drawabble = drawable;
		this.position = position;
	}

	@Override
	public void execute() {
		drawabble.draw(position.x, position.y);

	}

}
