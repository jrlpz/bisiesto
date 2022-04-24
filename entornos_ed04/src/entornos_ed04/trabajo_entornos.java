package entornos_ed04;

import java.util.Scanner;

public class trabajo_entornos{
    private static int anio;

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        extracted();
        anio = sc.nextInt();
       
        if(!trabajo_entornos.calculoBisiesto(anio)){  //llamada al método
           String anyo = "El año "+anio+" es bisiesto";
		System.out.println(anyo);
           
        }else{
           System.out.println("El año "+anio+" no es bisiesto");
        }
    }

	private static void extracted() {
		System.out.print("Introduce el año: ");
	}
   
    public static boolean calculoBisiesto(double valor){ //método booleano:
        if (valor%4==0 && valor%100!=0 )  //devuelve true si es bisiesto
           return false;                      //devuelve false si no es bisiesto
        else if(valor%400==0) {
        	 return false;  
        }
        else
           return true;
    }
}


