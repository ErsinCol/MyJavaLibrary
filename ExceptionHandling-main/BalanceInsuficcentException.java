public class BalanceInsuficcentException extends Exception{ // KENDİ HATAMIZI OLUŞTURDUK VE MİRAS ALDIK ORDAKİ METHODLARI KULLANABİLMEL İÇİN
    private String message;
    public BalanceInsuficcentException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
