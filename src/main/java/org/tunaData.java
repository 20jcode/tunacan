package org;

public abstract class tunaData {

	public abstract void getWeight(); // 참치 무게

	public abstract void getTemperature(); // 참치 온도

	public abstract void getExpirationDate(); // 참치 유통 기한

	/**
	 * 참치 관측값이 갱신될 때 호출되는 메소드
	 */
	public abstract void measuremenetsChanged();
}
