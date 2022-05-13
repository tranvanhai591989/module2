package ss7_AbstractClass_Interface.Practice.AnimalEdible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Ga keu go go";
    }
    @Override
    public String howToEat(){
        return "ga thi chien mam hay luoc cung duoc";
    }
}
