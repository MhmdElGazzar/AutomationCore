package core.api;

public class EndPoint {
    public EndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    String endPoint;
    public String get()
        {
            return endPoint;
        }
}
