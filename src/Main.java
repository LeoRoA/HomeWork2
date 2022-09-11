public class Main {
    public static void main(String[] args) {
        //Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.printf("Задание 1: dog = %.0f, cat = %.1f, paper = %d \n", dog, cat, paper);

        //Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.printf("Задание 2: dog = %.0f, cat = %.1f, paper = %d \n", dog, cat, paper);

        //Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.printf("Задание 3: dog = %.1f, cat = %.1f, paper = %d \n", dog, cat, paper);

        //Задание 4
        var friend = 19;
        System.out.printf("Задание 4: \nfriend = %d \n", friend);
        friend += 2;
        System.out.printf("friend = %d \n", friend);
        friend = friend / 7;
        System.out.printf("friend = %d \n", friend);

        //Задание 5
        var frog = 3.5;
        System.out.printf("Задание 5: \nfrog = %.1f \n", frog);
        frog *= 10;
        System.out.printf("frog = %.1f \n", frog);
        frog = frog / 3.5;
        System.out.printf("frog = %.1f \n", frog);
        frog += 10;
        System.out.printf("frog = %.1f \n", frog);

        //Задание 6
        var v1 = 78.2;
        var v2 = 82.7;
        var v12 = v1 + v2;
        var vd = v2 - v1;
        System.out.printf("Вес первого: %.1f кг \nВес второго: %.1f кг \nВес общий: %.1f кг \nРазница в весе: %.1f кг", v1, v2, v12, vd);
    }
}