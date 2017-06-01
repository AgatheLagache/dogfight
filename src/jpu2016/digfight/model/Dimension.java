package jpu2016.digfight.model;

public class Dimension {

	private int	width;
	private int	height;

	public Dimension(final int width, final int height) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.width = width;
	}

	public Dimension(final Dimension dimension) {

	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(final int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(final int height) {
		this.height = height;
	}

}
