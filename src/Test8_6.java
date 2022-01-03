//两个矩阵相乘
import java.util.Scanner;
public class Test8_6 {

	public static void main(String[] args) {
		 //新建三个数组a、b、c，长度均为3*3
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        double[][] c = new double[3][3];
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < 3 ; i++){
            for (int j = 0 ; j < 3; j++){
                a[i][j] = input.nextDouble();
            }
        }
        //从控制台获取用户输入，使用循环读入数组b的元素
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < 3 ; i++){
            for (int j = 0 ; j < 3; j++){
                b[i][j] = input.nextDouble();
            }
        }
       
        c = multiplyMatrix(a, b);
        
        System.out.println("The multipication of the matrices is");
        //调用自定义的输出方法，传入a、b、c三个数组
        output(a, b ,c);
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        //声明一个数组c，长度为3*3
        double[][] c = new double[3][3];
        //使用嵌套循环计算a*b，用c接收，a的列数为n
        // c[i][j] = a[i][1] * b[1][j] + a[i][2] * b[2][j]+……+a[i][n]*b[n][j]
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                for (int n = 0; n < 3 ; n++){
                    c[i][j] += a[i][n] * b[n][j];
                }
            }
        }
        //返回数组c
        return c;
    }
    public static void output(double[][] a, double[][] b, double[][] c){
        //三层循环，最外层行第二层多个同层次循环
        for (int i = 0 ; i < 3; i++){
            //数组a
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(a[i][j] + " ");
            }
            //数组a与数组b之间的空格或*
            if ( i == 1 ){
                System.out.print("\t*\t");
            }
            else{
                System.out.print("\t\t");
            }
            //数组b
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(b[i][j] + " ");
            }
            //数组b与数组c
            if ( i == 1 ){
                System.out.print(" =\t");
            }
            else{
                System.out.print("\t");
            }
            //数组c
            for (int j = 0 ; j < 3 ; j++){
                System.out.printf("%.1f ", c[i][j]);
            }
            System.out.println();
        }
	}

}
