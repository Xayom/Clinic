/**
*Класс Собаки
*/
public class Dog implements Pet{
    public final Animal animal;

    public Dog(Animal animal){
        this.animal = animal;
    }
    public String getName(){
        return this.animal.name;
    }
}
