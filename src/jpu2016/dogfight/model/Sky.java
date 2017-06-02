package jpu2016.dogfight.model;

import java.awt.Image;

public class Sky implements IArea {

	private Dimension dimension;

	public Sky(final Dimension dimension) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dimension getDimension() {
		return new Dimension(1, 1);
	}

	@Override
	public Image getImage() {
		return null;
	}
}
