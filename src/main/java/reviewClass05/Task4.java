package reviewClass05;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{12, -12, 67, 56}, {45, 2, 4}, {56, 2}, {67, 43, 11, 13}};
        int sumOdd=0;
        int sumEven=0;
        int number;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                number=array[i][j];
                if (array[i][j]%2==0){
                    sumEven+=number;
                }else {
                    sumOdd+=number;
                }
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
