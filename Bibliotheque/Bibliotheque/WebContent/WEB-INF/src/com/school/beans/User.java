package com.school.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@SessionScoped
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstname;
	private String lastname;
	private String mdp;
	private boolean married;
	private String sexe;

	public User() {
		System.out.println("Creation User");
	}

	public String getFirstname() {
		System.out.println("call getFirstname");

		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
		System.out.println("call setFirstname");

	}

	public String getLastname() {
		System.out.println("call getLastname");
		return lastname;

	}

	public void setLastname(String lastname) {
		System.out.println("call setLastname");
		this.lastname = lastname;

	}

	public String getMdp() {
		System.out.println("call getMdp");
		return mdp;
	}

	public void setMdp(String mdp) {
		System.out.println("call setMdp");
		this.mdp = mdp;
	}
	
	public boolean isMarried() {
		System.out.println("call isMarried");
		return married;
	}

	public void setMarried(boolean married) {
		System.out.println("call setMarried");
		this.married = married;
	}
	
	

	public String getSexe() {
		System.out.println("call getSexe");
		return sexe;
	}

	public void setSexe(String sexe) {
		System.out.println("call setSexe");
		this.sexe = sexe;
	}

	@Override
	protected void finalize() {

		System.out.println("destruction de la classe");

	}
	
	public void afficherUser() {
		System.out.println("Nom"+ firstname);
		System.out.println("Prenom"+ lastname);
		System.out.println("Sexe"+ sexe);
		System.out.println("Vous etes"+ married);
	}


}
