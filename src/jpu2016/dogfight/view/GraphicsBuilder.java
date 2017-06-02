package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {
	private BufferedImage	emptysky;
	private IDogfightModel	dogfightModel;

	public GraphicsBuilder(IDogfightModel dogfightModel) {
		//this.emptysky = new BufferedImage(0, 0, 0);
		this.dogfightModel = dogfightModel;
		this.buildEmptySky();
	}

	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

	}

	private void buildEmptySky() {
		this.emptysky = new BufferedImage(this.getGlobalWidth(), this.getGlobalHeight(), BufferedImage.TYPE_INT_RGB);
		final Graphics2D graphics = (Graphics2D) this.emptysky.getGraphics();
		graphics.drawImage(this.dogfightModel.getArea().getImage(), this.getGlobalWidth(), this.getGlobalHeight(), null);
	}

	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {

	}

	@Override
	public int getGlobalHeight() {
		return this.dogfightModel.getArea().getWidth();
	}

	@Override
	public int getGlobalWidth() {
		return this.dogfightModel.getArea().getHeight();
	}

}
