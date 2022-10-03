package Lesson2;

public class UncheckedExcaptions {
    public static void main(String[] args) {
        int a =1;
        int b =0;

        /*try {
            int c = a/b;
        }catch (ArithmeticException ex){ // эту проблему перехватили и обработали
            System.out.println(ex);
        }*/
        if (b!= 0){
            int c = a/b;
        }

        System.out.println("I'm here!");
        System.out.println("I'm alive!");

        String[] strings ={"warea","sadfszd"};
        if (2<strings.length && 2>= 0){
            System.out.println(strings[2]);
        }

        /*Cat cat = null;
        if(cat != null) { // если кет не нулл проверка
            System.out.println(cat.toString());
        }*/
    }

}
