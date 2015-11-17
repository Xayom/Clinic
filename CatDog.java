/**
*����� �������
*/
public class CatDog implements Pet{
    private final Cat cat;
    private final Dog dog;

    public CatDog(Cat cat, Dog dog){
        this.cat = cat;
        this.dog = dog;
    }
    public String getName(){
        return this.cat.name;
    }

}