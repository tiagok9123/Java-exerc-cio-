
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		
	    double tri, cir, tra, qua,ret;
	    double A, B, C, pi =  3.14159;
	    
	    System.out.printf("DIGITE A, B e C:");
	    A = sc.nextDouble();
	    B = sc.nextDouble();
	    C = sc.nextDouble();
	    
	    tri = (B * A)/2;
	    cir = pi * Math.pow(C, 2);
	    tra = ((A + B) * C) / 2.0;
	    qua = Math.pow(B, 2);
	    ret = A * B;
		
	    System.out.printf("TRIANGULO: %.3f%", tri);
	    System.out.printf("CIRCULO:  %.3f%", cir);
	    System.out.printf("TRAPEZIO: %.3f%", tra);
	    System.out.printf("QUADRADO: %.3f%", qua);
	    System.out.printf("RETANGULO: %.3f%", ret);
	
		sc.close();
		
		

	}

}
