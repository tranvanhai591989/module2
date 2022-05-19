package ss11_dsa_stack_queue.exercise.gender_structuer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenderStructure extends People {
    public static void main(String[] args) {
        Queue<People> queueNu = new LinkedList<>();
        Queue<People> queueNam = new LinkedList<>();
        List<People> myPeople = new LinkedList<>();
        People people1 = new People("Tran van hai", true, "05/09/1989");
        People people2 = new People("Tran van ba", false, "05/09/1989");
        People people3 = new People("Tran van bon", false, "08/09/1989");
        People people4 = new People("Tran van nam", true, "09/2/1989");
        People people5 = new People("Tran van sau", false, "03/09/1989");
        People people6 = new People("Tran van bay", true, "06/1/1989");
        myPeople.add(people1);
        myPeople.add(people2);
        myPeople.add(people3);
        myPeople.add(people4);
        myPeople.add(people5);
        myPeople.add(people6);
        System.out.println(myPeople.toString());
        for (People item : myPeople) {
            if (item.getGender()) {
                queueNam.add(item);
            } else {
                queueNu.add(item);
            }
        }
        System.out.println("Danh sach nam : " + queueNam);
        System.out.println("Danh sach nu : " + queueNu);
    }
}
