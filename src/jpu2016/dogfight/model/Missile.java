package jpu2016.dogfight.model;

public class Missile extends Mobile {

	private static int		SPEED					= 4;
	private static int		WIDTH					= 30;
	private static int		HEIGHT					= 10;
	private static int		MAX_DISTANCE_TRAVELED	= 1400;
	private static String	IMAGE					= "missile";
	private int				distanceTraveled		= 0;

	public Missile(final Direction direction, final Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
		// TODO Auto-generated constructor stub
	}

	public static int getWidthWithADirection(final Direction direction) {
		switch (direction) {
		case UP:
		case DOWN:
			WIDTH = 10;
			break;

		case LEFT:
		case RIGHT:
			WIDTH = 30;
			break;
		}
		return WIDTH;
	}

	public static int getHeightWithADirection(final Direction direction) {
		switch (direction) {
		case UP:
		case DOWN:
			HEIGHT = 30;
			break;

		case LEFT:
		case RIGHT:
			HEIGHT = 10;
			break;
		}
		return HEIGHT;
	}

	@Override
	public void move() {
		while (this.distanceTraveled <= this.MAX_DISTANCE_TRAVELED) {
			this.distanceTraveled = this.distanceTraveled + this.SPEED;
		}
		this.getDogfightModel().removeMobile(this);

	}

	@Override
	public boolean isWeapon() {
		return true;
	}

	@Override
	public boolean hit() {
		return true;
	}
}