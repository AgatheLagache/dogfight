package jpu2016.dogfight.model;

public class Plane extends Mobile {

	private static int	SPEED	= 2;
	private static int	WIDTH	= 100;
	private static int	HEIGHT	= 30;
	private final int	player;

	public Plane(final int player, final Direction direction, final Position position, final String image) {
		// TODO Auto-generated constructor stub
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		this.player = player;
	}

	@Override
	public boolean isPlayer(final int player) {
		return false;
	}

	@Override
	public boolean hit() {
		return false;
	}
}
