//冒泡排序
import java.util.Arrays;
import java.util.Scanner;
public class Test7_18 {

	public static void main(String[] args) {
        double[] list = new double[10];
        //输入十个值
        Scanner input = new Scanner(System.in);
        System.out.print("请输入10个double型值：");
        for (int i = 0; i < 10 ; i++){
            list[i] = input.nextDouble();
        }
        list = bubble(list);
        System.out.print(Arrays.toString(list));
    }
    //对数组进行冒泡排序
    public static double[] bubble(double[] list){
        //1. 获取list长度，声明临时存储变量temp
        int length = list.length;
        double temp = 0;
        //2. 双层遍历list，如果前一个值>后一个值则交换两个数值
        for (int a = 0 ; a < length - 1 ; a++){
            for (int i = 0 ; i < length - 1 ; i++){
                if (list[i] > list[i+1]){
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }
        //3. 返回list数组
        return list;

	}

}
