package Model;

import View.TelaCalculadora;

public class Usuario {
	 private double TMB;
	 private double GC;


	public void CalculoHomem(int altura, int peso, int idade, double NivelDeAtividadeFisica) {

		this.TMB = 66.47 + (13.75 * peso) + (5 * altura) - (6.76 * idade);

		this.GC = TMB * NivelDeAtividadeFisica;
		
	}
	
	public void CalculoMulher(int altura, int peso, int idade, double NivelDeAtividadeFisica) {

		this.TMB = 655.1 + (9.56 * peso) + (1.85 * altura) - (4.68 * idade);

		this.GC = TMB * NivelDeAtividadeFisica;
		
	}


	public double getTMB() {
		return TMB;
	}


	public void setTMB(double tMB) {
		TMB = tMB;
	}


	public double getGC() {
		return GC;
	}


	public void setGC(double gC) {
		GC = gC;
	}
	
	

}
