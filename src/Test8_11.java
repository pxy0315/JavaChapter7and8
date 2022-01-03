//九个硬币的正反面 
import java.util.Scanner;
public class Test8_11 {

	public static void main(String[] args) {
		//初始化一个int对象，从控制台获取用户输入的数字并赋值
        int user_input = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        user_input = input.nextInt();
        //声明一个int型数组、一个String型数组，长度为3 * 3
        int[][] bin = new int[3][3];
        String[][] str = new String[3][3];
        
        bin = dec_to_bin(user_input);
        str = bin_to_state(bin);
        //将这个String型数组输出
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3; j++){
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] dec_to_bin(int num){
        //将传入的十进制数转为二进制数后返回
        int[][] arr = new int[3][3];
        for (int i = 2 ; i >= 0 ; i--){
            for (int j = 2 ; j >= 0 ; j--){
                arr[i][j] = (num % 2);
                num /= 2;
            }
        }
        return arr;
    }
    public static String[][] bin_to_state(int[][] arr){
        //将传入的二进制数组转为对应的String数组（0代表H 1代表T）
        String[][] str = new String[3][3];
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                if (arr[i][j] == 0){
                    str[i][j] = "H";
                }else
                    str[i][j] = "T";
            }
        }
        return str;

	}

}
