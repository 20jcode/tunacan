package org.tunacan.recycle;

public class Plastic implements Recycleable{

	@Override
	public void recycle () {
		rePlastic();
	}

	private void rePlastic(){
		System.out.println("플라스틱으로~돌아가라!");
	}
}
