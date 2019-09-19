package td1;

import java.util.Scanner; 

public class main {

	public static void main(String[] args) {
		
		Connexion co = new Connexion();
		co.creeConnexion();
		
		System.out.println("Bienvenu sur la base de donnée boudou1u_cpao1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est la table sur laquelle vous voulez opérer? 1: Periodicite / 2: Revue / 3: Abonnement / 4: Client");
		int str = sc.nextInt();
		
		Periodicite perio = new Periodicite(6, "Annuaire");
		Revue revue = new Revue(6, "Barode", "La Nissan GTR", 6.5, "gtr.png", 2);
		Abonnement abo = new Abonnement(6, 8, "15-01-2019", "19-09-2019");
		Client cli = new Client(6, "Boudou", "Zachary", 36, "Richard", 57250, "Fameck", "France");
		
		System.out.println("Quel type d'opération voulez-vous entreprendre? 5: ADD / 6: CHANGE / 7: DELETE");
		int str2 = sc.nextInt();
		
		if (str==1 && str2==5)
		{
			co.addPerio(perio);
		}
		else if (str==1 && str2==6)
		{
			co.changePerio(perio);
		}
		else if (str==1 && str2==7)
		{
			co.deletePerio(perio);
		}
		else if (str==2 && str2==5)
		{
			co.addRevue(revue);
		}
		else if (str==2 && str2==6)
		{
			co.changeRevue(revue);
		}
		else if (str==2 && str2==7)	
		{
			co.deleteRevue(revue);
		}
		else if (str==3 && str2==5)
		{
			co.addAbo(abo);
		}
		else if (str==3 && str2==6)
		{
			co.changeAbo(abo);
		}
		else if (str==3 && str2==7)
		{
			co.deleteAbo(abo);
		}
		else if (str==4 && str2==5)
		{
			co.addClient(cli);
		}
		else if (str==4 && str2==6)
		{
			co.changeClient(cli);
		}
		else if (str==4 && str2==7)
		{
			co.deleteClient(cli);
		}

	}

}