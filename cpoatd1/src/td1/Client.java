package td1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Client extends Connexion {
	
	Connection laConnexion = null;
	
	private int id_client;
	private String nom;
	private String prenom;
	private int no_rue;
	private String voie;
	private int code_postal;
	private String ville;
	private String pays;
	
public Client (int id_client, String nom, String prenom, int no_rue, String voie, int code_postal, String ville, String pays) {
		this.id_client = id_client;
		this.nom = nom;
		this.prenom = prenom;
		this.no_rue = no_rue;
		this.voie = voie;
		this.code_postal = code_postal;
		this.ville = ville;
		this.pays = pays;
		}

public int getId_client() {
	return id_client;
}

public void setId_client(int id_client) {
	this.id_client = id_client;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public int getNo_rue() {
	return no_rue;
}

public void setNo_rue(int no_rue) {
	this.no_rue = no_rue;
}

public String getVoie() {
	return voie;
}

public void setVoie(String voie) {
	this.voie = voie;
}

public int getCode_postal() {
	return code_postal;
}

public void setCode_postal(int code_postal) {
	this.code_postal = code_postal;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public String getPays() {
	return pays;
}

public void setPays(String pays) {
	this.pays = pays;
}
	
}
