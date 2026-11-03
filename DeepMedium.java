package deepia;

public class DeepMedium extends DeepAi{

    double prixMTok;

    public DeepMedium(double prixMTok, PromptSystem promptSystem){
        super(promptSystem);
        this.prixMTok = prixMTok;
    }
    
}
