public class _3rd_Quiz11 {
    public static void main(String[] args) {

//        Quiz 11. for 사용해서
//        1~30까지 숫자중 짞수와 홀수를 각각 모두 판정하는 프로그램 만들기


        for(int i = 1; i <= 30; i++){
            if (i % 2 == 0) {
                System.out.println(i + "는 짝수");
            } else {
                System.out.println(i + "는 홀수");
            }
        }
    }
}
