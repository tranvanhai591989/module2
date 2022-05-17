package ss10_DSA_Danh_sach.Exercise.arrayList1;

public class TestMyList {
    static class Person{
        String name;
        int Age;

        Person(String name, int age) {
            this.name = name;
            Age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", Age=" + Age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
//            Person person = (Person) obj;
            return this.name.equals(((Person) obj).name)
                    && this.Age == ((Person) obj).Age;
        }
    }
    public static void main(String[] args) {
        MyList<Person> myList = new MyList<>(3);
        myList.ensureCapacity(4);
        myList.add(new Person("Nguyễn Văn A ", 30));
        myList.add(new Person("Nguyễn Văn B ", 30));
        myList.add(new Person("Nguyễn Văn C ", 30));
        myList.add(new Person("Nguyễn Văn D ", 30),1);
        myList.remove(3);
        MyList<Person> list2 = myList.clone();
        int index = list2.indexOf(new Person("Nguyễn Văn C ", 30));
        System.out.println("index = " + index);
        for (int i = 0; i < list2.size(); i++ ){
            System.out.println(myList.get(i).toString());
        }
    }
}