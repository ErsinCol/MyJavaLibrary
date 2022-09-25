public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void run(){
        if(checkWeight()){
            while(this.f1.health>0 && this.f2.health>0){
                int randomFirstHit=(int)(Math.random()*2);
                if(randomFirstHit<1){
                    System.out.println("Yeni Round");
                    System.out.println("--------------");

                    this.f2.health =this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    this.f1.health=this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    printScore();
                }else{
                    System.out.println("Yeni Round");
                    System.out.println("--------------");

                    this.f1.health=this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }

                    this.f2.health =this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }

                    printScore();
                }

            }
        }else{
            System.out.println("Dövüşçülerin sikletleri uyuşmuyor.");
        }
    }

    boolean checkWeight(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    void printScore(){
        System.out.println(this.f1.name+" kalan can:\t"+this.f1.health);
        System.out.println(this.f2.name+" kalan can:\t"+this.f2.health);
        System.out.println("---------------");
    }

    boolean isWin(){
        if(this.f1.health==0){
            System.out.println("Maçı kazanan: "+this.f2.name);
            return true;
        }
        else if(this.f2.health==0){
            System.out.println("Maçı kazanan: "+this.f1.name);
            return true;
        }

        return false;
    }


}
