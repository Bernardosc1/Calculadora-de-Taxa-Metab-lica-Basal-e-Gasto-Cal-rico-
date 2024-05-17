package Model;

public class Usuario {
    private double TMB;
    private double GC;
    private double IMC;
    private EResultadoIMC IMCres;
    
    public Usuario() {
	
	}

    public void CalculoHomem(double alturaCm, double peso, int idade, double NivelDeAtividadeFisica) {
        double altura = alturaCm / 100.0;  // Convertendo altura de cm para metros
        
        this.IMC = peso / (altura * altura);
        
        
        verficarIMC();
        
        this.TMB = 66.47 + (13.75 * peso) + (5 * alturaCm) - (6.76 * idade);

        this.GC = TMB * NivelDeAtividadeFisica;
    }

    public void CalculoMulher(double alturaCm, double peso, int idade, double NivelDeAtividadeFisica) {
        double altura = alturaCm / 100.0;  
        
        this.IMC = peso / (altura * altura);
        
       verficarIMC();
        
        this.TMB = 655.1 + (9.56 * peso) + (1.85 * alturaCm) - (4.68 * idade);

        this.GC = TMB * NivelDeAtividadeFisica;
    }
    
    //Verificar como está o IMC
    private void verficarIMC(){
    	  if (IMC < 18.5) {
              IMCres = EResultadoIMC.ABAIXO_PESO;
          } else if (IMC >= 18.5 && IMC <= 24.9) {
              IMCres = EResultadoIMC.PESO_IDEAL;
          } else if (IMC >= 25 && IMC <= 29.9) {
              IMCres = EResultadoIMC.SOBRE_PESO;
          } else if (IMC >= 30) {
              IMCres = EResultadoIMC.OBESIDADE;
          }
    }


	public EResultadoIMC getIMCres() {
		return IMCres;
	}

	public void setIMCres(EResultadoIMC iMCres) {
		IMCres = iMCres;
	}

	public double getIMC() {
		return IMC;
	}

	public void setIMC(double iMC) {
		IMC = iMC;
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
