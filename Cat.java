/**
*Класс Кота
*/
public class Cat implements Pet{

    public final String name;
    public Cat (final String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
