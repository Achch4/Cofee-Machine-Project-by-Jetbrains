package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static int cofeeMachineMoney = 550;
    static int cofeeMachineWater= 400;
    static int cofeeMachineMilk = 540;
    static int cofeeMachineBeans = 120;
    static int cofeeMachineCups = 9;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String input;
        do {

            System.out.println("Write action (buy, fill, take,  remaining, exit):");
            input = scanner.nextLine();
            switch (input) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(cofeeMachineWater+" ml of water");
                    System.out.println(cofeeMachineMilk+" ml of milk");
                    System.out.println(cofeeMachineBeans+" g of coffee beans");
                    System.out.println(cofeeMachineCups+" disposable cups");
                    System.out.println("$"+cofeeMachineMoney+" of money");
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("invalid input");

            }
            if (input.equals("exit")){
                break;
            }

        }while (true);


    }

    private static void take() {
        System.out.println("I gave you $"+cofeeMachineMoney);
        cofeeMachineMoney=0;
        System.out.println();
    }

    private static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int waterInput = scanner.nextInt();
        cofeeMachineWater+=waterInput;

        System.out.println("Write how many ml of milk you want to add:");
        int milkInput = scanner.nextInt();
        cofeeMachineMilk+=milkInput;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int beanInput = scanner.nextInt();
        cofeeMachineBeans+=beanInput;

        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cupInput = scanner.nextInt();
        cofeeMachineCups+=cupInput;

        scanner.nextLine();

    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String input = scanner.nextLine();
        switch (input) {
            case "1" :
                espresso();
                break;
            case "2":
                latte();
                break;
            case "3":
                cappuccino();
                break;
            case "back":
                break;
        }


    }

    private static void espresso() {
        int espressoWater = 250;
        int espressoBeans = 16;
        int espressoMoney = 4;
        if (cofeeMachineWater >= espressoWater && cofeeMachineBeans >= espressoBeans){
            System.out.println("I have enough resources, making you a coffee!");
            cofeeMachineWater -= espressoWater;
            cofeeMachineBeans -= espressoBeans;
            cofeeMachineMoney += espressoMoney;
            cofeeMachineCups--;
        }else {
            System.out.println("can't make a cup of coffee");
        }
    }
    private static void latte() {
        int latteWater = 350;
        int latteBeans = 20;
        int latteMoney = 7;
        int latteMilk = 75;
        if (cofeeMachineWater >= latteWater && cofeeMachineBeans >= latteBeans && cofeeMachineMilk >= latteMilk){
            System.out.println("I have enough resources, making you a coffee!");
            cofeeMachineWater -= latteWater;
            cofeeMachineBeans -= latteBeans;
            cofeeMachineMilk -= latteMilk;
            cofeeMachineMoney += latteMoney;
            cofeeMachineCups--;
        }else {
            System.out.println("can't make a cup of coffee");
        }
    }
    private static void cappuccino() {
        int cappuccinoWater = 200;
        int cappuccinoBeans = 12;
        int cappuccinoMoney = 6;
        int cappuccinoMilk = 100;
        if (cofeeMachineWater >= cappuccinoWater && cofeeMachineBeans >= cappuccinoBeans && cofeeMachineMilk >= cappuccinoMilk){
            System.out.println("I have enough resources, making you a coffee!");
            cofeeMachineWater -= cappuccinoWater;
            cofeeMachineBeans -= cappuccinoBeans;
            cofeeMachineMilk -= cappuccinoMilk;
            cofeeMachineMoney += cappuccinoMoney;
            cofeeMachineCups--;
        }else {
            System.out.println("can't make a cup of coffee");
        }
    }
}
