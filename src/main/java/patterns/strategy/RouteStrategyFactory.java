package patterns.strategy;

public class RouteStrategyFactory {
    public static RouteStrategy getRouteStrategy(int id) {
        switch (id) {
            case 1:
                return new CarStrategy();
            case 2:
                return new BusStrategy();
            case 3:
                return new WalkingStrategy();
            case 4:
                return new HyperloopStrategy();
            case 5:
                return new DroneStrategy();
        }

        return null;
    }
}
