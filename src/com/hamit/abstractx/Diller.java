package com.hamit.abstractx;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Diller implements Serializable {
	private static final long serialVersionUID = 13243914257111193L;
	
	protected String dilAdi;
	protected String dilTarihi;
	
	public void deneme() {
		System.out.println ( "Ben Abstract metodum "+ this.dilAdi );
	}
	
	abstract public void deneme2Gövdesiz();
	
	public void simdikiTarihiVer() {
		System.out.println ( new java.util.Date(System.currentTimeMillis ( )) );
	}
	
}
