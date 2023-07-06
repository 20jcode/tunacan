package org.c2;

import org.c2.observerinterface.DisplayElement;
import org.c2.observerinterface.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float weight;
	private float temperature;
	private float experationDate;
	private tunaData tunaData;
	public CurrentConditionsDisplay(tunaData tunaData){
		this.tunaData = tunaData;
		tunaData.registerObserver(this);
	}

	@Override
	public void update (float weight, float temperature, float expirationDate) {
		this.temperature = temperature;
		this.weight = weight;
		display();
	}

	@Override
	public void display () {
		System.out.println("현재 참치 무게 : "+weight);
		System.out.println("현재 참치 온도 : "+temperature);
	}
}
