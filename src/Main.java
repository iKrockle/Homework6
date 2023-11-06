public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
        task9();
        System.out.println();
        task10();
        System.out.println();
    }

    public static void task1(){
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void task2(){
        for (int i=10;i>0;i--){
            System.out.println(i);
        }
    }
    public static void task3(){
        for (int i=0;i<=17;i+=2){
            System.out.println(i);
        }
    }
    public static void task4(){
        for (int i=10;i>=-10;i--){
            System.out.println(i);
        }
    }

    public static void task5(){

        for (int i=1904;i<=2096;i++){
            if (i%400 == 0||(i%100 != 0 && i%4 == 0))
                System.out.println(i+" год является високосным");
        }
    }

    public static void task6(){
        for (int i=7;i<=98;i+=7){
            System.out.println(i);
        }
    }

    public static void task7(){
        for (int i=1;i<=512;i*=2){
            System.out.println(i);
        }
    }

    public static void task8(){
        for (int i=1;i<=12;i++){
            System.out.println("Месяц "+i+", сумма накоплений равна "+i*29000+" рублей");
        }
    }

    public static void task9(){
        double summ=0;
        for (int i=1;i<=12;i++){
            summ = summ*1.01+29000;
            System.out.println("Месяц "+i+", сумма накоплений равна "+String.format("%.2f",summ)+" рублей");
        }
    }

    public static void task10(){
        for (int i=1;i<=10;i++){
            System.out.println(i*2);
        }
    }
}