package chapter6;

public enum Gender {
    MALE, FEMALE;

    // //定义一个public修饰的实例变量
    // public String name;
    private String name;

    public void setName(String name) {
        switch (this) {
            case MALE:
                if (name.equals("男")) {
                    this.name = name;
                } else {
                    System.out.println("参数错误");
                    return;
                }
                break;
            case FEMALE:
                if (name.equals("女")) {
                    this.name = name;
                } else {
                    System.out.println("参数错误");
                    return;
                }
                break;
        }

    }

    public String getName() {
        return this.name;
    }
}
