//���������
import java.util.Arrays;
public class Test7_23 {

	public static void main(String[] args) {
		//1. ������������һ������Ϊ100��boolean�����飨Ĭ��ֵfalse�����踳ֵ��
        int length = 100;
        boolean[] list = new boolean[length];
        //2. ��������������i��ͬѧ�ӵ�i�����ӿ�ʼ�ı�ÿ��i������״̬������forѭ������boolean������
        // �����Զ��巽��������boolean����ͱ����Ĵ�������ԭ���������շ�������ֵ
        for (int i = 1 ; i <= 100 ; i++){
            list = mymethod(list, i);
        }
        //3. ���������������������󣬶������ٽ��б�������Ԫ��ֵΪtrue���򷵻�index�±�ֵ+һ���ո�
        for (int i = 0 ; i < 100 ; i++){
            if (list[i]){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean[] mymethod(boolean[] list, int num){
        //4. �Զ��巽��������һ��ֵΪ100��int�Ͷ���
        int length = 100;
        //5. �Զ��巽���������贫�������Ϊlist��ֵΪnum���Դ����������б�����i��1��ʼ���±�Ϊi-1��
        for (int i = 1 ; i <= 100 ; i++){
            // ����i%num==0�ģ����޸�booleanֵ
            if (i % num == 0){
                list[i-1] = !list[i-1];
            }
        }
        //6. �Զ��巽������������
        return list;
	}

}
