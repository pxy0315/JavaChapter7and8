//储物柜难题
import java.util.Arrays;
public class Test7_23 {

	public static void main(String[] args) {
		//1. 主方法：声明一个长度为100的boolean型数组（默认值false，无需赋值）
        int length = 100;
        boolean[] list = new boolean[length];
        //2. 主方法：上述第i个同学从第i个柜子开始改变每第i个柜子状态，即用for循环遍历boolean型数组
        // 调用自定义方法，传入boolean数组和遍历的次数，用原数组对象接收方法返回值
        for (int i = 1 ; i <= 100 ; i++){
            list = mymethod(list, i);
        }
        //3. 主方法：上述操作结束后，对数组再进行遍历，当元素值为true，则返回index下标值+一个空格
        for (int i = 0 ; i < 100 ; i++){
            if (list[i]){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean[] mymethod(boolean[] list, int num){
        //4. 自定义方法：创建一个值为100的int型对象
        int length = 100;
        //5. 自定义方法：（假设传入的数组为list，值为num）对传入的数组进行遍历（i从1开始，下标为i-1）
        for (int i = 1 ; i <= 100 ; i++){
            // 凡是i%num==0的，则修改boolean值
            if (i % num == 0){
                list[i-1] = !list[i-1];
            }
        }
        //6. 自定义方法：返回数组
        return list;
	}

}
