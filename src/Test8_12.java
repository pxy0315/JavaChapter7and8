//¼ÆËãË°¿î
import java.util.Scanner;
public class Test8_12 {

	public static void main(String[] args) {
		// Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.println("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status:");
        int status = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.println("Enter the taxable income:");
        double income = input.nextDouble();

        // compute tax
        double tax = 0;

        int[][] brackets = {
                {8350, 39500, 82250, 171550, 372950},	// Single filer£¨0£©
                {16700, 69000, 137050, 20885, 372950},	// Married jointly qualifying widow(er)£¨1£©
                {8350, 33950, 68525, 104425, 186475},	// Married separately£¨2£©
                {11950, 45500, 117450, 190200, 372950},	// Head of household£¨3£©
        };
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // Compute tax for single filers
        if (status >= 0 && status <= 3) {
            if (income <= brackets[status][0])
                tax = income * rates[0];
            else if (income <= brackets[status][1])
                tax = brackets[status][0] * rates[0] + (income - brackets[status][0]) * rates[1];
            else if (income <= brackets[status][2])
                tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
                        (income - brackets[status][1]) * rates[2];
            else if (income <= brackets[status][3])
                tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
                        (brackets[status][2] - brackets[status][1]) * rates[2] + (income - brackets[status][2]) * rates[3];
            else if (income <= brackets[status][4])
                tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
                        (brackets[status][2] - brackets[status][1]) * rates[2] + (brackets[status][3] - brackets[status][2]) * rates[3] +
                        (income - brackets[status][3]) * rates[4];
            else
                tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
                        (brackets[status][2] - brackets[status][1]) * rates[2] + (brackets[status][3] - brackets[status][2]) * rates[3] +
                        (brackets[status][4] - brackets[status][3]) * rates[4] + (income - brackets[status][4]) * rates[5];
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        // Display the result
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
	}

}
