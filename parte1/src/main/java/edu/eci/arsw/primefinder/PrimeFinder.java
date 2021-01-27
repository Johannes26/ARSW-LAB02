package edu.eci.arsw.primefinder;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class PrimeFinder {
	
	private int n;
	private int numdatos;
	private ArrayList<PrimeFinderThread> hilos;
	public PrimeFinder(int n, int numdatos)
	{
        this.n=n;
        this.numdatos=numdatos;
        hilos=new ArrayList<PrimeFinderThread>();
	}
	public void Ejecucion()
	{
        for (int x=0; x<n; x++) {
        	int limiteinf= x*(numdatos/n);
        	int limitesup = ((x+1)*(numdatos/n))-1;
        	PrimeFinderThread t = new PrimeFinderThread(limiteinf,limitesup);
        	hilos.add(t);
        	t.start();
        }
        
        try {
            Thread.sleep(5*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        
        Pausar();
	}
	
	public void Reanudar() {
		for(PrimeFinderThread a: hilos){
        	a.reanudarhilo();
        }
	}
	
	public void Pausar() {
		for(PrimeFinderThread a: hilos){
        	a.pausarhilo();
        }
	}
	
	
	
	
}
