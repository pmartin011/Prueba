package Practica4;
import java.util.Scanner;

public class Diccionario {

	public static Scanner tec = new Scanner(System.in);
	
	public static final String [] IDIOMAS= {"","","ingles","frances","español"};
	public static class Palabra{
		private String esp;
		private String ing;
		private String fran;
		Palabra(){
			esp = "";
			ing = "";
			fran = "";
		}
		
		public void setEsp(String e) {
			esp = e;
		}
		public void setIng(String e) {
			ing = e;
		}
		public void setFran(String e) {
			fran = e;
		}
		public String getEsp() {
			return esp;
		}
		public String getIng() {
			return ing;
		}
		public String getFran() {
			return fran;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		final int tam=9;
		Palabra palabras[]=new Palabra[tam];
		
		
		String palIng;
		String palFra;
		String palEsp;

		
		int a=0;
		int cont=0;
		boolean existe;
		boolean terminar=false;
		
		do {
			System.out.println();
	
			System.out.println("TRADUCTOR DE INGLES / FRANCES / ESPANYOL");
			System.out.println();
			System.out.println("1. Introducir datos  \n2. Buscar en ingles \n3. Buscar en frances \n4. Buscar en espanyol \n5. Terminar"); 
			a=tec.nextInt();
			tec.nextLine();
			
			switch(a) {
			case 1:
				if(cont==tam)
					System.out.println("El diccionario esta lleno");
				else {
				Palabra palabra;
				System.out.println("Introduce la palabra en ingles");
				palIng=tec.nextLine();
				
				System.out.println("Introduce la palabra en frances");
				palFra=tec.nextLine();
				
				System.out.println("Introduce la palabra en espanyol");
				palEsp=tec.nextLine();

				palabras[cont] = new Palabra();
				palabras[cont].setIng(palIng);
				palabras[cont].setFran(palFra);
				palabras[cont].setEsp(palEsp);
				cont++;
				}
			break;
				
			case 2:
				
			case 3:
				
			case 4:
				buscarpalabra(palabras, cont, a);	
			break;
				
			case 5:
				System.out.println("El programa ha finalizado");
				terminar=true;
			
				break;
				
			default:
				System.out.println("La opcion seleccionada es incorrecta");
			
			}
			
		}while(terminar!=true);
	}
	
	public static void buscarpalabra (Palabra p[], int cont, int id) {
		
		System.out.println("Escriba la palabra en "+IDIOMAS [id]+"  que desea traducir o el caracter * para volver al menu principal");
		String palabra=tec.nextLine();
		
		while(!palabra.equals("*")){
			
		
			
		int i;
		boolean existe=false;
		for(i=0; i<cont &&!existe;  i++) {
			switch  (id) {
			case 2:
				if(palabra.equalsIgnoreCase(p[i].getIng())) {
					existe=true;
				}	
			break;
			case 3:
				if(palabra.equalsIgnoreCase(p[i].getIng())) {
					existe=true;
				}	
			break;
			case 4:
				if(palabra.equalsIgnoreCase(p[i].getEsp())) {
					existe=true;
				}	
			break;
			}
			
		}
		if(existe==false)
			System.out.println("La palabra "+palabra.toUpperCase()+" no se encuentra en este traductor");
		
		else {
			System.out.println("INGLES: "+(p[i-1].getIng()).toUpperCase()+" / FRANCES: "+(p[i-1].getFran()).toUpperCase()+" / ESPANYOL: "+(p[i-1].getEsp()).toUpperCase());

		}
		System.out.println("Escriba la palabra en ingles que desea traducir o el caracter * para volver al menu principal");
		palabra=tec.nextLine();
		
		}	
		
	}
	

}