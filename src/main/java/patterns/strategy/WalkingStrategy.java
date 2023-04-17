package patterns.strategy;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public String getRoute() {
        return "Route walking ...";
    }
}
