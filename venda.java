import java.util.Locale;

public class Main {

	private static final Object X = null;

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		 
	        System.out.println("Products:");
	        System.out.printf("%s, which price is $ %.2f", product1, price1);
	        System.out.println();
	        System.out.printf("%s, wich price is $ %.2f", product2, price2 );
			System.out.println();
			System.out.println();
			System.out.printf("Record: %d years old, code %d ande gender %s", age, code, gender);
			System.out.println();
			System.out.println();
			System.out.printf("measure with eight decimal places: %.8f", measure);
			System.out.println();
			System.out.printf("rouded (three decimal place):%.2f", measure);
			System.out.println();
			Locale.setDefault(Locale.US);
			System.out.printf("US decimal point: %.3f", measure);
	        
	       
	}

}
