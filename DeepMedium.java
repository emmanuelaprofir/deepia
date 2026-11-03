package deepia;

public class DeepMedium extends DeepAi{

    double prixMTok;

    public DeepMedium(double prixMTok, String promptSystem){
        super(promptSystem);
        this.prixMTok = prixMTok;
    }
    
}
