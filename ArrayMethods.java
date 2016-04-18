package Gazzayeatman.PR282.JavaControlExcercises;

public class ArrayMethods {

	public ArrayMethods() {
		// TODO Auto-generated constructor stub
	}
	public static int arrayMinValue(int[] a){
		int result = 200;
		int length = a.length;
		for (int i = 0; i < length; i++){
			if (a[i] < result){
				result = a[i];
			}
		}
		return result;
	}
	public static int arrayMaxValue(int[] a){
		int result = 0;
		int length = a.length;
		for (int i = 0; i < length; i++){
			if (a[i] > result){
				result = a[i];
			}
		}
		return result;
	}
	public static int arraySum(int[] a){
		int result = 0;
		int length = a.length;
		for (int i = 0; i < length; i++){
			result += a[i];
		}
		return result;
	}
	public static int arraySumSquared(int[] a){
		int result = 0;
		int length = a.length;
		for (int i = 0; i < length; i++){
			result += a[i] * a[i];
		}
		return result;
	}
	public static String displayIntArray(int[] rayRay){
		String result = "";
		for (int i = 0; i < rayRay.length; i++){
			result +=  " " + rayRay[i];
		}
		return result;
	}
	public static String displayCharArray(char[] rayRay){
		String result = "";
		for (int i = 0; i < rayRay.length; i++){
			result += rayRay[i];
		}
		return result;
	}
}
