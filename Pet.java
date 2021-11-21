public class Pet {

    private final int energyMax, hungryMax, cleanMax;
    private int energy, hungry, shower;
    private int diamonds;
    private int age;
    private boolean isAlive;

    public Pet(int energy, int hungry, int shower) {
        this.energyMax = energy;
        this.hungryMax = hungry;
        this.cleanMax = shower;

        this.age = 0;
        this.diamonds = 0;
        this.isAlive = true;

        setEnergy(energy);
        setHungry(hungry);
        setClean(shower);
    }

    private int getEnergy() {
        return energy;
    }

    private int getHungry() {
        return hungry;
    }

    private int getClean() {
        return shower;
    }

    private int getDiamonds() {
        return diamonds;
    }

    private int getAge() {
        return age;
    }

    private int getEnergyMax() {
        return energyMax;
    }

    private int getHungryMax() {
        return hungryMax;
    }

    private int getCleanMax() {
        return cleanMax;
    }

    public void setEnergy(int energyValue) {
        if(energyValue <= 0){
            this.energy = 0;
            System.out.println("fail: pet morreu de fraqueza");
            this.isAlive = false;
        }
        else if(energyValue > this.energyMax)
            this.energy = this.energyMax;
        else
            this.energy = energyValue;
    }

    public void setHungry(int hungryValue) {
        if(hungryValue <= 0){
            this.hungry = 0;
            System.out.println("fail: pet morreu de fome");
            this.isAlive = false;
        }
        else if(hungryValue > this.hungryMax)
            this.hungry = this.hungryMax;
        else
            this.hungry = hungryValue;
    }

    public void setClean(int cleanValue) {
        if(cleanValue <= 0){
            this.shower = 0;
            System.out.println("fail: pet morreu de sujeira");
            this.isAlive = false;
        }
        else if(cleanValue > this.cleanMax)
            this.shower = this.cleanMax;
        else
            this.shower = cleanValue;
    }

    public boolean testAlive() {
        return this.energy == 0 || this.hungry == 0 || this.shower == 0 ? true : false;
    }

    public void play() {
        setEnergy(this.energy);
        setHungry(this.hungry);
        setClean(this.shower);
        
        if(testAlive()) {
            System.out.println("pet esta morto");
        } else {
            this.energy -= 2;
            this.hungry--;
            this.shower -= 3;
            this.diamonds++;
            this.age++;
        }
    }

    public void eat() {
        if(testAlive()) {
            System.out.println("pet esta morto");
        } else {
            this.energy--;
            this.hungry += 2;
            this.shower -= 2;
            this.age++;
        }
    }

    public void sleep() {
        if(testAlive()) {
            System.out.println("pet esta morto");
        } if(this.energy <= (this.energyMax - 5)) {
            this.age += (this.energyMax - this.energy);
            this.energy = this.energyMax;
            this.hungry--;
        } else {
            System.out.println("fail: nao esta com sono");
        }
    }

    public void shower() {
        if(testAlive()) {
            System.out.println("pet esta morto");
        } else {
            this.energy -= 3;
            this.hungry--;
            this.shower = this.cleanMax;
            this.age += 2;
        }
    }

    public String toString() {
        return "E: " + this.getEnergy() + "/" + this.getEnergyMax() + ", S: " + this.getHungry() + "/" + this.getHungryMax()
               + ", L: " + this.getClean() + "/" + this.getCleanMax() + ", D: " + this.getDiamonds() + ", I: " + this.getAge() + "\n";
    }
}