package 面向对象.继承;
//人类 (父类)
public class People {
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private String name;
    private int age;
    public  People(){
        System.out.println("父类构造器");
    }
    public  People(String name,int age){
        this.age=age;
        this.name=name;
    }
    public static void a(){
        System.out.println("父类静态方法");
    }
    public void  run(){
        System.out.println("奔跑");
    }
}
