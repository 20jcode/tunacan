package org.c1.subbody;

import org.c1.body.TunaCan;
import org.c1.open.HandOpen;
import org.c1.recycle.Plastic;

public class gochu extends TunaCan { // 여기서는 interface에 대한 impl을 하지 않아도 됨. 구현된 인터페이스 객체를 사용하기 때문

	public gochu(){

		openable = new HandOpen(); // 여기 구현된 인터페이스 객체를 설정해줌으로, 함
		recycleable = new Plastic();
	}

	@Override
	public void display () {
		System.out.println("고추참치~");
	}
}
