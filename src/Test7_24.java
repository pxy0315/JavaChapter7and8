//�Ż�ȯ�ռ�
public class Test7_24 {

	public static void main(String[] args) {
		//1. ����4��booleanֵ��4�ֻ�ɫ�Ƿ���ָ�ֵΪfalse��
        boolean bool1 = false, bool2 = false, bool3 = false, bool4 = false;
        //      ����2��intֵ������������ѡȡ�����������±겢��ֵΪ0��1������Ϊ4��int������
        int count_pick = 0, count_index = 0, temp = 0;
        int[] list = new int[4];
        //2. ͨ��ѭ�����ϳ���(int)(Math.random()*52+1)�����Ƶ�ǰ�᣺�ĸ�booleanֵ����Ϊtrue����
        while (!(bool1 && bool2 && bool3 && bool4)) {
            temp = (int)(Math.random()*52+1);
            //ѡȡ����������������1
            ++count_pick;
            //���ֵ��Ӧ��ɫ��booleanֵ���Ϊfalse�������ֵ����������У������±������������1����booleanΪtrue
            if (temp % 4 == 0 && !bool1){
                list[count_index] = temp;
                ++count_index;
                bool1 = true;
            }else if (temp % 4 == 1 && !bool2){
                list[count_index] = temp;
                ++count_index;
                bool2 = true;
            }else if (temp % 4 == 2 && !bool3){
                list[count_index] = temp;
                ++count_index;
                bool3 = true;
            }else if (temp % 4 == 3 && !bool4){
                list[count_index] = temp;
                ++count_index;
                bool4 = true;
            }
        }
        //3. �������飬ÿ��Ԫ��%4��Ӧ��ͬ��ɫ��%13��Ӧ��ֵͬ�����

        for (int i = 0 ; i < 4 ; i++){
            int a = list[i] % 13;
            int b = list[i] % 4;
            // תΪ��ֵ�����
            switch (a) {
                case 0 : 
                	System.out.print("K");
                	break;
                case 1 : 
                	System.out.print("A");
                	break;
                case 2 : 
                	System.out.print("2");
                	break;
                case 3 : 
                	System.out.print("3");
                	break;
                case 4 : 
                	System.out.print("4");
                	break;
                case 5 : 
                	System.out.print("5");
                	break;
                case 6 : 
                	System.out.print("6");
                	break;
                case 7 :
                	System.out.print("7");
                	break;
                case 8 :
                	System.out.print("8");
                	break;
                case 9 :
                	System.out.print("9");
                	break;
                case 10 : 
                	System.out.print("10");
                	break;
                case 11 :
                	System.out.print("J");
                	break;
                case 12 : 
                	System.out.print("Q");
                	break;
            }
            // ���" of "
            System.out.print(" of ");
            // תΪ��ɫ�����
            switch (b) {
                case 0 :
                	System.out.println("Spades");
                	break;
                case 1 :
                	System.out.println("Clubs");
                	break;
                case 2 :
                	System.out.println("Hearts");
                	break;
                case 3 :
                	System.out.println("Diamonds");
                	break;
            }
        }
        //4. ���ѡȡ����
        System.out.println("Number of picks: " + count_pick);

	}

}
