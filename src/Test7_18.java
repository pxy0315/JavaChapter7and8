//ð������
import java.util.Arrays;
import java.util.Scanner;
public class Test7_18 {

	public static void main(String[] args) {
        double[] list = new double[10];
        //����ʮ��ֵ
        Scanner input = new Scanner(System.in);
        System.out.print("������10��double��ֵ��");
        for (int i = 0; i < 10 ; i++){
            list[i] = input.nextDouble();
        }
        list = bubble(list);
        System.out.print(Arrays.toString(list));
    }
    //���������ð������
    public static double[] bubble(double[] list){
        //1. ��ȡlist���ȣ�������ʱ�洢����temp
        int length = list.length;
        double temp = 0;
        //2. ˫�����list�����ǰһ��ֵ>��һ��ֵ�򽻻�������ֵ
        for (int a = 0 ; a < length - 1 ; a++){
            for (int i = 0 ; i < length - 1 ; i++){
                if (list[i] > list[i+1]){
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }
        //3. ����list����
        return list;

	}

}
