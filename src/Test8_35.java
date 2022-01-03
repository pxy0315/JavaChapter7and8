//最大块
import java.util.Scanner;

public class Test8_35 {

	public static void main(String[] args) {
		//输出提示语句，从控制台获取方阵大小
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int length = input.nextInt();
        //声明一个二维数组，长度为刚刚获取的大小
        int[][] arr = new int[length][length];
        //使用循环获取用户赋值
        System.out.println("Enter the matrix row by row: ");
        for (int i = 0 ; i < length ; i++){
            for (int j = 0 ; j < length ; j++){
                arr[i][j] = input.nextInt();
            }
        }
        //使用多层循环遍历数组，找到最大的子方阵
        // 子方阵长度从arr.length开始到1结束，全为1的则输出结果
        for (int substring_length = length ; substring_length > 0 ; substring_length--){
            for (int i = 0 ; i <= length - substring_length ; i++){
                for (int j = 0 ; j <= length - substring_length ; j++){
                    if (is_substring(arr, i, j, substring_length)){
                        System.out.println("The maximum square submatrix is at (" + i +
                                ", " + j + ") with size " + substring_length);
                        return;
                    }
                }
            }
        }
    }

    /** 判断下标从[i][j]开始的substring_length围成的矩阵中是否全部为1 */
    public static boolean is_substring(int[][] arr, int i, int j, int length){
        for (int x = i ; x < i + length ; x++){
            for (int y = j ; y < j + length ; y++){
                if (arr[x][y] != 1){
                    return false;
                }
            }
        }
        return true;
	}

}
