package main.java.com.fly4our.class240516.nyoung;

import java.util.Scanner;

public class Application /*스캐너로 로그인, 회원가입, 프로그램 종료*/ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=====회원 정보 프로그램=====");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        // System.out.println("3. 회원 정보 보기(admin)");
        System.out.println("9. 프로그램 종료");
        int no = sc.nextInt()

        switch (sc.nextInt()) {
            case 1 : ; break;
            case 2 : ; break;
            case 9 :
                System.out.println("프로그램을 종료합니다."); return;
            default:
                System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해 주세요.");
        }

    }

}
