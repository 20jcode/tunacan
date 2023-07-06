package org.c2;

public class TunaTest {

	public static void main(String[] args){
		tunaData tunaData = new tunaData();

		CurrentConditionsDisplay currentConditionsDisplay =
				new CurrentConditionsDisplay(tunaData);

		tunaData.setMeasurements(20,30,23.1f);

		currentConditionsDisplay.getData();
	}
}
