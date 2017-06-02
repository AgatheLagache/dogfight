package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {

	private final int	speed;
	private Dimension	dimension;
	private Position	Point;
	private Direction	direction;

	public Mobile(final Direction direction, final Position position, final Dimension dimension, final int speed,
			final String image) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
	}

	@Override
	public int getSpeed() {
		return 1;
	}

	@Override
	public Direction getDirection() {
		return null;
	}

	@Override
	public void setDirection(final Direction direction) {

	}

	@Override
	public Point getPosition() {
		return null;
	}

	@Override
	public Dimension getDimension() {
		return null;
	}

	@Override
	public int getWidth() {
		return 1;
	}

	@Override
	public int getHeight() {
		return 1;
	}

	@Override
	public void move() {

	}

	@Override
	public void placeInArea(final IArea area) {

	}

	@Override
	public boolean isPlayer(final int player) {
		return false;
	}

	public void moveUp() {

	}

	public void moveRight() {

	}

	public void moveLeft() {

	}

	public void moveDown() {

	}

	public Color getColor() {
		return null;
	}

	public IDogfightModel getDogfightModel() {
		return null;
	}

	@Override
	public void setDogfightModel(final IDogfightModel dogfightModel) {

	}

	@Override
	public boolean hit() {
		return false;
	}

	@Override
	public boolean isWeapon() {
		return false;
	}

	@Override
	public Image getImage() {
		return null;
	}

}