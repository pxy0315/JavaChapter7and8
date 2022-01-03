//对比字符串中的字符排序
import java.util.Scanner;
import java.util.Arrays;

public class Test7_34 {

	public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        
        str = input.nextLine();
        
        str = sort(str);
      
        System.out.print(str);
    }
    public static String sort(String s){
        //获取字符串长度，赋值给length
        int length = s.length();
        //新建一个char型数组，长度为length
        char[] ch = new char[length];
        //遍历字符串（charAt()），将字符串的每个字符传递给char型数组
        for ( int i = 0 ; i < length ; i++){
            ch[i] = s.charAt(i);
        }
        //对数组进行排序（Arrays.sort()）
        Arrays.sort(ch);
        //对数组进行遍历，每个元素加到字符串中，返回字符串
        String str = "";
        for (int i = 0 ; i < length ; i++){
            str += ch[i];
        }
        return str;

	}

}
