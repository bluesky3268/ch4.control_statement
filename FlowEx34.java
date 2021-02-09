import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args) {
        int menu = 0, num = 0;
        Scanner sc = new Scanner(System.in);

        outer: while (true) {
            System.out.println("(1) Square");
            System.out.println("(2) Root Square");
            System.out.println("(3) Log");
            System.out.print("원하는 메뉴를 선택하세요.(4) 종료>>");

            String tmp = sc.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(menu >= 1 && menu <= 3)) {
                System.out.println("입력값이 올바르지 않습니다. 1~3사이의 정수를 다시 입력해 주세요. (종료는 4)");
                continue;
            }
            for (;;) {
                System.out.print("계산할 값을 입력하세요.(계산종료: 0, 프로그램 종료: 99)>>");
                tmp = sc.nextLine();
                num = Integer.valueOf(tmp);

                if (num == 0) {
                    break; // 계산종료 -> for문을 벗어남.
                } else if (num == 99) {
                    break outer; // 프로그램 종료 -> while문을 벗어남.
                }
                switch (menu) {
                    case 1:
                        System.out.println("result = " + num * num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                } // End switch

            } // End for
        } // End while

    } // End Main

}
