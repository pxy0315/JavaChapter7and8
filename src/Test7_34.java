//�Ա��ַ����е��ַ�����
import java.util.Scanner;
import java.util.Arrays;

public class Test7_34 {

	public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.print("������һ���ַ�����");
        
        str = input.nextLine();
        
        str = sort(str);
      
        System.out.print(str);
    }
    public static String sort(String s){
        //��ȡ�ַ������ȣ���ֵ��length
        int length = s.length();
        //�½�һ��char�����飬����Ϊlength
        char[] ch = new char[length];
        //�����ַ�����charAt()�������ַ�����ÿ���ַ����ݸ�char������
        for ( int i = 0 ; i < length ; i++){
            ch[i] = s.charAt(i);
        }
        //�������������Arrays.sort()��
        Arrays.sort(ch);
        //��������б�����ÿ��Ԫ�ؼӵ��ַ����У������ַ���
        String str = "";
        for (int i = 0 ; i < length ; i++){
            str += ch[i];
        }
        return str;

	}

}
