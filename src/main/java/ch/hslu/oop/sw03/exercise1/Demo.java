package ch.hslu.oop.sw03.exercise1;

public class Demo {
    public static void main(String[] arg) {
        System.out.println("########## DEMO Math Max a b ##########");
        System.out.println(MathHelper.max(1, 3));
        System.out.println(MathHelper.max(4, 2));
        System.out.println(MathHelper.max2(1, 3));
        System.out.println(MathHelper.max2(4, 2));
        System.out.println(MathHelper.max3(1, 3));
        System.out.println(MathHelper.max3(4, 2));
        System.out.println("########## DEMO Math Max a b c ##########");
        System.out.println(MathHelper.max(1, 3, 2));
        System.out.println(MathHelper.max(4, 2, 3));
        System.out.println(MathHelper.max2(1, 3, 2));
        System.out.println(MathHelper.max2(4, 2, 3));
        System.out.println(MathHelper.max3(1, 3, 2));
        System.out.println(MathHelper.max3(4, 2, 3));

    }
}
