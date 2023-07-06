package org.c1.body;

import org.c1.recycle.metal;
import org.c1.subbody.cream;
import org.c1.subbody.gochu;

class TunaCanTest {


	public static void main(String[] args){

		TunaCan tunaCan1 = new gochu();
		TunaCan tunaCan2 = new cream();

		tunaCan1.openTuna();
		tunaCan1.recycle();

		tunaCan2.recycle();
		tunaCan2.setRecycleable(new metal());
		tunaCan2.recycle();
	}

}