package com.java.abs;

public class Rectangle {

	
	private double largeur ;
	
	private double hauteur ;

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur ;
	}
	
	public Rectangle()
	{
		
	}

	public Rectangle(double largeur, double hauteur) {
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	@Override
	public String toString() {
		return "Rectangle : \n  largeur= " + largeur + " \n  hauteur = " + hauteur + "";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
		{
			return false ;
		}
		else
		{
			if(obj.getClass() != getClass())
			{
				return false ;
			}
			else
			{
				Rectangle r = (Rectangle)obj ;
				return ( largeur == r.largeur && hauteur == r.hauteur );
			}
			
		}
	
	}

	
}
