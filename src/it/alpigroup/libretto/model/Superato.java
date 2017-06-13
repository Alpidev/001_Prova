package it.alpigroup.libretto.model;



public class Superato {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (superamento ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Superato other = (Superato) obj;
		if (superamento != other.superamento)
			return false;
		return true;
	}


	/**La classe wrappa questo semplice valore booleano 
	 * 
	 */
	private boolean superamento;//essendo un tipo primitivo ha un valore di default
	                            // su false  
	
	public Superato(boolean superato) {
		
		this.superamento = superato;
		
	}
	public Superato() {
		
		
	}
	public boolean isSuperamento() {
		return superamento;
	}

	public void setSuperamento(boolean superamento) {
		this.superamento = superamento;
	}

	@Override
	public String toString() {
		return superamento ? "ESAME SUPERATO" : "ESAME NON SUPERATO";
	}
	
	
	public boolean computeValue() {
		// TODO Auto-generated method stub
		return superamento;
	}

}
