package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {
	private final IOrderPerformer orderPerformer;
	private final UserOrder userOrder;

	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
		this.userOrder = new UserOrder(0, null);
	}

	@Override
	public void eventPerform(KeyEvent keyCode) {

	}

	public UserOrder keyCodeToUserOrder(int keyCode) {
		return null;

	}
}
