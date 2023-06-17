package day5_chapitre4;

import java.util.Date;

public class Employer {
	private String nom;
	private double salaire;
	private int age;
	private Date naiss;
	
	public Date getNaiss() {
		return naiss;
	}

	public void setNaiss(Date naiss) {
		this.naiss = naiss;
	}

	private boolean doctor;
	
	public boolean isDoctor() {
		return doctor;
	}

	public void setDoctor(boolean doctor) {
		this.doctor = doctor;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if ((nom.length() <5 ) || (nom.length() > 20 ))
			throw new IllegalArgumentException("Votre nom est invalide");
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		if ((salaire <400 ) || (salaire >10000 ))
			throw new IllegalArgumentException("Salaire invalide");
		this.salaire = salaire;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if ((age <20 ) || (age> 65))
			throw new IllegalArgumentException("Age invalide");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employer [nom=" + nom + ", salaire=" + salaire + ", age=" + age + "]";
	}

}
