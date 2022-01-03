//�ϲ����������б�
import java.util.Scanner;
public class Test7_31 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int length1 = input.nextInt();
        //����һ��int������list1�����ȸ�ֵΪ�����int�Ͷ���
        int[] list1 = new int[length1];
        //ͨ��ѭ��������list1��ֵ
        for (int i = 0 ; i < length1 ; i++){
            list1[i] = input.nextInt();
        }
        //�ظ�1~3������list2��ֵ
        System.out.print("Enter list2 size and contents: ");
        int length2 = input.nextInt();
        int[] list2 = new int[length2];
        for (int i = 0 ; i < length2 ; i++){
            list2[i] = input.nextInt();
        }
        //���list1����һ��Ԫ��һ���ո����
        System.out.print("list1 is ");
        for (int i = 0 ; i < length1 ; i++){
            System.out.print(list1[i] + " ");
        }
        System.out.println();
        //���list2����һ��Ԫ��һ���ո����
        System.out.print("list2 is ");
        for (int i = 0 ; i < length2 ; i++){
            System.out.print(list2[i] + " ");
        }
        System.out.println();
        //��list1��list2�ĳ�����ӣ���Ϊlist_sum���鳤�ȣ�������
        int length_sum = length1 + length2;
        int[] list_sum = new int[length_sum];
        //����merge����������list1��list2��list_sum���շ���
        list_sum = merge(list1, list2);
        //list_sum��һ��Ԫ��һ���ո����
        System.out.print("The merged list is ");
        for (int i = 0 ; i < length_sum ; i++){
            System.out.print(list_sum[i] + " ");
        }
    }
    //˭С˭�ӵ���������棬С��Ԫ�ع�����һ��Ԫ�أ����Ԫ�ز��䣻
    // һ��������ȽϽ�������һ������ʣ�µ�ȫ���ӵ���������
    public static int[] merge(int[] list1, int[] list2){
        
        int length1 = list1.length;
        int length2 = list2.length;
     
        int length3 = length1 + length2;
        int[] list_sum = new int[length3];
       
        int a = 0, b = 0;
        for (int i = 0 ; i < length3 ; i++){
            if (a !=length1 && b !=length2 && list1[a] < list2[b]){
                list_sum[i] = list1[a];
                ++a;
            }else if(a !=length1 && b !=length2 && list1[a] >= list2[b]){
                list_sum[i] = list2[b];
                ++b;
            }else if (a == length1 && b != length2){
                list_sum[i] = list2[b];
                ++b;
            }else if (b == length2 && a != length1){
                list_sum[i] = list1[a];
                ++a;
            }
        }
    
        return list_sum;

	}

}
