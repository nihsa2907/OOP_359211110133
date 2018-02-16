package ooplab9;

public class Person {
    private String name;
    private String age;
    private Address address;
    private Job job;

    public Person(String name, String age, Address address, Job job) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + name + '\'' +
                ", name='" + age + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getage() {
        return age;
    }

    public void setage(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}