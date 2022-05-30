package a_luyenQuiz;

public class ThrowExample {

    static void validate(int age) {
        if (age < 18)
//            throw new ArithmeticException("not valid");
            System.out.println("cc");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }

}