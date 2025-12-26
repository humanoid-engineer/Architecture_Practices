package practice.circuit;

public class FlakyService implements RemoteService {
    private int callCount = 0;

    @Override
    public String fetchData() {
        callCount++;
        if (callCount % 3 != 0) {
            throw new RuntimeException("Service failure");
        }
        return "OK";
    }
}
