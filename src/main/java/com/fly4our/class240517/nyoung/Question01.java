package main.java.com.fly4our.class240517.nyoung;

public class Question01 {

//    1. String[] names = new String[10] <br/>
//            배열의 마지막 셀에 "Hello"가 반환되는 방법은?
//
//            -[ ] A. names[0] = "Hello";
//-[ ] B. names[10] = "Hello";
//-[ ] C. names[9] = "Hello";
//-[ ] D. String[ names.length-1 ] = "Hello";

    public static void main(String[] args) {

        String[] names = new String[10];
        names[0] = "Hello";
        names[1] = "World";
        names[2] = "2";
        names[3] = "3";
        names[4] = "4";
        names[5] = "5";
        names[6] = "6";
        names[7] = "7";
        names[8] = "8";
        names[9] = "9";

        String temp;
        temp = names[0];
        names[0] = names[9];
        names[9] = temp;

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


    }

}
