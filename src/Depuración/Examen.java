package Depuración;

import java.util.Scanner;

public class Examen {
	
		private static Scanner lectura;

		public static void imprime(String mensaje) {
			int i=0;
			System.out.println();
			i = mensaje.length()-1;
			while (i>=0)
			{
				System.out.println(mensaje.charAt(i));
				System.out.println();
				i--; //1 esto no estaba anteriormente no estaba y no salia del bucle 

			}
	
			i=0;
			while ( i<mensaje.length()) 
			{
				System.out.println(mensaje.charAt(i));
				i++;
			}  
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String Contenido = "OpenJDK MOLA-15";
			
			Double num1, num2, num3; //  aqui antes ponia int y lo he cambiado a double 
			
			lectura = new Scanner (System.in);
			System.out.println("Introduce un numero racional:");
			num1 = lectura.nextDouble();
			System.out.println("Introduce un segundo racional:"); // en los 2 escanneres he cambiado a .nextDouble para que puedan coger decimales 
			num2 = lectura.nextDouble();
			
			System.out.println("Primer numero introducido: " + num1);
			System.out.println("Segundo numero introducido " + num2);
			if (num1 <= num2) {
				num3=num2%num1;  // por último aqui ponia num3 = num1%num2 y los he cambiado de orden
				System.out.println("El resto de la división del mayor entre el menor es " + num3);
			}else {
				num3=num1%num2;
				System.out.println("El resto de la división del mayor entre el menor es " + num3);
			}
			imprime(Contenido);
			
			}

	}

