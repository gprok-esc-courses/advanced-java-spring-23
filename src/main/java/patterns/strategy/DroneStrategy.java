package patterns.strategy;

public class DroneStrategy implements RouteStrategy {
    @Override
    public String getRoute() {
        return "Route by drone ...";
    }
}
