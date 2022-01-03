//优惠券收集
public class Test7_24 {

	public static void main(String[] args) {
		//1. 创建4个boolean值表4种花色是否出现赋值为false，
        boolean bool1 = false, bool2 = false, bool3 = false, bool4 = false;
        //      另有2个int值计数变量计算选取次数、数组下标并赋值为0，1个长度为4的int型数组
        int count_pick = 0, count_index = 0, temp = 0;
        int[] list = new int[4];
        //2. 通过循环不断抽牌(int)(Math.random()*52+1)（抽牌的前提：四个boolean值不都为true），
        while (!(bool1 && bool2 && bool3 && bool4)) {
            temp = (int)(Math.random()*52+1);
            //选取次数计数变量自增1
            ++count_pick;
            //求得值对应花色的boolean值如果为false，则将这个值存放在数组中，数组下标计数变量自增1并改boolean为true
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
        //3. 遍历数组，每个元素%4对应不同花色、%13对应不同值并输出

        for (int i = 0 ; i < 4 ; i++){
            int a = list[i] % 13;
            int b = list[i] % 4;
            // 转为数值并输出
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
            // 输出" of "
            System.out.print(" of ");
            // 转为花色并输出
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
        //4. 输出选取次数
        System.out.println("Number of picks: " + count_pick);

	}

}
