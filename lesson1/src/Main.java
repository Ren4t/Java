public class Main {


    public static void main(String [] args){
        boolean flag = false;
        int i =220000000;
        long l = 220000000000000000L;
        float f = 10.2564574f;
        double d = 10.42314335354345;
        char c  = 'a';
        byte by = 125;
        short sh = 30000;
        String str = "hello";


    }


    int metod3(int a,int b,int c,int d){
        return a*(b+(c/d));
    }

    boolean metod4(int a,int b ){
        if(a + b >= 10 && a + b <= 20) return true;
        else return  false;
    }
    void metod5 (int a){
        if(a >= 0) System.out.println(a + " число положительное");
        else System.out.println(a + " число отрицательное");
    }

    boolean metod6(int a){
        if(a < 0) return true;
        else return false;
    }
     void metod7(String name){
         System.out.println("Привет, " + name + "!");
     }

     void metod8(int year){
        if (year % 400 == 0) System.out.println(year + " високосный");
        else if ((year % 4 == 0)&& !(year % 100 == 0)) System.out.println(year + " високосный");
            else System.out.println(year + " невисокосный");
     }
}
