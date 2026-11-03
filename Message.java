package deepia;

public class Message {

    <T>auteur;
    String contenu;
    int nbrTokensConsommes;

    public Message (<T>auteur, String contenu, int nbrTookensConsommes){
        this.auteur =auteur;
        this.contenu = contenu;
        this.nbrTokensConsommes = nbrTokensConsommes;
    }
    
}
