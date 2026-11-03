
import deepia.Conversation;
import deepia.DeepFast;
import deepia.DeepMedium;
import deepia.Utilisateur;

public void main (){
    DeepFast Fast = new DeepFast(0.1,"Sois poli");
    DeepMedium Medium = new DeepMedium(0.5,"Sois poli");
    
    Utilisateur u = new Utilisateur("Dupond","Jean","email@jean.com","mdp",1000,"");
    Conversation c = u.initierUneConversation(1,u,"deepfast");
    u.envoyerUnMessage(u, "Bonjour", c);
    System.out.println(u.getSolde());
}