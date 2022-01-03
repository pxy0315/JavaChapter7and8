//�����������
import java.util.Scanner;
public class Test8_6 {

	public static void main(String[] args) {
		 //�½���������a��b��c�����Ⱦ�Ϊ3*3
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
        //�ӿ���̨��ȡ�û����룬ʹ��ѭ����������b��Ԫ��
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < 3 ; i++){
            for (int j = 0 ; j < 3; j++){
                b[i][j] = input.nextDouble();
            }
        }
       
        c = multiplyMatrix(a, b);
        
        System.out.println("The multipication of the matrices is");
        //�����Զ�����������������a��b��c��������
        output(a, b ,c);
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        //����һ������c������Ϊ3*3
        double[][] c = new double[3][3];
        //ʹ��Ƕ��ѭ������a*b����c���գ�a������Ϊn
        // c[i][j] = a[i][1] * b[1][j] + a[i][2] * b[2][j]+����+a[i][n]*b[n][j]
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                for (int n = 0; n < 3 ; n++){
                    c[i][j] += a[i][n] * b[n][j];
                }
            }
        }
        //��������c
        return c;
    }
    public static void output(double[][] a, double[][] b, double[][] c){
        //����ѭ����������еڶ�����ͬ���ѭ��
        for (int i = 0 ; i < 3; i++){
            //����a
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(a[i][j] + " ");
            }
            //����a������b֮��Ŀո��*
            if ( i == 1 ){
                System.out.print("\t*\t");
            }
            else{
                System.out.print("\t\t");
            }
            //����b
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(b[i][j] + " ");
            }
            //����b������c
            if ( i == 1 ){
                System.out.print(" =\t");
            }
            else{
                System.out.print("\t");
            }
            //����c
            for (int j = 0 ; j < 3 ; j++){
                System.out.printf("%.1f ", c[i][j]);
            }
            System.out.println();
        }
	}

}
