
import java.util.Random;
import java.util.Scanner;

public class Jardines_p1
{
    static Scanner sc=new Scanner(System.in);
    static Random rm=new Random();
    static int count=0, cor=0, incor=0;
    public static void main(String[] args){
        System.out.println("Enter Difficulty level(1-5)");
        int math1=sc.nextInt();
        System.out.println("Choose Addition(5), Subtraction(6), Multiplication(7), Division(8), Random(9)");
        int math2=sc.nextInt();
        switch(math1){
            case 1:
            switch (math2) {
                case 5:
                    while (count < 10) {
                        count++;
                        int x = rm.nextInt(10);
                        int y = rm.nextInt(10);
                        add(x, y);
                    }
                    break;
                case 6:
                    while (count < 10) {
                        count++;
                        int x = rm.nextInt(10);
                        int y = rm.nextInt(10);
                        subtract(x, y);
                    }

                    break;
                case 7:
                    while (count < 10) {
                        count++;
                        int x = rm.nextInt(10);
                        int y = rm.nextInt(10);
                        mult(x, y);
                    }

                    break;
                case 8:
                    while (count < 10) {
                        count++;
                        int x = rm.nextInt(10);
                        int y = rm.nextInt(10);
                        Divide(x, y);
                    }

                    break;
                case 9:
                    while (count < 10) {
                        count++;
                        int x = rm.nextInt(10);
                        int y = rm.nextInt(10);
                        random(x, y);
                    }

                    break;
            }
            case 2:
                switch (math2) {
                    case 5:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(100);
                            int y = rm.nextInt(100);
                            add(x, y);
                        }

                        break;
                    case 6:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(100);
                            int y = rm.nextInt(100);
                            subtract(x, y);
                        }

                        break;
                    case 7:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(100);
                            int y = rm.nextInt(100);

                            mult(x, y);
                        }

                        break;
                    case 8:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(100);
                            int y = rm.nextInt(100);
                            Divide(x, y);
                        }

                        break;
                    case 9:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(100);
                            int y = rm.nextInt(100);
                            random(x, y);
                        }

                        break;
                }

            case 3:
                switch (math2) {
                    case 5:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(1000);
                            int y = rm.nextInt(1000);
                            add(x, y);
                        }

                        break;
                    case 6:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(1000);
                            int y = rm.nextInt(1000);
                            subtract(x, y);
                        }

                        break;
                    case 7:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(1000);
                            int y = rm.nextInt(1000);
                            mult(x, y);
                        }

                        break;
                    case 8:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(1000);
                            int y = rm.nextInt(1000);
                            Divide(x, y);
                        }

                        break;
                    case 9:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(1000);
                            int y = rm.nextInt(1000);
                            random(x, y);
                        }

                        break;
                }
            case 4:
                switch (math2) {
                    case 5:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(10000);
                            int y = rm.nextInt(10000);
                            add(x, y);
                        }

                        break;
                    case 6:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(10000);
                            int y = rm.nextInt(10000);
                            subtract(x, y);
                        }

                        break;
                    case 7:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(10000);
                            int y = rm.nextInt(10000);
                            mult(x, y);
                        }

                        break;
                    case 8:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(10000);
                            int y = rm.nextInt(10000);
                            Divide(x, y);
                        }

                        break;
                    case 9:
                        while (count < 10) {
                            count++;
                            int x = rm.nextInt(10000);
                            int y = rm.nextInt(10000);
                            random(x, y);
                        }

                        break;
                }
        }
        percent();
    }

    // addition
    static void add(int x, int y){
        int addition=x+y;
        while(true){
            System.out.println("How much is "+x+" plus "+y+"?");
            int z=sc.nextInt();
            if(z==addition){
                cor++;
                correct();
                break;
            }
            else{
                incor++;
                incorrect();
                break;
            }
        }
    }
    // multiplication
    static void mult(int x, int y){
        int multi=x*y;
        while(true){
            System.out.println("How much is "+x+" times "+y+"?");
            int z=sc.nextInt();
            if(z==multi){
                cor++;
                correct();
                break;
            }
            else{
                incor++;
                incorrect();
                break;
            }
        }
    }
    // subtraction
    static void subtract(int x, int y){
        int subtraction=x-y;
        while(true){
            System.out.println("How much is "+x+" minus "+y+"?");
            int z=sc.nextInt();
            if(z==subtraction){
                cor++;
                correct();
                break;
            }
            else{
                incor++;
                incorrect();
                break;
            }
        }
    }
    // Division
    static void Divide(int x, int y){
        int Division=x/y;
        while(true){
            System.out.println("How much is "+x+" divided by "+y+"?");
            int z=sc.nextInt();
            if(z==Division){
                cor++;
                correct();
                break;
            }
            else{
                incor++;
                incorrect();
                break;
            }
        }
    }
    //random
    static void random(int x, int y){
        int random1=rm.nextInt(4);
        switch(random1){
            case 0:
                int add=x+y;
                System.out.println("How much is "+x+" plus "+y+"?");
                int z=sc.nextInt();
                if(z==add){
                    cor++;
                    correct();
                }
                else{
                    incor++;
                    incorrect();
                }
                break;
            case 1:
                int subtr=x-y;
                System.out.println("How much is "+x+" minus "+y+"?");
                z=sc.nextInt();
                if(z==subtr){
                    cor++;
                    correct();
                }
                else{
                    incor++;
                    incorrect();
                }
                break;
            case 2:
                int multi=x*y;
                System.out.println("How much is "+x+" times "+y+"?");
                z=sc.nextInt();
                if(z==multi){
                    cor++;
                    correct();
                }
                else{
                    incor++;
                    incorrect();
                }
                break;
            case 3:
                int div=x/y;

                System.out.println("How much is "+x+" divided "+y+"?");
                z=sc.nextInt();
                if(z==div){
                    cor++;
                    correct();
                }
                else{
                    incor++;
                    incorrect();
                }
                break;
        }
    }



static void correct() {
        int a = rm.nextInt(4);
        switch (a) {
            case 0: System.out.println("Very Good !\n");
              break;
        case 1: System.out.println("Excellent !\n");
              break;
        case 2: System.out.println("Nice Work !\n");
              break;
        case 3: System.out.println("Keep up the good work !\n");
              break;
          }
        }
static void incorrect(){
        int b=rm.nextInt(4);
        switch(b){
            case 0: System.out.println("No, please try again !\n");
                break;
            case 1: System.out.println("wrong, try once more !\n");
                break;
            case 2: System.out.println("Don't give up !\n");
                break;
            case 3: System.out.println("No, keep trying!\n");
                break;
        }
    }
    static void percent(){
        if(cor>= 7.5){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else {
            System.out.println("Please ask your teacher for extra help.");
        }
    }
}
