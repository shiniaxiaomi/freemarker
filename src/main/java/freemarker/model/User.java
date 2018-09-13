package freemarker.model;

/**
 * Created by 陆英杰
 * 2018/9/13 22:24
 */
public class User {

    private String name;
    private int age;
    private String desc;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
