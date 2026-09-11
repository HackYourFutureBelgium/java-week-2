package modernjava.examples;

public class DemoForStatic {

    public static void main(String[] args) {
        StudentStatic alizee = new StudentStatic("Alizee", "Java", "HYF");

        StudentStatic oleg = new StudentStatic("Oleg", "Java", "HYF");

        StudentStatic chitrakalpa = new StudentStatic("Chitra", "Java", "HYF");

        alizee.school="EPHEC";

        System.out.println(alizee.school);
        System.out.println(chitrakalpa.school);
        System.out.println(oleg.school);

//        MathUtil myMathUtil = new MathUtil();
//        int result = myMathUtil.subtract(5, 3);   //no need for statics


    }

}
