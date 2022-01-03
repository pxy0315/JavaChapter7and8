//����
import java.util.Scanner;

public class Test8_35 {

	public static void main(String[] args) {
		//�����ʾ��䣬�ӿ���̨��ȡ�����С
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int length = input.nextInt();
        //����һ����ά���飬����Ϊ�ոջ�ȡ�Ĵ�С
        int[][] arr = new int[length][length];
        //ʹ��ѭ����ȡ�û���ֵ
        System.out.println("Enter the matrix row by row: ");
        for (int i = 0 ; i < length ; i++){
            for (int j = 0 ; j < length ; j++){
                arr[i][j] = input.nextInt();
            }
        }
        //ʹ�ö��ѭ���������飬�ҵ������ӷ���
        // �ӷ��󳤶ȴ�arr.length��ʼ��1������ȫΪ1����������
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

    /** �ж��±��[i][j]��ʼ��substring_lengthΧ�ɵľ������Ƿ�ȫ��Ϊ1 */
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
