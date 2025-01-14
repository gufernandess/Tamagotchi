package Pet;
// Classe que verifica o estado do Pet
// Princípio aplicado: Open/Closed (OCP)
// Justificativa: A lógica de verificação do estado é encapsulada, permitindo extensão
// (exemplo: adicionar novos critérios de "alive") sem modificar outras classes.

public class PetStatus {
    public boolean isAlive(PetAttributes pet) {
        return pet.getEnergy() > 0 && pet.getHungry() > 0 && pet.getClean() > 0;
    }
}
