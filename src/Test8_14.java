//探讨矩阵
import java.util.Scanner;
public class Test8_14 {

	public static void main(String[] args) {
		//1. 从控制台获取matrix大小（输出提示语句）
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int length = input.nextInt();
        //2. 声明一个二维数组，长度为刚刚输入的大小
        int[][] arr = new int[length][length];
        //3. 遍历数组给数组赋值(int)(Math.random()*2)，同时输出元素，每行结尾换行
        for (int i = 0 ; i < length ; i++){
            for (int j = 0 ; j < length ; j++){
                arr[i][j] = (int)(Math.random()*2);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //4. 找整行为0、1的行下标，分情况输出
        int temp1 = 0;
        boolean bool1 = true, have_output = false;
        for (int i = 0 ; i < length ; i++){
            temp1 = arr[i][0];
            bool1 = true;
            for (int j = 0 ; j < length ; j++){
                if (arr[i][0] != arr[i][j]){
                    bool1 = false;
                }
            }
            if (bool1){
                System.out.println("All " + temp1 + "s on row " + i);
                have_output = true;
            }
        }
        if ( ! have_output ){
            System.out.println("No same numbers on a row");
        }
        //5. 找整列为0、1的列下标，分情况输出
        int temp2 = 0;
        boolean bool2 = true;
        have_output = false;
        for (int j = 0 ; j < length ; j++){
            temp2 = arr[j][0];
            bool2 = true;
            for (int i = 0 ; i < length ; i++){
                if (arr[j][0] != arr[i][j]){
                    bool2 = false;
                }
            }
            if (bool2){
                System.out.println("All " + temp2 + "s on col " + j);
                have_output = true;
            }
        }
        if ( ! have_output ){
            System.out.println("No same numbers on a column");
        }
        //6. 判断主对角线是否全部为0、1，分情况输出
        int temp3 = arr[0][0];
        boolean bool3 = true;
        for (int i = 0 ; i < length ; i++){
            if (temp3 != arr[i][i])
                bool3 = false;
        }
        if (bool3){
            System.out.println("All " + temp3 + "s on the major diagonal");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }
        //7. 判断副对角线是否全部为0、1，分情况输出
        int temp4 = arr[0][length-1];
        boolean bool4 = true;
        for (int i = 0 ; i < length ; i++){
            if (temp3 != arr[i][length - i - 1])
                bool4 = false;
        }
        if (bool4){
            System.out.println("All " + temp4 + "s on the sub-diagonal");
        } else {
            System.out.println("No same numbers on the sub-diagonal");
        }

	}

}
