/**
*Работа клиники
*/
public class ClinicRunner{
    public static void main(String[] arg){
        final Clinic clinic = new Clinic(10);
        clinic.addClient(0, new Client("Brown", new Cat("Diggy")));
        clinic.addClient(1, new Client("Brrr", new Dog(new Animal ("Doggy"))));
        clinic.addClient(2, new Client("AaaU", new CatDog(new Cat("Myaau"), new Dog(new Animal ("Gav Gav")))));
        Client[] FindingClients = clinic.findClientByPetName("Brrr");
        for (int i = 0; i < FindingClients.length; i++){
            System.out.println("Id = " + FindingClients[i].id);
        }

    }
}
