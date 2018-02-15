
public class LongFactorial {

	public String factorial(String number) {
		try {
			if(Math.floor(Double.parseDouble(number)) != Double.parseDouble(number)) {
				return "Invalid Input:No Fractions Allowed";
			}			
		} catch (NumberFormatException e) {
			
		}
		
		if(isInteger(number)){
			Long num = Long.parseLong(number);			
			Long fact = new Long(1);
			while(num > 1) {
				if((fact * num) < fact) {
					return "Out of Range";
				}
				fact = fact * num;
				num--;
			}
			return Long.toString(fact);
		}
		else {
			return "Invalid Input:Enter Numbers Only";
		}
	}
	
	public static boolean isInteger(String number) {
		boolean valid = false;
		try {
			Integer.parseInt(number);
			valid = true;
		} catch (NumberFormatException e) {
			
		}
		
		return valid;
	}
}
