package ru.lesson.lessons;

/**
*����� ��������� �������.
*/
public class Clinic{
    /**
    *������ ��������.
    */
    private final Client[] clients;

    public Clinic(final int size){
        this.clients = new Client[size];
    }

    /**
    *�������� �������.
    */
    public void addClient(final int position, final Client client){
        this.clients[position] = client;
    }

    /**
    *������ �������.
    *@param name ���.
    */
    public Client[] findClientByPetName(final String name){
        Client[] ans = new Client[this.clients.length];
        int count = 0;
        for (int pos = 0; pos < this.clients.length; pos++)
            if (this.clients[pos].equals(name)){
                ans[count] = this.clients[pos];
                count++;
            }
        if (ans.length == 0)
            return null;
        return ans;
    }
    public int AmountofPets(){
        return this.clients.length;
    }



    public Client[] ShowAllClientByPetName(){
        return this.clients;
    }
    public void DeleteByPetName(final String name){
        for (int pos = 0; pos < this.clients.length; pos++){
            if (this.clients[pos] != null && this.clients[pos].getNamePet().equals(name)){
                this.clients[pos] = null;
            }
        }
    }
}
