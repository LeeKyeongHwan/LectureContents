public class ArrayTest {
    public static void main(String[] args) {

        int arr[] = { 6, 7, 8, 9, 10};
        //int num1 =1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;

        // 배열을 만드는 방법
        // 1. stack에 할당하는 방법(지역변수)
        //  1-1. 일단은 배열의 데이터 타입(int 같은)을 적는다.
        //  1-2. 배열의 이름이 될 변수명을 적는다.
        //  1-3. 배열임을 알리기 위해 []을 변수 옆에 적어준다.
        //  1-4. 필요하다면 배열의 값들을 초기화한다.
        //       (이때 원소로 지정한 숫자에 따라 배열의 길이가 지정된다)
        //    *가변으로 구성하고 싶다면 new를 사용해야 하는데 이것은 다음주에 학습하도록 한다.

        // 아래와 같은 데이터를 살펴보자
        // int arr[] = {1,2,3,4,5};
        // 위 데이터는 아래와 같은 형식으로 저장된다.
        //     --------------------
        // arr | 1 | 2 | 3 | 4 | 5 |
        //      [0] [1] [2] [3] [4]
        // 배열의 인덱스(방) 번호는 0번부터 시작함에 주의하도록 한다.
        // 그러나 방 번호가 순차적으로 증가하기 때문에
        // for 문이나 while 문과의 혼합구성에 있어 매우 탁월하다.
        for (int i = 0; i < 5; i++) {
            System.out.printf("arr[%d] = %d\n",i, arr[i]);
            //arr[i]를 하게되면 i에 들어가는 순번의 배열이 출력되는것같다.
            //arr[]에 5,6,7,8을 입력했다면 첫번째가 5가됨
        }
    }
}
