public class Practica {

	public static void main(String[] args) {
		Practica p = new Practica();
		System.out.println("diff21" + (p.diff21(19) == 2 ? "Ok" : "Error"));
		System.out.println("diff21" + (p.diff21(10) == 11 ? "Ok" : "Error"));
		System.out.println("diff21" + (p.diff21(21) == 0 ? "Ok" : "Error"));
		System.out.println("sumDouble" + (p.sumDouble(1, 2) == 3 ? "Ok" : "Error"));
		System.out.println("sumDouble" + (p.sumDouble(3, 2) == 5 ? "Ok" : "Error"));
		System.out.println("sumDouble" + (p.sumDouble(2, 2) == 8 ? "Ok" : "Error"));
		System.out.println("icyHot" + (p.icyHot(120, -1) == true ? "Ok" : "Error"));
		System.out.println("icyHot" + (p.icyHot(-1, 120) == true ? "Ok" : "Error"));
		System.out.println("icyHot" + (p.icyHot(2, 120) == false ? "Ok" : "Error"));
		System.out.println("close10" + (p.close10(8, 13) == 8 ? "Ok" : "Error"));
		System.out.println("close10" + (p.close10(13, 8) == 8 ? "Ok" : "Error"));
		System.out.println("close10" + (p.close10(13, 7) == 0 ? "Ok" : "Error"));
		System.out.println("posNeg" + (p.posNeg(1, -1, false) == true ? "Ok" : "Error"));
		System.out.println("posNeg" + (p.posNeg(-1, 1, false) == true ? "Ok" : "Error"));
		System.out.println("posNeg" + (p.posNeg(-4, -5, true) == true ? "Ok" : "Error"));
	}

	/*
	Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
	diff21(19) → 2
	diff21(10) → 11
	diff21(21) → 0
	*/
	public int diff21(int n) {
	  return 0;
	}

	/*
	Given two int values, return their sum. Unless the two values are the same, then return double their sum.
	sumDouble(1, 2) → 3
	sumDouble(3, 2) → 5
	sumDouble(2, 2) → 8
	*/
	public int sumDouble(int a, int b) {
		return 0;
	}

	/*
	Given two temperatures, return true if one is less than 0 and the other is greater than 100.
	icyHot(120, -1) → true
	icyHot(-1, 120) → true
	icyHot(2, 120) → false
	*/
	public boolean icyHot(int temp1, int temp2) {
		return true;
	}

	/*
	Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
	close10(8, 13) → 8
	close10(13, 8) → 8
	close10(13, 7) → 0
	*/
	public int close10(int a, int b) {
		return 0;
	}

	/*
	Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
	posNeg(1, -1, false) → true
	posNeg(-1, 1, false) → true
	posNeg(-4, -5, true) → true
	*/
	public boolean posNeg(int a, int b, boolean negative) {
		return true;
	}

}

