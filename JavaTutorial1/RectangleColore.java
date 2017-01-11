package com.java.abs;

public class RectangleColore extends Rectangle {
	
	private String couleur ;
	Rectangle r = new Rectangle();
	
	public RectangleColore( Double largeur, Double hauteur, String couleur)
	{
			r.setHauteur(hauteur);
			r.setLargeur(largeur);
			this.couleur = couleur ;
	}
	
	
	

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}




	@Override
	public String toString() {
		return "Rectangle \n largeur = " + r.getLargeur() + "\n hauteur = "+ r.getHauteur()+"\n couleur = " +couleur;
		
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
				return ( getLargeur() == r.getLargeur() && getHauteur() == r.getHauteur() && couleur == getCouleur());
			}
			
		}
	
	}

}
