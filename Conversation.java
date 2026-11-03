package deepia;

public class Conversation {
    int id;
    <T>auteur;
    String message;
    String modele;

    public Conversation (int id, <T>auteur, String message, String modele){
        this.id = id;
        this.auteur =auteur;
        this.message = message;
        this.modele = modele;
    }

}
