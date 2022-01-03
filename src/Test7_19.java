//�Ƿ�������ˣ�
import java.util.Scanner;
import java.util.Arrays;

public class Test7_19 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int length = input.nextInt();
        //����һ������+��ȡ�û����루��list��ֵ��
        int[] list = new int[length];
        System.out.print("Enter the contents of the list: ");
        for (int i = 0 ; i < length ; i++){
            list[i] = input.nextInt();
        }
        //������鳤�Ⱥ�Ԫ��
        System.out.print("The list has " + length + " integers ");
        for (int i = 0 ; i < length ; i++){
            System.out.print(list[i] + " ");
        }
        boolean bool = isSorted(list);
        if (bool)
            System.out.print("\nThe list is already sorted");
        else
            System.out.print("\nThe list is not sorted");
    }
    // isSorted�������жϴ���������Ƿ��Ѿ��ź���
    public static boolean isSorted(int[] list){
        //isSorted��������ȡ��������鳤��Ϊlength
        int length = list.length;
        //isSorted����������2�����飬���ȵ���length
        int[] list_copy = new int[length];
        int[] list_copy_reverse = new int[length];
        //isSorted����������������鸴�Ƹ��ո��������������飨˳��ͬ��
        for (int i = 0 ; i < length ; i ++){
            list_copy[i] = list[i];
            list_copy_reverse[i] = list[length - i - 1];
        }
        //isSorted��������list��������ֱ�ӵ���Arrays���sort������
        Arrays.sort(list);
        //isSorted���������������������ȱȽϣ�equals(lis1, list2)������ֱ���������ֵ
        return Arrays.equals(list, list_copy) || Arrays.equals(list, list_copy_reverse);

	}

}
