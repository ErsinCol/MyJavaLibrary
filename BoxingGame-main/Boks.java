public class Boks {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Ersin",20,100,70,50);
        Fighter f2=new Fighter("Muhammet",15,90,100,30);
        Match match=new Match(f1,f2,70,100);
        match.run();
    }
}
