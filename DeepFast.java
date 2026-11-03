package deepia;

public class DeepFast extends DeepAi {
    double prixMTok;

    public DeepFast(double prixMTok, PromptSystem promptSystem){
        super(promptSystem);
        this.prixMTok = prixMTok;
    }
}
