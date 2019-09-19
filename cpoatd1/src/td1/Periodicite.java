package td1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Periodicite extends Connexion {
	
	Connection laConnexion = null;
	
	private int id;
	private String libelle;
	
public Periodicite(int id , String libelle) {
		this.id = id ;
		this.libelle = libelle;
	}
	
public int getId() {
		return id;
	}
public void setId(int id) {
		this.id = id;
	}

public String getLibelle() {
		return libelle;
	}
public void setLib(String libelle) {
		this.libelle = libelle;
	}
	
}
