import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("(1) Square");
            System.out.println("(2) Root Square");
            System.out.println("(3) Log");
            System.out.print("원하는 메뉴를 선택하세요.(4) Quit>>");

            String tmp = sc.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("잘못된 입력입니다. (1~3사이의 숫자를 누르세요. 종료는 4)");
                continue;
            }
            System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
            System.out.println();
        }
        System.out.println("종료되었습니다.");
    }

}
