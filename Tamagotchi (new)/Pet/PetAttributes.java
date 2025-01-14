package Pet;
// Interface para atributos básicos do Pet
// Princípio aplicado: Interface Segregation (ISP)
// Justificativa: A interface fornece apenas métodos relacionados a atributos básicos do Pet,
// evitando que outras classes sejam forçadas a implementar métodos desnecessários.

public interface PetAttributes {
    int getEnergy();
    int getHungry();
    int getClean();
    int getDiamonds();
    int getAge();
    int getEnergyMax();
    int getHungryMax();
    int getCleanMax();
}
