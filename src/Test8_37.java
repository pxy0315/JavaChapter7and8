//猜测首府
import java.util.Scanner;

public class Test8_37 {

	public static void main(String[] args) {
		//1. 给一个二维String数组赋州和首府的String类值
        String[][] str_input = {
                {"Alabama", "蒙哥马利"},         {"Alaska", "朱诺"},
                {"Arizona", "凤凰城"},           {"Arkansas", "小石城"},
                {"California", "萨克拉门托"},    {"Colorado", "丹佛"},
                {"Connecticut", "哈特福德"},     {"Delaware", "多佛"},
                {"Florida", "塔拉哈西"},         {"Georgia", "亚特兰大"},
                {"Hawaii", "火奴鲁鲁"},          {"Idaho", "博伊西"},
                {"Illinois", "斯普林菲尔德"},     {"Indiana", "印第安纳波利斯"},
                {"Iowa", "得梅因"},              {"Kansas", "托皮卡"},
                {"Kentucky", "法兰克福"},        {"Lousiana", "巴吞鲁日"},
                {"Maine", "奥古斯塔"},           {"Maryland", "安那波利斯"},
                {"Massachusetts", "波士顿"},     {"Michigan", "兰辛"},
                {"Minnesota", "圣保罗"},         {"Mississippi", "杰克逊"},
                {"Missouri", "杰弗逊城"},        {"Montana", "海伦那"},
                {"Nebraska", "林肯"},            {"Nevada", "卡森市"},
                {"New Hampshire", "康科德"},     {"New Jersey", "特伦顿"},
                {"New Mexico", "圣大非"},        {"New York", "奥尔巴尼"},
                {"North Carolina", "罗利"},      {"North Dakota", "俾斯麦"},
                {"Ohio", "哥伦布"},              {"Oklahoma", "俄克拉何马城"},
                {"Oregon", "塞勒姆"},            {"Pennsylvania", "哈里斯堡"},
                {"Rhode Island", "普罗维登斯"},   {"South Carolina", "哥伦比亚"},
                {"South Dakota", "皮尔"},        {"Tennessee", "纳什维尔"},
                {"Texas", "奥斯汀"},             {"Utah", "盐湖城"},
                {"Vermont", "蒙比利埃"},         {"Virginia", "里士满"},
                {"Washington", "奥林匹亚"},      {"West Virginia", "查尔斯顿"},
                {"Wisconsin", "麦迪逊"},         {"Wyoming", "夏延"}
        };
        //2. 打乱该数组顺序（仅打乱行数顺序）
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
        //3. 新建String对象、int型计数变量
        String str_temp = "";
        int count_correct = 0;
        //4. 使用for循环进行猜测
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < 50 ; i++){
            //5. 循环体内：输出提示语句，使用String对象接收用户猜测
            System.out.print("What is the capital of " + str[i][0] + "?");
            str_temp = input.next();
            //6. 循环体内：猜测与答案对比，输出结果并自增1
            if (str_temp.equals(str[i][1])){
                System.out.println("Your answer is correct");
                ++count_correct;
            } else {
                System.out.println("The correct answer should be " + str[i][1]);
            }
        }
        //7. 结束循环，并输出猜对次数
        System.out.println("The correct count is " + count_correct);
    }

    /** 判断传入的String对象是否已经满了 */
    public static boolean is_fill(String[][] str){
        for (int i = 0 ; i < str.length ; i++){
            if (str[i][0] == null){
                return false;
            }
        }
        return true;

	}

}
