package hello;

public class ChartDataPoint {

    private final String month;
    private final Double temp;

    public ChartDataPoint(String content, Double id) {
        this.month = content;
        this.temp = id;
    }

    public Double getTemp() {
        return temp;
    }

    public String getMonth() {
        return month;
    }
}
