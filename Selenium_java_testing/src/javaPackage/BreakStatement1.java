package javaPackage;

public class BreakStatement1 {

	public static void main(String[] args) {
		
//		for(int i =0; i<5; i++) {
//			
//			// if statement
//			if(i==3) {
//				break; //break loop
//			}
//			System.out.println(i);
//		}
		
		
		String[] countrys = {"Us","England","Russia","Austrelia","India","Pakistan"};
		for(String country:countrys) {
			
			String lowerCaseCountry = country.toLowerCase();
			if(lowerCaseCountry == "india") {
				break;
			}
			System.out.println(country);
		}
	}

}
