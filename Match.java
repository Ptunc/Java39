package Java39;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if(isCheck()){
            while(this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("--------- YENİ ROUND ----------");
                this.f2.health = this.f1.hit(f2);
                System.out.println("B Sağlık: " + this.f2.health);
                if (isWin()) break;

                this.f1.health = this.f2.hit(this.f1);
                System.out.println("A Sağlık: " + this.f1.health);
                if (isWin()) break;
            }
        }else{
            System.out.println("sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(f2.name + " kazandı.");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(f1.name + " kazandı.");
            return true;
        }
        return false;
    }
}
