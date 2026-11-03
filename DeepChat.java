package deepia;

public class DeepChat {
    int id;
    Utilisateur utilisateur;
    public DeepChat(int id, Utilisateur utilisateur){
        this.id = id;
        this.utilisateur = utilisateur;
    }

    public Conversation initierUneConversation(id,auteur,message,modele){
        Conversation c = new Conversation(id, auteur, message, modele);
        return c;
    }
}
