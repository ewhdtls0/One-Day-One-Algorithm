public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int) (Math.pow(c, 2) - Math.pow(a, 2)); // 빗변^2 - 가로^2 = b_square가 되도록 변경

        System.out.println(b_square);
    }
}

/*
디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
1줄만 수정하여 버그를 고치세요.
2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.

https://school.programmers.co.kr/learn/courses/30/lessons/250132
*/
