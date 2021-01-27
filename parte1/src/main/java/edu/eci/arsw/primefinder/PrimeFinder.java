package edu.eci.arsw.primefinder;



public class PrimeFinder {
	
	private int n;
	private int numdatos;
	public PrimeFinder(int n, int numdatos)
	{
        this.n=n;
        this.numdatos=numdatos;
	}
	public void Ejecucion()
	{
        for (int x=0; x<n; x++) {
        	int limiteinf= x*(numdatos/n);
        	int limitesup = ((x+1)*(numdatos/n))-1;
        	PrimeFinderThread t = new PrimeFinderThread(limiteinf,limitesup);
        	//hilos.add(t);
        	t.start();
        }
	}
}
