public class PracticeProblem {

	public static void main(String args[]) {
		// coonvert to string
		System.out.println(CampbellClass.convertString(3));
		System.out.println(CampbellClass.convertString(3.14));
		System.out.println(CampbellClass.convertString(']'));
		System.out.println(CampbellClass.convertString(false));

		//convert from m to cm
		System.out.println(CampbellClass.convertMetersToCenti(34));
		System.out.println(CampbellClass.convertMetersToCenti(12));

		//remove non alpha
		System.out.println(CampbellClass.removeNonAlpha("Care Givers"));
		System.out.println(CampbellClass.removeNonAlpha("What-ever"));
		
	}

}
