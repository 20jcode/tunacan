package org.c3;

public abstract class CondimentDecorator extends Beverage{//Beverage자리에 들어갈 수 잇어야
	Beverage beverage; //데코레이터가 감쌀 음료
	public abstract String getDescription(); //첨가물 데코레이터가 구현해야함

}
