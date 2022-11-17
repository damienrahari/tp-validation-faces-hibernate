package entity;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "livre")
@SessionScoped
public class Livre implements Serializable {
	private static final long serialVersionUID = 1L;

	private String titre;

	private String auteur;

	private String date;

	private int prix;

	public Livre() {

	}

	public Livre(String titre, String auteur, String date, int prix) {
		this.titre = titre;
		this.auteur = auteur;
		this.date = date;
		this.prix = prix;
	}

	

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	protected void finalize() {

		System.out.println("destruction de la classe");

	}

}
