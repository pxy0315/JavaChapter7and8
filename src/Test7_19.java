//是否排序好了？
import java.util.Scanner;
import java.util.Arrays;

public class Test7_19 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int length = input.nextInt();
        //声明一个数组+获取用户输入（给list赋值）
        int[] list = new int[length];
        System.out.print("Enter the contents of the list: ");
        for (int i = 0 ; i < length ; i++){
            list[i] = input.nextInt();
        }
        //输出数组长度和元素
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
    // isSorted方法：判断传入的数组是否已经排好序
    public static boolean isSorted(int[] list){
        //isSorted方法：获取传入的数组长度为length
        int length = list.length;
        //isSorted方法：声明2个数组，长度等于length
        int[] list_copy = new int[length];
        int[] list_copy_reverse = new int[length];
        //isSorted方法：将输入的数组复制给刚刚声明的两个数组（顺序不同）
        for (int i = 0 ; i < length ; i ++){
            list_copy[i] = list[i];
            list_copy_reverse[i] = list[length - i - 1];
        }
        //isSorted方法：对list进行排序（直接调用Arrays类的sort方法）
        Arrays.sort(list);
        //isSorted方法：对两个数组进行深度比较（equals(lis1, list2)），并直接输出返回值
        return Arrays.equals(list, list_copy) || Arrays.equals(list, list_copy_reverse);

	}

}
