/**
*Работа клиники
*/
public class ClinicRunner{
    public static void main(String[] arg){
        final Clinic clinic = new Clinic(10);
        clinic.addClient(0, new Client("Brown", new Cat("Diggy")));
        clinic.addClient(1, new Client("Brrr", new Dog(new Animal ("Doggy"))));
        clinic.addClient(2, new Client("AaaU", new CatDog(new Cat("Myaau"), new Dog(new Animal ("Gav Gav")))));
        clinic.DeleteByPetName("Doggy");
        Client[] AllClients = clinic.ShowAllClientByPetName();
        for (int i = 0; i < 10; i++){
            if (AllClients[i] != null)
                System.out.println("NamePet = " + AllClients[i].getNamePet() + " " +  AllClients[i].getTypeofPet());
        }
    }
}
