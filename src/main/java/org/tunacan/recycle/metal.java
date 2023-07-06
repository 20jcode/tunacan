package org.tunacan.recycle;

public class metal implements Recycleable{
	@Override
	public void recycle () {
		reMetal();
	}

	private void reMetal(){
		System.out.println("강철같이 단단하게 재활용");
	}
}
