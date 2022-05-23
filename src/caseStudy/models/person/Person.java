package caseStudy.models.person;

public abstract class Person {
    private String firstNameLastName;
    private String gender;
    private String email;
    private String dayOfBirth;
    private int id;
    private int phoneNumber;

    public Person() {
    }

    public Person(String firstNameLastName, String gender, String email, String dayOfBirth, int id, int phoneNumber) {
        this.firstNameLastName = firstNameLastName;
        this.gender = gender;
        this.email = email;
        this.dayOfBirth = dayOfBirth;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstNameLastName() {
        return firstNameLastName;
    }

    public void setFirstNameLastName(String firstNameLastName) {
        this.firstNameLastName = firstNameLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person - " +
                "Name :" + firstNameLastName + '\'' +
                ", gender : " + gender + '\'' +
                ", email : " + email + '\'' +
                ", dayOfBirth : " + dayOfBirth + '\'' +
                ", id :" + id +
                ", phoneNumber : " + phoneNumber;
    }
}
