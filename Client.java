/**
*Клиент
*/
public class Client{
    private final String id;
    private final Pet pet;

    public Client(final String id, final Pet pet){
        this.id = id;
        this.pet = pet;
    }

    public String getId(){
        return this.id;
    }

    public String getNamePet(){
        return this.pet.getName();
    }
    public String getTypeofPet(){
        return this.pet.getTypeOfPet();
    }

}
