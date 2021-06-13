package person;
import static java.lang.System.*;
/**
 * copyright (c) yzw <br>
 * relax after work<br>
 * crazy things<br>
 * <a href="https://github.com/KMSorSMS/java_learn/tree/test_with_family>click me baby</a><br>" 
 */
public class Person_normal {
    /**
     * The fields variables all
     * namely name...
     */
    public int field_test = 1;
    private String name;
    private String age;
    private String gender;
    private String phone;
    private String address;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * normal person's method of eating
     */
    public void eat(){
        out.println("There is a normal person eating apple");
    }
    /**
     * normal person's method of drinking
     */
    public void drink(){
        out.println("There is a normal person drinking outside");
    }
}
