//拉丁方阵
import java.util.Scanner;
import java.util.Arrays;

public class Test8_36 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = input.nextInt();
        
        int[][] arr = new int[n][n];
        
        //新建一个int型对象，赋值为65+n（规定输入范围）
        int limit_max = 65 + n;
        //输出提示语句，新建一个String型对象用于临时保存
        System.out.println("Enter "+ n + " rows of letters separated by spaces: ");
        char temp_str;
        int temp_int = 0;
        //遍历空二维数组，将输入数据转为int型判断是否合法再赋值
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                temp_str = input.next().charAt(0);
                temp_int = (int) temp_str;
                if (temp_int >= 65 && temp_int < limit_max){
                    arr[i][j] = temp_int;
                } else {
                    System.out.println("Wrong input: the letters must be from A to " + (char)(limit_max - 1));
                    return;
                }
            }
        }
        //两次遍历二维数组，元素作为一维数组下标，判断是否重复+7. 根据结果输出
        int[] count = new int[65 + n];
        for (int i = 0 ; i < n ; i++){
            Arrays.fill(count, 0);
            for (int j = 0 ; j < n ; j++){
                if (count[arr[i][j]] == 0){
                    ++count[arr[i][j]];
                } else {
                    System.out.println("The input array is not Latin square");
                    return;
                }
            }
        }
        for (int j = 0 ; j < n ; j++){
            Arrays.fill(count, 0);
            for (int i = 0 ; i < n ; i++){
                if (count[arr[i][j]] == 0){
                    ++count[arr[i][j]];
                } else {
                    System.out.println("The input array is not Latin square");
                    return;
                }
            }
        }
        System.out.println("The input array is Latin square");

	}

}
