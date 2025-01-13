// Classe principal que usa composição para gerenciar o Pet
// Princípios aplicados:
// - Dependency Inversion (DIP): Depende de abstrações (PetStats e PetStatus), e não de implementações concretas.
// - Single Responsibility (SRP): Apenas coordena as ações e exibe informações do Pet.

public class Pet {
    private final PetStats stats;  // Gerenciador de atributos.
    private final PetActions actions; // Gerenciador de ações.

    public Pet(int energy, int hungry, int clean) {
        this.stats = new PetStats(energy, hungry, clean);
        this.actions = new PetActions(stats, new PetStatus());
    }

    public void play() {
        actions.play();
    }

    public void eat() {
        actions.eat();
    }

    public void sleep() {
        actions.sleep();
    }

    public void shower() {
        actions.shower();
    }

    @Override
    public String toString() {
        return "E: " + stats.getEnergy() + "/" + stats.getEnergyMax() +
               ", S: " + stats.getHungry() + "/" + stats.getHungryMax() +
               ", L: " + stats.getClean() + "/" + stats.getCleanMax() +
               ", D: " + stats.getDiamonds() + ", I: " + stats.getAge();
    }
}