//��������
import java.util.Scanner;
import java.util.Arrays;

public class Test8_36 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = input.nextInt();
        
        int[][] arr = new int[n][n];
        
        //�½�һ��int�Ͷ��󣬸�ֵΪ65+n���涨���뷶Χ��
        int limit_max = 65 + n;
        //�����ʾ��䣬�½�һ��String�Ͷ���������ʱ����
        System.out.println("Enter "+ n + " rows of letters separated by spaces: ");
        char temp_str;
        int temp_int = 0;
        //�����ն�ά���飬����������תΪint���ж��Ƿ�Ϸ��ٸ�ֵ
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
        //���α�����ά���飬Ԫ����Ϊһά�����±꣬�ж��Ƿ��ظ�+7. ���ݽ�����
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
