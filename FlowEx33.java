public class FlowEx33 {
    public static void main(String[] args) {
        Loop1: for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop1; // C밖으로 완전 탈출.
                    // break; ->> B까지. for j문 탈출, println()문 실행.
                    // continue Loop1; ->> B를 벗어나서 for i문 다시 실행.
                    // continue; ->> for j문 실행.
                } // 'A'
                System.out.println(i + "*" + j + "=" + i * j);

            } // 'B'
            System.out.println();
        } // 'C'

    } // End Main

}
