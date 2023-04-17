package patterns.strategy;

import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        Route route = new Route();

        while (true) {
            System.out.println("1. By Car");
            System.out.println("2. By Bus");
            System.out.println("3. Walking");
            System.out.println("4. Hyperloop");
            System.out.println("5. Drone");
            System.out.println("0. Exit");
            choice = scanner.nextInt();

            if(choice == 0) {
                System.out.println("bye");
                return;
            }

            RouteStrategy strategy = RouteStrategyFactory.getRouteStrategy(choice);
            if(strategy != null) {
                route.setRouteStrategy(strategy);
                System.out.println(route.getRoute());
            }
        }
    }
}
