package deepia;

public class Utilisateur {
    String nom;
    String prenom;
    String email;
    String mdp;
    int soldeEuros;
    String donnesPerso;

    public Utilisateur (String nom, String prenom, String email, String mdp, int soldeEuros, String donnesPerso){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.soldeEuros =soldeEuros;
        this.donnesPerso = donnesPerso;
    }
}
