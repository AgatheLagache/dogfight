package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {
	private BufferedImage	emptysky;
	private IDogfightModel	dofightModel;

	public GraphicsBuilder(IDogfightModel dogfightModel) {
		this.emptysky = new BufferedImage(0, 0, 0);
	}

	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

	}

	private void buildEmptySky() {

	}

	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {

	}

	@Override
	public int getGlobalWidth() {
		return 0;
	}

	@Override
	public int getGlobalHeight() {
		return 0;
	}

}
