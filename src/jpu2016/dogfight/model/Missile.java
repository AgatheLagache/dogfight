package jpu2016.dogfight.model;

public class Missile extends Mobile {

	private static int		SPEED					= 4;
	private static int		WIDTH					= 30;
	private static int		HEIGHT					= 10;
	private static int		MAX_DISTANCE_TRAVELED	= 1400;
	private static String	IMAGE					= "missile";
	private final int		distanceTraveled		= 0;

	public Missile(final Direction direction, final Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
		// TODO Auto-generated constructor stub
	}

	public static int getWidthWithADirection(final Direction direction) {
		return 1;
	}

	public static int getHeightWithADirection(final Direction direction) {
		return 1;
	}

	@Override
	public void move() {

	}

	@Override
	public boolean isWeapon() {
		return false;
	}

	@Override
	public boolean hit() {
		return true;
	}
}
