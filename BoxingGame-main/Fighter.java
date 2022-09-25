public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    Fighter(String name,int damage,int health,int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }

    int hit(Fighter foe){
        System.out.println(this.name+" => "+foe.name+" "+this.damage+" hasar vurdu!");
        if(foe.isDodge()){
            System.out.println(foe.name+" hasarı savurdu.");
            return foe.health;
        }

        if(foe.health < this.damage){
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge(){
        int randomNumber= (int) (Math.random()*100);
        return randomNumber<=this.dodge;
    }
}
