// Classe que gerencia as ações do Pet
// Princípios aplicados:
// - Single Responsibility (SRP): Gerencia exclusivamente as ações do Pet.
// - Open/Closed (OCP): Permite adicionar novas ações sem modificar o código existente.

public class PetActions {
    private final PetStats stats;  // Composição: usa PetStats para manipular atributos.
    private final PetStatus status; // Composição: usa PetStatus para verificar o estado do Pet.

    public PetActions(PetStats stats, PetStatus status) {
        this.stats = stats;
        this.status = status;
    }

    public void play() {
        if (!status.isAlive(stats)) {
            System.out.println("pet esta morto");
            return;
        }
        stats.updateEnergy(stats.getEnergy() - 2);
        stats.updateHungry(stats.getHungry() - 1);
        stats.updateClean(stats.getClean() - 3);
        stats.addDiamond();
        stats.incrementAge();
    }

    public void eat() {
        if (!status.isAlive(stats)) {
            System.out.println("pet esta morto");
            return;
        }
        stats.updateEnergy(stats.getEnergy() - 1);
        stats.updateHungry(stats.getHungry() + 2);
        stats.updateClean(stats.getClean() - 2);
        stats.incrementAge();
    }

    public void sleep() {
        if (!status.isAlive(stats)) {
            System.out.println("pet esta morto");
            return;
        }
        if (stats.getEnergy() <= (stats.getEnergyMax() - 5)) {
            stats.incrementAge(stats.getEnergyMax() - stats.getEnergy());
            stats.updateEnergy(stats.getEnergyMax());
            stats.updateHungry(stats.getHungry() - 1);
        } else {
            System.out.println("fail: nao esta com sono");
        }
    }

    public void shower() {
        if (!status.isAlive(stats)) {
            System.out.println("pet esta morto");
            return;
        }
        stats.updateEnergy(stats.getEnergy() - 3);
        stats.updateHungry(stats.getHungry() - 1);
        stats.updateClean(stats.getCleanMax());
        stats.incrementAge(2);
    }
}