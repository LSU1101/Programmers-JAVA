package javaStudy;

public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("Hello");

        if (sb2 == sb3) {
            System.out.println("sb2 == sb3");
        }

        String str2 = "Hello" + " " + "world";

        System.out.println(str2);

        System.out.println("배고파");
    }
}