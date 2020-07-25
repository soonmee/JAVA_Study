package JieKou;

/**
 * 抽象类的初步学习
 * 抽象类必须包含至少一个抽象方法
 * 抽象类和抽象方法用 abstract 定义
 * 抽象类必须被继承，继承的子类（如果不是抽象类）必须覆写所有的抽象方法
 * 抽象方法不要用 private 声明
 */
abstract class Person2{
    private String name;
    private int age;
    public Person2(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public abstract String getInfo();
}

class Student2 extends Person2{
    private String school;
    public Student2(String name, int age, String school){
        super(name, age);
        this.setSchool(school);
    }

    public String getSchool(){
        return school;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public String getInfo(){
        return "姓名：" + super.getName() +
                "\t年龄：" + super.getAge() +
                "\t学校：" + this.getSchool();
    }
}

public class Stu2 {
    public static void main(String[] args) {
        Student2 stu = new Student2("小猪佩奇",22,"南开大学");
        System.out.println(stu.getInfo());
    }
}
