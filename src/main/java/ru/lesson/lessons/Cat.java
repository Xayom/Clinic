package ru.lesson.lessons;
/**
*����� ����
*/
public class Cat implements Pet{

    private final String name;
    public Cat (final String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getTypeOfPet(){
        return "Cat";
    }
}
