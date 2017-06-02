package jpu2016.dogfight.model;

public class Plane extends Mobile {
	private static int	SPEED	= 2;
	private static int	WIDTH	= 100;
	private static int	HEIGHT	= 30;
	private int			player;

	public Plane(final int player, final Direction direction, final Position position, final String image) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		this.setPlayer(player);

	}

	@Override
	public boolean isPlayer(final int player) {
		return player == this.getPlayer();
	}

	@Override
	public boolean hit() {
		return true;
	}

	private int getPlayer() {
		return this.player;
	}

	private void setPlayer(final int player) {
		this.player = player;
	}

}