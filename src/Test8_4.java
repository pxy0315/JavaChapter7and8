//计算每个雇员工作的小时数（二维数组）
import java.util.Arrays;
public class Test8_4 {

	public static void main(String[] args) {
		int[][] emplayees_workhours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9},
        };
        int raw = emplayees_workhours.length;
        int col = emplayees_workhours[0].length;
        //新建一个长度为8的一维数组，存储每位员工工作小时数
        int[] emplayee_workhours_sum = new int[raw];
        
        int sum = 0;
        //双层循环语句遍历二维数组，行下标从0开始7结束 列下标从0开始6结束
        for (int a = 0 ; a < raw ; a++){
            //循环体内（第一层内）：赋第三步创建的存储加和对象值为0
            sum = 0;
            for (int b = 0 ; b < col ; b++){
                sum += emplayees_workhours[a][b];
            }
            //循环体内（第一层内）：将加和赋值给一维数组
            emplayee_workhours_sum[a] = sum;
        }
        
        int[] copy = new int[raw];
        //原一维数组复制给新创建的一维数组
        System.arraycopy(emplayee_workhours_sum, 0 , copy, 0, raw);
        //对新一维数组进行排序
        Arrays.sort(copy);
        //遍历新一维数组元素，匹配到则输出雇员编号（原数组下标）和元素值，输出后则将元素值置0
        for (int a = copy.length - 1 ; a >= 0 ; a--){
            //与原有一维数组进行匹配
            for (int b = 0 ; b < emplayee_workhours_sum.length ; b++){
                if (copy[a] == emplayee_workhours_sum[b]){
                    System.out.println("Employee " + b + " 一周工作" + copy[a] + "小时");
                    emplayee_workhours_sum[b] = 0;
                }
            }
        }
	}
}
