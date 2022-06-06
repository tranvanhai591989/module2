package abc_Company.employee;

public class Manager extends Employee {
    private int salary;

    public Manager() {
    }

    public Manager(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Manager Name : "+ getName()+
         " Id :  "+ getId()+
         " Code : "+ getCode()+
         " Birthday  "+ getBirthday()+
         " Address  "+ getAddress()+
         " Salary  "+ getSalary();

    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s",
                super.getId() ,
                        super.getCode() ,
                        super.getName() ,
                        super.getBirthday() ,
                        super.getAddress() ,
                        getSalary());

    }


    public Manager(int id, String code, String name, String birthday, String address, int salary) {
        super(id, code, name, birthday, address);
        this.salary = salary;
    }

}
