//̽�־���
import java.util.Scanner;
public class Test8_14 {

	public static void main(String[] args) {
		//1. �ӿ���̨��ȡmatrix��С�������ʾ��䣩
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int length = input.nextInt();
        //2. ����һ����ά���飬����Ϊ�ո�����Ĵ�С
        int[][] arr = new int[length][length];
        //3. ������������鸳ֵ(int)(Math.random()*2)��ͬʱ���Ԫ�أ�ÿ�н�β����
        for (int i = 0 ; i < length ; i++){
            for (int j = 0 ; j < length ; j++){
                arr[i][j] = (int)(Math.random()*2);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //4. ������Ϊ0��1�����±꣬��������
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
        //5. ������Ϊ0��1�����±꣬��������
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
        //6. �ж����Խ����Ƿ�ȫ��Ϊ0��1����������
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
        //7. �жϸ��Խ����Ƿ�ȫ��Ϊ0��1����������
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
