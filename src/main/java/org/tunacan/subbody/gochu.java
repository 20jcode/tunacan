package org.tunacan.subbody;

import org.tunacan.body.TunaCan;
import org.tunacan.open.HandOpen;
import org.tunacan.open.Openable;

public class gochu extends TunaCan { // 여기서는 interface에 대한 impl을 하지 않아도 됨. 구현된 인터페이스 객체를 사용하기 때문

	public gochu(){

		this.openable = new HandOpen(); // 여기 구현된 인터페이스 객체를 설정해줌으로, 함
	}

	@Override
	public void display () {
		System.out.println("고추참치~");
	}
}
