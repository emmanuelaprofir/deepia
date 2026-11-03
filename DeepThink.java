package deepia;

public class DeepThink extends DeepAi{
    double prixMTok;

    public DeepThink(double prixMTok, PromptSystem promptSystem){
        super(promptSystem);
        this.prixMTok = prixMTok;
    }
    
}
