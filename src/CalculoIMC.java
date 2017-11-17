import java.util.Scanner;

/*
 * 
 * El siguiente código debería calcular el IMC y devolver el resultado pero algo anda mal
 * respecto a las tablas de IMC
 * Comprobarlo en http://www.calculoimc.com/
 * 
 * PERO ESTA ALGO ESTA MAL
 * 
 */

public class CalculoIMC {
	public static double calcularIMC(double a,int p){
		return a/p*p;
	}
	public static void main(String[] args) {
		//Incorporamos el escaner de entrada
		Scanner sc = new Scanner(System.in);
		//Dos numeros
		System.out.println("Introduce tu altura en cm sin decimales:");
		int altura = sc.nextInt();
		double alturaM=(double)altura;
		System.out.println("Introduce tu peso en kg sin decimales:");
		int peso = sc.nextInt();
		//Calculamos el IMC
		double imc=calcularIMC(alturaM,peso);
		System.out.println("IMC:"+imc);
		String cad="";
		if(imc<16.00){
		  cad="Infrapeso: Delgadez Severa";
		}else if(imc<=16.00 || imc<=16.99){
		  cad="Infrapeso: Delgadez moderada";
		}else if(imc<=17.00 ||imc<=18.49){
		  cad="Infrapeso: Delgadez aceptable";
		}else if(imc<=18.50 || imc<=24.99){
		  cad="Peso Normal";
		}else if(imc<=25.00 || imc<=29.99){
		  cad="Sobrepeso";
		}else if(imc<=30.00 || imc<=34.99){
		  cad="Obeso: Tipo I";
		}else if(imc<=35.00 || imc==40.00){
		  cad="Obeso: Tipo III";
		}else{
		  cad="no existe clasificacion";
		}
		 System.out.println(cad);
	}
}
