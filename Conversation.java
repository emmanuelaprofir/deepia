package deepia;

public class Conversation {
    int id;
    Object auteur;
    String message;
    String modele;

    public Conversation (int id, Utilisateur auteur, String message, String modele){
        this.id = id;
        this.auteur =auteur;
        this.message = message;
        this.modele = modele;
    }
    public Conversation (int id, DeepFast auteur, String message, String modele){
        this.id = id;
        this.auteur =auteur;
        this.message = message;
        this.modele = modele;
    }

    public Conversation (int id, DeepMedium auteur, String message, String modele){
        this.id = id;
        this.auteur =auteur;
        this.message = message;
        this.modele = modele;
    }

    public Conversation (int id, DeepThink auteur, String message, String modele){
        this.id = id;
        this.auteur =auteur;
        this.message = message;
        this.modele = modele;
    }
}
