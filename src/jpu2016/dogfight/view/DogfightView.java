package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

public class DogfightView implements IViewSystem, Runnable {
	private EventPerformer	eventPerformer;
	private GameFrame		gameFrame;
	private GraphicsBuilder	graphicsBuilder;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		this.eventPerformer = new EventPerformer(orderPerformer);
		this.gameFrame = new GameFrame("Dogfight", this.eventPerformer, this.graphicsBuilder, observable);
		this.graphicsBuilder = new GraphicsBuilder(dogfightModel);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub

	}

}
