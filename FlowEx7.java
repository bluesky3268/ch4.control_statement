import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요.>>");
        int user = sc.nextInt();
        int com = (int) (Math.random() * 3) + 1;

        System.out.println("당신은" + user + "입니다.");
        System.out.println("컴퓨터는" + com + "입니다.");

        /*
         * 내가 지는 경우 : 2 - 1 / 3 - 1 / 2 - 3 -> 1 or -1
         * 
         * 내가 이기는 경우 : 1 - 3 / 2 - 1 / 3 - 2 -> 1 or -2
         * 
         * 비기는 경우 : 0
         */

        switch (user - com) {
            case 2:
            case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1:
            case -2:
                System.out.println("당신이 이겼습니다. ");
                break;
            case 0:
                System.out.println("비겼습니다.");
        }

    } // End Main

}
