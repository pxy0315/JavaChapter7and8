//ģʽʶ���ĸ�������ȵ���
import java.util.Scanner;

public class Test8_19 {

	public static void main(String[] args) {
		//�����û����룬ʹ��int��������������
        Scanner input = new Scanner(System.in);
        System.out.println("����������������������");
        int array_row = input.nextInt();
        int array_col = input.nextInt();
        //����һ����ά���飬����Ϊ�ոս��յ�����*����
        int[][] array = new int[array_row][array_col];
        //ʹ��ѭ�������û����������Ԫ��
        System.out.println("����������Ԫ�أ�");
        for (int i = 0 ; i < array_row ; i++){
            for (int j = 0 ; j < array_col ; j++){
                array[i][j] = input.nextInt();
            }
        }
       
        //ʹ�������ж�����жϷ�������ֵ�����ݽ�����ز�ͬbooleanֵ
        if ( isConsecutiveFour(array) ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static boolean isConsecutiveFour(int[][] values){
        //�Ȼ�ȡvalues���������������
        int row = values.length;
        int col = values[0].length;
        //�ֱ��������С��н��б�����Ѱ���Ƿ����ظ�Ԫ�أ��ٶ����������Խ��߽��б��������Ƿ����ҵ�
        // �б���������ҵ�����true
        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col - 3 ; j++){
                if ( values[i][j] == values[i][j+1] && values[i][j+1] == values[i][j+2]
                        && values[i][j+2] == values[i][j+3])
                    return true;
            }
        }
        // �б���
        for (int j = 0 ; j < col ; j++){
            for (int i = 0 ; i < row - 3 ; i++){
                if ( values[i][j] == values[i+1][j] && values[i+1][j] == values[i+2][j]
                        && values[i+2][j]== values[i+3][j])
                    return true;
            }
        }
        // ���µ����ϵĶԽ���
        for (int i = 3 ; i < row ; i++){
            for (int j = 0 ; j < col - 3 ; j++){
                if (values[i][j] == values[i-1][j+1] && values[i-1][j+1] == values[i-2][j+2]
                        && values[i-2][j+2]== values[i-3][j+3])
                    return true;
            }
        }
        // ���ϵ����µĶԽ���
        for (int i = 0 ; i < row - 3 ; i++){
            for (int j = 0 ; j < col - 3 ; j++){
                if (values[i][j] == values[i+1][j+1] && values[i+1][j+1] == values[i+2][j+2]
                        && values[i+2][j+2] == values[i+3][j+3])
                    return true;
            }
        }
        //����isConsecutiveFour������ҵ�����true���Ҳ�������false
        return false;

	}

}
