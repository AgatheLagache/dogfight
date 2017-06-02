package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {

	private Sky					sky;
	private ArrayList<IMobile>	mobiles;

	public DogfightModel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addMobile(final IMobile Mobile) {

	}

	@Override
	public void buildArea(final Dimension dimension) {

	}

	@Override
	public IArea getArea() {
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(final int player) {
		return null;
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return null;
	}

	@Override
	public void removeMobile(final IMobile Mobile) {

	}

	@Override
	public void setMobilesHavesMoved() {

	}
}
