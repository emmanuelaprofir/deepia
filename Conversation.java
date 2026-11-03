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
    // Renvoie l'id de la conversation
    public int getId() {
        return id;
    }
    // Renvoie les informations de l'auteur (le type)
    public Object getAuteur() {
        return auteur;
    }
    // Renvoie les messages de la conversation
    public List<Message> getMessages() {
        return messages;
    }
   // Renvoie le modèle de la conversation (qui ne peut pas être modifié une fois la conversation démarrée)
    public String getModele() {
        return modele;
    }
    // Modifie l'identifiant de la conversation
    public void setId(int id) {
        this.id = id;
    }
    // Modifie l'auteur de la conversation
    public void setAuteur(Object auteur) {
        this.auteur = auteur;
    }
    // Modifie le modele de la conversation
    public void setModele(String modele) {
        this.modele = modele;
    }
}