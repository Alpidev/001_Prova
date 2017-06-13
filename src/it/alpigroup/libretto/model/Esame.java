package it.alpigroup.libretto.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Esame {
    final private List<ArrayList<String>> a = new ArrayList<>();
	private LocalDate data ;
	private String codice;
	private String corso;
	private int voto;
	private Docente docente;
	private Superato superato;
	
	
@Override
	public int hashCode() {

	final int prime =31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		result = prime * result + ((corso == null) ? 0 : corso.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((docente == null) ? 0 : docente.hashCode());
		result = prime * result + ((superato == null) ? 0 : superato.hashCode());
		result = prime * result + voto;
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
		Esame other = (Esame) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		if (corso == null) {
			if (other.corso != null)
				return false;
		} else if (!corso.equals(other.corso))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (docente == null) {
			if (other.docente != null)
				return false;
		} else if (!docente.equals(other.docente))
			return false;
		if (superato == null) {
			if (other.superato != null)
				return false;
		} else if (!superato.equals(other.superato))
			return false;
		if (voto != other.voto)
			return false;
		return true;
	}



@Override
	public String toString() {
		return "Esame [data=" + data + ", codice=" + codice + ", corso=" + corso + ", voto=" + voto + ", docente="
				+ docente + ", esito=" + superato + "]";
	}



/**
 * 
 * @param codice 
 * @param corso
 * @param docente 
 */
	public Esame(String codice, String corso, Docente docente) {
	
		this.codice = codice;
		this.corso = corso;
		this.docente = docente;
		this.superato=new Superato();
		superato.setSuperamento(true);
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Piero");
		a.add(a1);
	}

	

	public boolean isSuperato() {
	return superato.computeValue();
}



public void setSuperato(boolean superato) {
	this.superato.setSuperamento(superato); 
}



	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public int getVoto() throws Exception{
		if(!superato.computeValue())
			throw new Exception();
		else
			return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	
}
