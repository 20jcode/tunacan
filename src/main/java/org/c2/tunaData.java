package org.c2;

import org.c2.observerinterface.Observer;
import org.c2.observerinterface.Subject;

import java.util.ArrayList;
import java.util.List;

public class tunaData implements Subject {
	private List<Observer> observers; // 옵저버 객체 저장 리스트
	private float weight;
	private float temperature;
	private float expirationDate;

	public tunaData(){
		observers = new ArrayList<>();
	}
	@Override
	public void registerObserver (Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver (Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers () {
		for(Observer o : observers){
			o.update(weight,temperature,expirationDate);
		}
	}

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
	public void measurementsChanged(){

		notifyObservers();

		//디스플레이 갱신 부분
	};

	public void  setMeasurements(float weight,float temperature,float expirationDate){
		this.temperature = temperature;
		this.weight = weight;
		this.expirationDate = expirationDate;
		measurementsChanged();
	}
}
