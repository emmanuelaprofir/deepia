package deepia;

import java.util.ArrayList;
import java.util.List;

public class Conversation {

    int id;
    Object auteur;
    List<Message> messages;
    String modele;

    public Conversation(int id, Utilisateur auteur, String modele) {
        this.id = id;
        this.auteur = auteur;
        this.messages = new ArrayList<>();
        this.modele = modele;
    }

    public Conversation(int id, DeepBot auteur, String modele) {
        this.id = id;
        this.auteur = auteur;
        this.messages = new ArrayList<>();
        this.modele = modele;
    }

    // Ajouter un message à la conversation
    public void ajouterMessage(Message message) {
        messages.add(message);
    }

    public int getId() {
        return id;
    }

    public Object getAuteur() {
        return auteur;
    }

    public List<Message> getMessages() {
        return messages;
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

    public void setModele(String modele) {
        this.modele = modele;
    }
}