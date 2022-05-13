package ss7_AbstractClass_Interface.Practice.AnimalEdible;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "ho thi keu meo meo";
    }

    @Override
    public String howToEat() {
        return "HO THI NAU CAO";
    }
}
