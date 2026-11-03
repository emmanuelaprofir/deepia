package deepia;

public class Message {

    Utilisateur auteur;
    String contenu;
    int nbrTokensConsommes;

    public Message (Utilisateur auteur, String contenu, int nbrTokensConsommes){
        this.auteur = auteur;
        this.contenu = contenu;
        this.nbrTokensConsommes = nbrTokensConsommes;
    }
    
}
