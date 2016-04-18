package Gazzayeatman.PR282.JavaControlExcercises;

public enum monthValue {
JANUARY(1, 1), 
FEBRUARY(4, 2), 
MARCH(4, 3), 
APRIL(4, 4), 
MAY(2, 5), 
JUNE(5, 6), 
JULY(0, 7), 
AUGUST(3, 8), 
SEPTEMBER(6, 9), 
OCTOBER(1, 10), 
NOVEMBER(4, 11), 
DECEMBER(6, 12);

	public int a;
	public int month;

	monthValue(int b, int c){
		this.a = b;
		this.month = c;
	}
}
