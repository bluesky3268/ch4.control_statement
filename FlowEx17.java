import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        int num = 0;
        System.out.print("출력할 별의 줄 수를 입력하세요.>>");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        num = Integer.valueOf(tmp);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
