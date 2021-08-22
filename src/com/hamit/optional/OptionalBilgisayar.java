package com.hamit.optional;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptionalBilgisayar implements Serializable{
	private static final long serialVersionUID = 4732046243755404990L;
	
	private String bilgisayarAdi;
	private String bilgisayarFiyati;
	private String bilgisayarMarkasi;
	private String bilgisayarFabrikasi;
}
