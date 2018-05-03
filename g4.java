import java.util.*;

import java.io.*;

/**

 * @author Lulú Badillo

 */

public class g4 {



    public static void main(String[] args) throws IOException{

        Scanner K = new Scanner(System.in);

        double W[] = new double [2]; //Variable W = pH

        W[0] = 0;

        W[1] = 0;

        double X[] = new double [2]; //variable X = conductivity

        X[0] = 0;

        X[1] = 0;

        double Y[] = new double [2]; //variable Y = CO2

        Y[0] = 0;

        Y[1] = 0;

        double Z[] = new double [2];//Variable Z = Humidity

        Z[0] = 0;

        Z[1] = 0;

        double DATA[] = new double [2]; //Variable DATA =(W;X;Y;Z) operations

        for (int i = 0; i <= 1; i++) {

            while (W[i] <= 0 || W[i] > 14) {

                System.out.print("pH of Test" + i +": ");

                W[i] = K.nextDouble();

                if (W[i] <= 0 || W[i] > 14) {

                    System.out.println("Respect the parameters!");

                }

            }

            while (X[i] <= 0 || X[i] > 1000) { //PARAMS AREN'T CLEAR, 0.0...1-1000 DEFAULT

                System.out.print("Conductivity of Test" + i +": ");

                X[i] = K.nextDouble();

                if (X[i] <= 0 || X[i] > 1000) {

                    System.out.println("Respect the parameters!");

                }

            }

            while (Y[i] <= 0 || Y[i] > 1000) { //PARAMS AREN'T CLEAR, 0.0...1-1000 DEFAULT

                System.out.print("CO2 of Test" + i +": ");

                Y[i] = K.nextDouble();

                if (Y[i] <= 0 || Y[i] > 1000) {

                    System.out.println("Respect the parameters!");

                }

            }

            while (Z[i] <= 0 || Z[i] > 100) {

                System.out.print("Ground humidity of Test" + i +": %");

                Z[i] = K.nextDouble();

                if (Z[i] <= 0 || Z[i] > 100) {

                    System.out.println("Respect the parameters! (0.0...1-100)");

                }

            }

            if (W[i] < 5) {

                DATA[i]+=2;

            } else if (W[i] >= 5 && W[i] < 6.5) {

                DATA[i]+=1;

            } else if (W[i] >= 6.5 && W[i] <= 7.5) {

                //DATA[i]+=0;

            } else if (W[i] > 7.5 && W[i] <= 8.5) {

                DATA[i]-=1;

            } else {

                DATA[i]-=2;

            }

        }

        if (X[0] < X[1]) {

            DATA[0]+=1;

        } else if (X[0] > X[1]) {

            DATA[1]+=1;

        }

        if (Y[0] < Y[1]) {

            DATA[0]+=1;

        } else if (Y[0] > Y[1]) {

            DATA[1]+=1;

        }

        if (Z[0] < Z[1]) {

            DATA[1]+=1;

            if (Z[1] > 30) {

                DATA[1]+=1;

            }

        } else if (Z[0] > Z[1]) {

            DATA[0]+=1;

            if (Z[0] > 30) {

                DATA[0]+=1;

            }

        }



        if (DATA[0] > DATA[1]) {

            System.out.println("The area of Test 2 is more likely to grow cacti!");

        } else if (DATA[1] > DATA[0]) {

            System.out.println("The area of Test 1 is more likely to grow cacti!");

        } else if (DATA[0] > 4) {

            System.out.println("It is highly recommendable not to grow cacti in this areas");

        } else {

            System.out.println("Both areas are in similar conditions to grow cacti!");

        }



    }    

}
