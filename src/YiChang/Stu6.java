package YiChang;

/**
 * 声明、抛出、捕获异常
 */
public class Stu6 {
    private double R;
    private static int number = 0;

    public Stu6(){
        this(1.0);
    }

    public Stu6(double newR){
        setR(newR);
        number++;
    }

    public double getR() {
         return R;
    }

    public void setR(double newR) throws IllegalAccessError{
        if (newR >= 0){
            R = newR;
        }else
            throw new IllegalAccessError("R不能小于0");
    }
    public static int getNumber(){
        return number;
    }

    public double Area(){
        return R*R*3.14;
    }

    public static void main(String[] args) {
        try {
            Stu6 c1 = new Stu6(5);
            System.out.println(c1.Area());
            Stu6 c2 = new Stu6(-5);
            Stu6 c3 = new Stu6(0);
        }catch (IllegalAccessError ex){
            System.out.println(ex);
        }
        System.out.println(Stu6.getNumber() + "个创建成功！");
    }
}
