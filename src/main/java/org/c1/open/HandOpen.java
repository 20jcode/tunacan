package org.c1.open;

public class HandOpen implements Openable {

	@Override
	public void open () {
		useHand();
	}

	private void useHand(){
		System.out.println("손으로 참치를 열어요");
	}
}
