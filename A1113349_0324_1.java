import java.util.Scanner;

class Animal{
    String name;
    double height;
    int weight;
    int speed;


    void show() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Speed: " + speed + " km/h");
    }

    double distance(int x, double y) {
        return x * y * speed;
    }

    double distance(int x) {
        return x * speed;
    }
}

public class Main{

    public static void main(String[] args){
        Animal animal1,animal2,animal3,animal4;
        animal1=new Animal();
        animal2=new Animal();
        animal3=new Animal();
        animal4=new Animal();

        animal1.name="雪寶";
        animal1.height=1.1;
        animal1.weight=52;
        animal1.speed=100;
        animal1.show();

        animal2.name="驢子";
        animal2.height=1.5;
        animal2.weight=99;
        animal2.speed=200;
        animal2.show();

        animal3.name="安那";
        animal3.height=1.1;
        animal3.weight=52;
        animal3.speed=100;
        animal3.show();

        animal4.name="愛沙";
        animal4.height=1.1;
        animal4.weight=52;
        animal4.speed=100;
        animal4.show();


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter x and y for " + animal1.name + " (separated by space):");
            int time1 = scanner.nextInt();
            double acceleration1 = scanner.nextDouble();
            if(acceleration1==0){
                System.out.println(animal1.name+ " ran " + animal1.distance(time1) + " km.");
            }
            else{
                System.out.println(animal1.name+ " ran " + animal1.distance(time1, acceleration1) + " km.");
            }
            System.out.println("Enter x and y for " + animal2.name + " (separated by space):");
            int time2 = scanner.nextInt();
            double acceleration2 = scanner.nextDouble();
            if(acceleration2==0){
                System.out.println(animal2.name+ " ran " + animal2.distance(time2) + " km.");
            }
            else{
                System.out.println(animal2.name+ " ran " + animal2.distance(time2, acceleration2 ) + " km.");
            }

            System.out.println("Enter x and y for " + animal3.name + " (separated by space):");
            int time3 = scanner.nextInt();
            double acceleration3 = scanner.nextDouble();
            if(acceleration3==0){
                System.out.println(animal3.name+ " ran " + animal3.distance(time3) + " km.");
            }
            else{
                System.out.println(animal3.name+ " ran " + animal3.distance(time3, acceleration3) + " km.");
            }

            System.out.println("Enter x and y for " + animal4.name + " (separated by space):");
            int time4 = scanner.nextInt();
            double acceleration4 = scanner.nextDouble();
            if(acceleration4==0){
                System.out.println(animal4.name+ " ran " + animal4.distance(time4) + " km.");
            }
            else{
                System.out.println(animal4.name+ " ran " + animal4.distance(time4, acceleration4) + " km.");
            }
        }
        }
}