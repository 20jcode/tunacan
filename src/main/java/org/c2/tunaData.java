package org.c2;

public class tunaData {

	public float getWeight(){ // 참치 무게

		return 0;
	};

	public float getTemperature(){ // 참치 온도
		return 0;
	};

	public float getExpirationDate(){// 참치 유통 기한
		return 0;
	};

	/**
	 * 참치 관측값이 갱신될 때 호출되는 메소드
	 */
	public void measuremenetsChanged(){

		float weight = getWeight();
		float temp = getTemperature();
		float expiration = getExpirationDate();

		//디스플레이 갱신 부분
	};
}
