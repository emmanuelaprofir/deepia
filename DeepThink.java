package deepia;

public class DeepThink extends DeepAi{
    double prixMTok;
    String promptSystem;

    public DeepThink(double prixMTok, String promptSystem){
        super(promptSystem);
        this.prixMTok = prixMTok;
    }
    
}
