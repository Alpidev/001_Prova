package it.alpigroup.libretto.model;

import java.util.*;


import javafx.scene.control.SplitPane.Divider;

public class LibrettoModel {

	private List<Esame> libretto;
	Esame es;
	
	public LibrettoModel(){
		libretto = new LinkedList<Esame>();
	
	}
	
	public Integer getNumEsami(){
		return libretto.size();
	}
	public void addEsame(Esame e){
		libretto.add(e);
	}
	
	public Double getMediaVoti(){
		
		int totalevoti =0;
		
	for(Esame e: libretto)	{
		
		try {
			totalevoti += e.getVoto();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
	try{
	     return (double) (totalevoti/libretto.size());
	   }
	catch (ArithmeticException e)
	{
		 return 0.0;
	}
			                  }
	
	
	
	
	
}
