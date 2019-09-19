package td1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Connexion {
	
	public Connection creeConnexion() {
		
		String url= "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/boudou1u_cpao1";
		url += "?serverTimezone=Europe/Paris";
		String login = "boudou1u_appli";
		String pwd = "31804390";
		Connection maConnexion = null;
		
		try {
			maConnexion = DriverManager.getConnection(url, login, pwd);
		} catch (SQLException sqle) {
			System.out.println("Erreur connexion " + sqle.getMessage());
		}
		
		return maConnexion;
	}
	
	public boolean addPerio (Periodicite obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("INSERT INTO Periodicite (id_periodicite, libelle) values (?, ?)");
			requete.setInt(1, obj.getId());
			requete.setString(2, obj.getLibelle());
			int nbLignes = requete.executeUpdate( );
			} catch (SQLException sqle)
			{ 
				System.out.println("Pb select" + sqle.getMessage());
			} 
		
		return false ;
		
	}
	
	public boolean changePerio(Periodicite obj) {
		try {	
			PreparedStatement requete = this.creeConnexion().prepareStatement("UPDATE Periodicite SET libelle = ? WHERE id_periodicite = ? ");
			requete.setString(1, obj.getLibelle());
			requete.setInt(2, obj.getId());
			
			int nbLignes = requete.executeUpdate();
			} catch (SQLException sqle)
			{ 
				System.out.println("Pb select" + sqle.getMessage());
				} 
			return false ;
	}

	public boolean deletePerio(Periodicite obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("DELETE FROM Periodicite WHERE id_periodicite = ?");
			requete.setInt(1, obj.getId());
			int nbLignes = requete.executeUpdate();
			} catch (SQLException sqle)
			{ 
				System.out.println("Pb select" + sqle.getMessage());
				} return false ;
		}
	
	public boolean addRevue (Revue obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("INSERT INTO Revue (id_revue, titre, description, tarif_numero, visuel, id_periodicite) values (?, ?)");
			requete.setInt(1, obj.getId_revue());
			requete.setString(2, obj.getTitre());
			requete.setString(3, obj.getDescription());
			requete.setDouble(4, obj.getTarif_numero());
			requete.setString(5, obj.getVisuel());
			requete.setInt(6, obj.getId_periodicite());
			int nbLignes = requete.executeUpdate( );
			} 
		catch (SQLException sqle) { 
			System.out.println("Pb select" + sqle.getMessage());
			} 
		return false ;
		
	}

	public boolean changeRevue(Revue obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("UPDATE Revue SET titre = ?, description = ?, tarif_numero = ?, visuel = ?, id_perodicite = ? WHERE id_revue = ?");
			requete.setString(1, obj.getTitre());
			requete.setString(2, obj.getDescription());
			requete.setDouble(3, obj.getTarif_numero());
			requete.setString(4, obj.getVisuel());
			requete.setInt(5, obj.getId_periodicite());
			requete.setInt(6, obj.getId_revue());
			int nbLignes = requete.executeUpdate();
			}
		catch (SQLException sqle) { 
			System.out.println("Pb select" + sqle.getMessage());
			} 
		return false ;
	}

	public boolean deleteRevue(Revue obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("DELETE FROM Revue WHERE id_revue = ?");
			requete.setInt(1, obj.getId_revue());
			int nbLignes = requete.executeUpdate();
		    } 
		catch (SQLException sqle) {
		    System.out.println("Pb select" + sqle.getMessage());
		    } 
		return false ;
			
		}
	
	public boolean addClient (Client obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("INSERT INTO Client (id_client, nom, prenom, no_rue,voie, code_postal, ville, pays) values (?, ?)");
			requete.setInt(1, obj.getId_client());
			requete.setString(2, obj.getNom());
			requete.setString(3, obj.getPrenom());
			requete.setInt(4, obj.getNo_rue());
			requete.setString(5, obj.getVoie());
			requete.setInt(6, obj.getCode_postal());
			requete.setString(7, obj.getVille());
			requete.setString(8, obj.getPays());
			int nbLignes = requete.executeUpdate( );
			} 
		catch (SQLException sqle) { 
			System.out.println("Pb select" + sqle.getMessage());
			} 
		return false ;
		
	}

	public boolean changeClient(Client obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("UPDATE Client SET nom = ?, prenom = ?, no_rue = ?,voie = ?, code_postal = ?, ville = ?, pays = ? WHERE id_client = ? ");
			requete.setString(1, obj.getNom());
			requete.setString(2, obj.getPrenom());
			requete.setInt(3, obj.getNo_rue());
			requete.setString(4, obj.getVoie());
			requete.setInt(5, obj.getCode_postal());
			requete.setString(6, obj.getVille());
			requete.setString(7, obj.getPays());
			requete.setInt(8, obj.getId_client());
			int nbLignes = requete.executeUpdate();
			} 
		catch (SQLException sqle) { 
			System.out.println("Pb select" + sqle.getMessage());
			} 
		return false ;
	}

	public boolean deleteClient(Client obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("DELETE FROM Client WHERE id_client = ?");
			requete.setInt(1, obj.getId_client());
			int nbLignes = requete.executeUpdate();
		    }
		catch (SQLException sqle) {
		    System.out.println("Pb select" + sqle.getMessage());
		    } 
		return false ;
			
		}
	
	public boolean addAbo (Abonnement obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("INSERT INTO Abonnement (id_client, id_revue, date_debut, date_fin) values (?, ?)");
			requete.setInt(1, obj.getId_client());
			requete.setInt(1, obj.getId_revue());
			requete.setString(1, obj.getDate_debut());
			requete.setString(1, obj.getDate_fin());
			int nbLignes = requete.executeUpdate( );
			} 
		catch (SQLException sqle) { 
			System.out.println("Pb select" + sqle.getMessage());
			} 
		
		return false ;
		
	}

	public boolean changeAbo(Abonnement obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("UPDATE Abonnement SET date_debut = ? WHERE id_revue = ? AND id_client = ?");
			requete.setString(1, obj.getDate_debut());
			requete.setString(2, obj.getDate_fin());
			requete.setInt(3, obj.getId_revue());
			requete.setInt(4, obj.getId_client());
			int nbLignes = requete.executeUpdate();
			} 
		catch (SQLException sqle) { 
			System.out.println("Pb select" + sqle.getMessage());
			} 
		return false ;
	}

	public boolean deleteAbo(Abonnement obj) {
		try {
			PreparedStatement requete = this.creeConnexion().prepareStatement("DELETE FROM Abonnement WHERE id_client = ?");
			requete.setInt(1, obj.getId_client());
			int nbLignes = requete.executeUpdate();
		    } 
		catch (SQLException sqle) {
		    System.out.println("Pb select" + sqle.getMessage());
		    } 
		 return false ;
			
		}
	
}
