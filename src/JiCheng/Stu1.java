package JiCheng;

import java.util.Scanner;

/**
 * 继承的初步学习
 */
class Person{
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }

    public void setName(String name1){
        this.name = name1;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age1){
        this.age = age1;
    }
}

class Student extends Person{
    private String school;

    public String getSchool(){
        return this.school;
    }

    public void setSchool(String school1){
        this.school = school1;
    }
}

public class Stu1 {
    public static void main(String[] args){
        Student stu1 = new Student();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入姓名：");
        stu1.setName(in.nextLine());
        System.out.println("请输入年龄：");
        stu1.setAge(in.nextInt());
        System.out.println("请输入学校：");
        stu1.setSchool(in.next());

        System.out.println("你输入的信息是：");
        System.out.println("姓名：" + stu1.getName() + "\t年龄：" + stu1.getAge() + "\t学校：" + stu1.getSchool());
    }
}
