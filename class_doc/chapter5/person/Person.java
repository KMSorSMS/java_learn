package chapter5.person;

public class Person {
    private int age;
    private String name;
    private int IQ;
    private String identity;
    //人的受欢迎程度
    private int likes;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setIQ(int iQ) {
        IQ = iQ;
    }
    public int getIQ() {
        return IQ;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    public String getIdentity() {
        return identity;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getLikes() {
        System.out.println("他的likes："+this.likes);
        return likes;
    }
    public void addLikes(){
        this.likes++;
    }
    public void addLikes(int num){
        this.likes += num;
    }
}
