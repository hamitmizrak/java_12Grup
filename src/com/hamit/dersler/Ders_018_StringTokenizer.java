package com.hamit.dersler;

import java.util.StringTokenizer;

public class Ders_018_StringTokenizer {

	public static void main(String[] args) {
		// parçalamak için
		// 1-) .split

		// 2-) .strigTokenizer
		String str = "JavaSE |JavaEE  Servlet  JSP & JSF";

		StringTokenizer stringTokenizer = new StringTokenizer(str, "|");
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}

}
