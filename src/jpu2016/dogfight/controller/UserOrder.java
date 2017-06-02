package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {
	private int player = 0;
	private Order order;

	public UserOrder(int player, Order order){

	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub

		return this.order;
	}

	@Override
	public int getPlayer() {
		// TODO Auto-generated method stub
		return this.player;
	}

	public void setOrder(Order order) {
		switch (order){
		case UP:
			break;
		case RIGHT:
			break;
		case DOWN:
			break;
		case LEFT:
			break;
		case SHOOT:
			break;
		case NOP:
			break;
		default:
			break;
		}
		this.order = order;
	}

	public void setPlayer(int player) {

		this.player = player;
	}

}
