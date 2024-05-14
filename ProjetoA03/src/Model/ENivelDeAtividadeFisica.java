package Model;

public enum ENivelDeAtividadeFisica {
	
	SEDENTARIO(1.2), MODERADAMENTE_ATIVO(1.55), EXTREMAMENTE_ATIVO(1.725);

	private final double fator;

	ENivelDeAtividadeFisica(double fator) {
		this.fator = fator;

	}

	public double getFator() {
		return fator;
	}

}