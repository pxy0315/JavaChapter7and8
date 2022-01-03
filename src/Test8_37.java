//�²��׸�
import java.util.Scanner;

public class Test8_37 {

	public static void main(String[] args) {
		//1. ��һ����άString���鸳�ݺ��׸���String��ֵ
        String[][] str_input = {
                {"Alabama", "�ɸ�����"},         {"Alaska", "��ŵ"},
                {"Arizona", "��˳�"},           {"Arkansas", "Сʯ��"},
                {"California", "����������"},    {"Colorado", "����"},
                {"Connecticut", "���ظ���"},     {"Delaware", "���"},
                {"Florida", "��������"},         {"Georgia", "��������"},
                {"Hawaii", "��ū³³"},          {"Idaho", "������"},
                {"Illinois", "˹���ַƶ���"},     {"Indiana", "ӡ�ڰ��ɲ���˹"},
                {"Iowa", "��÷��"},              {"Kansas", "��Ƥ��"},
                {"Kentucky", "�����˸�"},        {"Lousiana", "����³��"},
                {"Maine", "�¹�˹��"},           {"Maryland", "���ǲ���˹"},
                {"Massachusetts", "��ʿ��"},     {"Michigan", "����"},
                {"Minnesota", "ʥ����"},         {"Mississippi", "�ܿ�ѷ"},
                {"Missouri", "�ܸ�ѷ��"},        {"Montana", "������"},
                {"Nebraska", "�ֿ�"},            {"Nevada", "��ɭ��"},
                {"New Hampshire", "���Ƶ�"},     {"New Jersey", "���׶�"},
                {"New Mexico", "ʥ���"},        {"New York", "�¶�����"},
                {"North Carolina", "����"},      {"North Dakota", "��˹��"},
                {"Ohio", "���ײ�"},              {"Oklahoma", "����������"},
                {"Oregon", "����ķ"},            {"Pennsylvania", "����˹��"},
                {"Rhode Island", "����ά��˹"},   {"South Carolina", "���ױ���"},
                {"South Dakota", "Ƥ��"},        {"Tennessee", "��ʲά��"},
                {"Texas", "��˹͡"},             {"Utah", "�κ���"},
                {"Vermont", "�ɱ�����"},         {"Virginia", "��ʿ��"},
                {"Washington", "����ƥ��"},      {"West Virginia", "���˹��"},
                {"Wisconsin", "���ѷ"},         {"Wyoming", "����"}
        };
        //2. ���Ҹ�����˳�򣨽���������˳��
        String[][] str = new String[50][2];
        int temp = 0, count = 0;
        while (!is_fill(str) && count < 20){
            temp = (int) (Math.random() * 50);
            if (str[temp][0] == null){
                str[temp][0] = str_input[count][0];
                str[temp][1] = str_input[count][1];
                ++count;
            }
        }
        for (int i = 0 ; i < 50 ; i++){
            if (str[i][0] == null){
                str[i][0] = str_input[count][0];
                str[i][1] = str_input[count][1];
                ++count;
            }
        }
        //3. �½�String����int�ͼ�������
        String str_temp = "";
        int count_correct = 0;
        //4. ʹ��forѭ�����в²�
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < 50 ; i++){
            //5. ѭ�����ڣ������ʾ��䣬ʹ��String��������û��²�
            System.out.print("What is the capital of " + str[i][0] + "?");
            str_temp = input.next();
            //6. ѭ�����ڣ��²���𰸶Աȣ�������������1
            if (str_temp.equals(str[i][1])){
                System.out.println("Your answer is correct");
                ++count_correct;
            } else {
                System.out.println("The correct answer should be " + str[i][1]);
            }
        }
        //7. ����ѭ����������¶Դ���
        System.out.println("The correct count is " + count_correct);
    }

    /** �жϴ����String�����Ƿ��Ѿ����� */
    public static boolean is_fill(String[][] str){
        for (int i = 0 ; i < str.length ; i++){
            if (str[i][0] == null){
                return false;
            }
        }
        return true;

	}

}
