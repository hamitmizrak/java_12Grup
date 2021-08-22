package com.hamit.oop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Kitap2 {
	private String kitapAdi;
	private double kitapFiati;
	private String _basimYili;
}
