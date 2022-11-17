package entity;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@ManagedBean(name = "livre")
@Entity(name = "livre")
@Table(name = "livre")
public class Livre implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "titre")
	private String titre;
	@Column(name = "auteur")
	private String auteur;
	@Column(name = "date")
	private String date;
	@Column(name = "prix")
	private int prix;

	

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
