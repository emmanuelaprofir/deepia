package deepia;

public class DeepFast extends DeepAi {
    double prixMTok;

    public DeepFast(double prixMTok, String promptSystem){
        super(promptSystem);
        this.prixMTok = prixMTok;
    }
}
