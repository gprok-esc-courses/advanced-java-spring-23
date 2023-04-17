package patterns.strategy;

public class Route {
    private RouteStrategy routeStrategy;

    public Route() {
        routeStrategy = null;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public String getRoute() {
        if(routeStrategy != null) {
            return routeStrategy.getRoute();
        }
        else {
            return "N/A";
        }
    }
}
