public class MainController {

    public static void main(String[] args) {




    }
    public static void printSomeNumbers(){
        for (int i = 1; i <= 60; i++){
            System.out.println(i);
        }

    }
    public static void printNumbers(int start, int end){
        for (int i = start; i <= end; i++){
            System.out.println(i);
        }

    }

    public static int sumUp(int start, int end){
        int sum= 0;
        for(int i = start; i<= end; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static int powerOfTwo(int p){
        if(p< 0) return -1;

        int result = 0;
        for(int i = 0; i <p; i++){
            result = result * 2;
        }
        return result;
    }

    public static int sumUpPowerOfTwo(int n){
       int sum = 0;
       for(int i = 0; i <= n; i++){
           sum = sum + powerOfTwo(i);
        }
       return sum;
    }

    //Aufgabe 3:
    public static void rectangleStars(int width, int height){
        for(int i = 0; int i <= height; i++){
            for(int j = 0; j <=width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
