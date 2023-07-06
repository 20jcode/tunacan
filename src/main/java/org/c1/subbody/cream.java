package org.c1.subbody;

import org.c1.body.TunaCan;
import org.c1.open.HandOpen;
import org.c1.recycle.Plastic;

public class cream extends TunaCan {

	public cream(){
		openable = new HandOpen();
		recycleable = new Plastic();
	}
	@Override
	public void display () {
		System.out.println("크림참치...?인가요?");
	}
}
