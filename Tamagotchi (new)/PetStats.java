// Classe para gerenciar os atributos do Pet
// Princípio aplicado: Single Responsibility (SRP)
// Justificativa: A responsabilidade única desta classe é gerenciar os atributos do Pet.

public class PetStats implements PetAttributes {
    private final int energyMax, hungryMax, cleanMax;
    private int energy, hungry, clean;
    private int diamonds;
    private int age;

    public PetStats(int energy, int hungry, int clean) {
        this.energyMax = energy;
        this.hungryMax = hungry;
        this.cleanMax = clean;
        this.energy = energy;
        this.hungry = hungry;
        this.clean = clean;
        this.diamonds = 0;
        this.age = 0;
    }

    // Princípio aplicado: Encapsulamento
    // Justificativa: Os métodos de atualização garantem que os valores dos atributos
    // permaneçam dentro de limites válidos.

    public void updateEnergy(int value) {
        this.energy = Math.max(0, Math.min(this.energyMax, value));
    }

    public void updateHungry(int value) {
        this.hungry = Math.max(0, Math.min(this.hungryMax, value));
    }

    public void updateClean(int value) {
        this.clean = Math.max(0, Math.min(this.cleanMax, value));
    }

    public void addDiamond() {
        this.diamonds++;
    }

    public void incrementAge() {
        this.age++;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public int getHungry() {
        return hungry;
    }

    @Override
    public int getClean() {
        return clean;
    }

    @Override
    public int getDiamonds() {
        return diamonds;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getEnergyMax() {
        return energyMax;
    }

    @Override
    public int getHungryMax() {
        return hungryMax;
    }

    @Override
    public int getCleanMax() {
        return cleanMax;
    }
}