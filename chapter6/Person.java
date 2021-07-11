package chapter6;

class Name{
    private String firstName;
    private String lastName;
    public Name(){}
    public Name(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}

public class Person {
    private final Name name;
    public Person (Name name){
        this.name = new Name(name.getFirstName(),name.getLastName());
    }
    public Name getname()
    {
        return new Name(name.getFirstName(),name.getLastName());
    }
}
