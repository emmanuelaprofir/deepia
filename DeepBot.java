package deepia;

public class DeepBot {
    int id;
    Utilisateur utilisateur;

    public DeepBot (int id, Utilisateur utilisateur){
        this.id = id;
        this.utilisateur = utilisateur;
    }

    public Conversation initierUneConversation(int id, DeepBot auteur, String message, String modele){
        Conversation c = new Conversation(id,auteur,message,modele);
        return c;
    }
}
