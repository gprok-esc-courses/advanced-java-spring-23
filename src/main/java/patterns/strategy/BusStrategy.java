package patterns.strategy;

public class BusStrategy implements RouteStrategy {
    @Override
    public String getRoute() {
        return "Route by Bus ...";
    }
}
