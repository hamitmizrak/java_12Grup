package com.hamit.interfacex;


public interface IMarket {

	//gövdesiz method
	public void anahtariAl();
	public void arabaKullan();
	public void marketeGit();
	public String eveGel(String geldinMi);
	
	default public void govdeliMethod() {}
}
