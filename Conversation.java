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
    public int getId() {
    return id;
    }

    public Object getAuteur() {
        return auteur;
    }

    public String getMessage() {
        return message;
    }

    public String getModele() {
        return modele;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuteur(Object auteur) {
        this.auteur = auteur;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}
