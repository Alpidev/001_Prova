package it.alpigroup.libretto.model;


public class TestEsame {


public static void main(String[] args) {
	Esame asas= new Esame("015","TDP",new Docente());
	System.out.println(asas.hashCode());
   System.out.println(asas);
		try {
			int nn=asas.getVoto();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Esame non superato");
		}
	
		

	
}
}
