package patterns.strategy;

public class CarStrategy implements RouteStrategy {

    @Override
    public String getRoute() {
        return "Route by Car ...";
    }
}
