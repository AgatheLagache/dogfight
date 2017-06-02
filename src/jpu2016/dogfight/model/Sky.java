package jpu2016.dogfight.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sky implements IArea {
	private final File		file	= null;
	private final Dimension	dimension;
	private Image			image	= null;

	public Sky(final Dimension dimSky) {
		this.dimension = dimSky;
		try {
			this.image = ImageIO.read(this.file);
		} catch (final IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Image getImage() {
		return this.image;

	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return this.dimension;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

}