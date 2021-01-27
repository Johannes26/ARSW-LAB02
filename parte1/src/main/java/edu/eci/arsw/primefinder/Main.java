package edu.eci.arsw.primefinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		PrimeFinder nuevo= new PrimeFinder(3,30000000);
		nuevo.Ejecucion();
		System.out.println("Presione Enter Para Continuar");
		String a= ".";
		while(!a.equals("")) {
			Scanner in = new Scanner(System.in);
			a= in.nextLine();
		}
		nuevo.Reanudar();
	}
	
}
