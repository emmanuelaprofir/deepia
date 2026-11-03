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

    public Conversation initierUneConversation(int id, Utilisateur auteur, String modele){
        Conversation c = new Conversation(id,auteur,modele);
        return c;
    }

    public Message envoyerUnMessage(Utilisateur auteur, String contenu, Conversation conversation){
        String[] mots = contenu.split("\\s+");
        int nbrMots = mots.length;
        Message m = new Message (auteur, contenu, nbrMots);
        int p =0;
        if (conversation.modele == "deepfast"){
            p = (int) ((nbrMots / 1000000) * 0.10);
        } else if (conversation.modele == "deepmedium"){
            p = (int) ((nbrMots / 1000000) * 0.50);
        } else if (conversation.modele == "deepthink"){
            p = (int) ((nbrMots / 1000000) * 1.0);
        }
        decrementerSolde(auteur, p);
        conversation.ajouterMessage(m);
        return m;
    }

    public void decrementerSolde(Utilisateur utilisateur,int valeur){
        utilisateur.soldeEuros = utilisateur.soldeEuros - valeur;
    }
    public int getSolde(){
        return this.solde;
    }
}
