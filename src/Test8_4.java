//����ÿ����Ա������Сʱ������ά���飩
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
        //�½�һ������Ϊ8��һά���飬�洢ÿλԱ������Сʱ��
        int[] emplayee_workhours_sum = new int[raw];
        
        int sum = 0;
        //˫��ѭ����������ά���飬���±��0��ʼ7���� ���±��0��ʼ6����
        for (int a = 0 ; a < raw ; a++){
            //ѭ�����ڣ���һ���ڣ����������������Ĵ洢�ӺͶ���ֵΪ0
            sum = 0;
            for (int b = 0 ; b < col ; b++){
                sum += emplayees_workhours[a][b];
            }
            //ѭ�����ڣ���һ���ڣ������Ӻ͸�ֵ��һά����
            emplayee_workhours_sum[a] = sum;
        }
        
        int[] copy = new int[raw];
        //ԭһά���鸴�Ƹ��´�����һά����
        System.arraycopy(emplayee_workhours_sum, 0 , copy, 0, raw);
        //����һά�����������
        Arrays.sort(copy);
        //������һά����Ԫ�أ�ƥ�䵽�������Ա��ţ�ԭ�����±꣩��Ԫ��ֵ���������Ԫ��ֵ��0
        for (int a = copy.length - 1 ; a >= 0 ; a--){
            //��ԭ��һά�������ƥ��
            for (int b = 0 ; b < emplayee_workhours_sum.length ; b++){
                if (copy[a] == emplayee_workhours_sum[b]){
                    System.out.println("Employee " + b + " һ�ܹ���" + copy[a] + "Сʱ");
                    emplayee_workhours_sum[b] = 0;
                }
            }
        }
	}
}
