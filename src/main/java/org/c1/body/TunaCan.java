package org.c1.body;

import org.c1.open.Openable;
import org.c1.recycle.Recycleable;

public abstract class TunaCan {

	protected String tunaCanName;

	protected int tunaCanValue;

	protected String tunaCanInfo;

	protected Openable openable; //여기서는 생성자가 필요가 없음, subClass에서 생성자를 통해서 지정해주기

	protected Recycleable recycleable;

	public void openTuna(){

		openable.open(); // 행동을 다른 클래스에 위임
	}

	public void recycle(){

		recycleable.recycle();
	}

	public abstract void display();

	public void setOpenable(Openable oa){
		openable = oa;
	}

	public void setRecycleable(Recycleable ra){
		recycleable = ra;
	}




}
