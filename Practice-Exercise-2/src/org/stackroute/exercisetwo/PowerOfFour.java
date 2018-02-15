package org.stackroute.exercisetwo;


public class PowerOfFour {
	
	
	public boolean checkForPowerOfFour(String number) {
		double num = Double.parseDouble(number);  
		while(true) {
			if(num == 0) {
				return false;
			}
			if(num == 1) {
				return true;
			}
			double res = num % 4;
			if(res != 0) {
				return false;
			}
			num = num / 4;
			
		}
	}
}
