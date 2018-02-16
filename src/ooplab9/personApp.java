package ooplab9;

public class personApp {
    public static void main(String[] args) {
        Person person = new Person("10133", "Nihsa",
                new Address("78 m7", "Pattani", "98410"),
                new Job("Programer", 45000));

        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(50000);
        System.out.println("Name: " + person.getname() +
                "Salary: " + person.getJob().getSalary());
    }
}//class