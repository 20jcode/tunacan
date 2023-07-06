package org.tunacan.body;

import org.tunacan.recycle.metal;
import org.tunacan.subbody.cream;
import org.tunacan.subbody.gochu;

import static org.junit.jupiter.api.Assertions.*;

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