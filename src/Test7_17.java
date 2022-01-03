//对学生排序
import java.util.Scanner;
import java.util.Arrays;
public class Test7_17 {

	public static void main(String[] args) {
		//获取学生个数，作为姓名和成绩两个数组的长度
        Scanner input = new Scanner(System.in);
        System.out.print("输入学生个数：");
        int length = input.nextInt();

        //声明两个数组
        String[] names = new String[length];
        int[] scores = new int[length];

        //使用for循环获取学生姓名和成绩，学生姓名与成绩交替获取，并赋值给两个数组的对应位置
        System.out.print("输入姓名成绩：");
        for (int i = 0 ; i < length ; i++){
            names[i] = input.next();
            scores[i] = input.nextInt();
        }

        //调用自定义方法sort()，传入两个数组并进行排序，返回值是排序后成绩对应的姓名数组
        String[] names_feedback = new String[length];
        names_feedback = sort(names, scores);

        //输出返回的数组
        System.out.print(Arrays.toString(names_feedback));
    }
    //在对成绩数组进行排序（交换位置）的同时，对姓名也做同样交换位置的操作
    public static String[] sort(String[] names, int[] scores){
        //声明一个String数组（names_feedback）用于返回姓名
        String[] names_feedback = new String[names.length];
        //使用for循环控制遍历
        int index = -1;     // 保存最大值下标
        for (int i = 0 ; i < names.length ; i++) {
            //调用自定义方法list_max()，传入scores数组并接收除负数外最大值的下标
            index = list_max(scores);
            //上面接收到的最大值下标index，此时for循环为第i+1次
            //names_feedback[i]=names[index]; 同时将scores[index]=-1
            names_feedback[i]=names[index];
            scores[index]=-1;
        }
        //返回names_feedback数组
        return names_feedback;
    }
    //自定义方法list_max()，传入scores数组并接收除负数外最大值的下标
    public static int list_max(int[] scores){
        // 保存最大值的变量temp_max和最大值的下标temp_index
        int temp_max = 0, temp_index = -1;
        // 获取scores长度为length
        int length = scores.length;
        // 使用for循环获取最大值（负数不计）
        for (int i = 0 ; i < length ; i++){
            if (temp_max < scores[i] && scores[i] >= 0){
                temp_max = scores[i];
                temp_index = i;
            }
        }
        // 返回保存的最大值下标temp_index
        return temp_index;

	}

}
