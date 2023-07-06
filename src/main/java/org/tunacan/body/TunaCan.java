package org.tunacan.body;

import org.tunacan.open.Openable;

public abstract class TunaCan {

	public String tunaCanName;

	public int tunaCanValue;

	public String tunaCanInfo;

	public Openable openable; //여기서는 생성자가 필요가 없음, subClass에서 생성자를 통해서 지정해주기

	public void openTuna(){

		openable.open();
	}
}
