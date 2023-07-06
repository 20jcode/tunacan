package org.tunacan.subbody;

import org.tunacan.body.TunaCan;
import org.tunacan.open.HandOpen;
import org.tunacan.recycle.Plastic;
import org.tunacan.recycle.Recycleable;

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
