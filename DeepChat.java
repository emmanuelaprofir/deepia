package deepia;

public class DeepChat {
    int id;
    Utilisateur utilisateur;
    public DeepChat(int id, Utilisateur utilisateur){
        this.id = id;
        this.utilisateur = utilisateur;
    }


    public Conversation initierUneConversation(int id, Utilisateur auteur, String message, String modele){
        Conversation c = new Conversation(id, auteur, message, modele);
        return c;
    }
    
}

