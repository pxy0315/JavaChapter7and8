//合并两个有序列表
import java.util.Scanner;
public class Test7_31 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int length1 = input.nextInt();
        //声明一个int型数组list1，长度赋值为上面的int型对象
        int[] list1 = new int[length1];
        //通过循环给数组list1赋值
        for (int i = 0 ; i < length1 ; i++){
            list1[i] = input.nextInt();
        }
        //重复1~3步，给list2赋值
        System.out.print("Enter list2 size and contents: ");
        int length2 = input.nextInt();
        int[] list2 = new int[length2];
        for (int i = 0 ; i < length2 ; i++){
            list2[i] = input.nextInt();
        }
        //输出list1，以一个元素一个空格输出
        System.out.print("list1 is ");
        for (int i = 0 ; i < length1 ; i++){
            System.out.print(list1[i] + " ");
        }
        System.out.println();
        //输出list2，以一个元素一个空格输出
        System.out.print("list2 is ");
        for (int i = 0 ; i < length2 ; i++){
            System.out.print(list2[i] + " ");
        }
        System.out.println();
        //将list1和list2的长度相加，作为list_sum数组长度（声明）
        int length_sum = length1 + length2;
        int[] list_sum = new int[length_sum];
        //调用merge方法，传入list1和list2，list_sum接收返回
        list_sum = merge(list1, list2);
        //list_sum以一个元素一个空格输出
        System.out.print("The merged list is ");
        for (int i = 0 ; i < length_sum ; i++){
            System.out.print(list_sum[i] + " ");
        }
    }
    //谁小谁加到新数组后面，小的元素滚入下一个元素，大的元素不变；
    // 一旦有数组比较结束将另一个数组剩下的全部加到新数组中
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
