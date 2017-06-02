package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {

	private final Sky			sky;
	private ArrayList<IMobile>	mobiles;

	public DogfightModel() {
		Dimension DimSky;
		DimSky = new Dimension(50, 50);
		this.sky = new Sky(DimSky);
		final ArrayList mobiles = new ArrayList();
		mobiles.add(new Plane(1, Direction.RIGHT, new Position(5, 5, 30, 50), "F4U_RIGHT"));
		// TODO Auto-generated constructor stub$
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
