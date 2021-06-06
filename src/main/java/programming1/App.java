/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

/*
Wisconsin residents must be changed 5% sales tax with an additional county-level charge. For Wisconsin residents, prompt for the county of residence.
For Eau Claire county residents, add an additional 0.005 tax.
For Dunn county residents, add an additional 0.004 tax.
Illinois residents must be charged 8% sales tax with no additional county-level charge.
All other states are not charged tax.
The program then displays the tax and the total for Wisconsin and Illinois residents but just the total for everyone else.

Example Output
What is the order amount? 10
What state do you live in? Wisconsin
What county do you live in? Dane
The tax is $0.50.
The total is $10.50.

Constraints
Ensure that all money is rounded up to the nearest cent.
Use a single output statement at the end of the program to display the program results.
 */


package programming1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    private static DecimalFormat df2 = new DecimalFormat("#.00");

    // final double TAX=.055;
    public static void main(String[] args) {
        double TAX = .05;

        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        int amount = in.nextInt();

        System.out.print("What state do you live in? ");

        String state = in.next();



        String out = "The total is $" + df2.format(amount);

        if (state.equalsIgnoreCase("wisconsin")) {
            System.out.print("What county do you live in? ");
            in.nextLine();
            String county = in.nextLine();
            if(county.equalsIgnoreCase("eau claire")){
                TAX=.055;
            }
            if(county.equalsIgnoreCase("dunn")){
                TAX=.054;
            }
            double tax=(amount*TAX);
            double total= amount + tax;
            out ="The tax is $" +df2.format(tax)+".\n"+ "The total is $"+df2.format(total)+".";

        }
        else if(state.equalsIgnoreCase("Illinois")){
            TAX=TAX+.03;
            double tax=(amount*TAX);
            double total= amount + tax;
            out ="The tax is $" +df2.format(tax)+".\n"+ "The total is $"+df2.format(total)+".";
        }
        System.out.println(out);
    }
}