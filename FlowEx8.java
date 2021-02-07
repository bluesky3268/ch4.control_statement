import java.util.Scanner;

/**
 * FlowEx8
 */
public class FlowEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 주민등록번호를 입력하세요.(ex_111111-1111111)>>");
        String regNo = sc.nextLine();
        char gender = regNo.charAt(7);

        switch (gender) {
            case '1':
            case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("당신은 여성입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }

    } // End main

}