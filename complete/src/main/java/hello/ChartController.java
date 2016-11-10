package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ChartController {

    @RequestMapping("/chartdata")
    public Map<String, Map<String, Double>> chart() {
        Map<String, Map<String, Double>> chartData = new HashMap<String, Map<String, Double>>();
        chartData.put("HighTemperature", getHighTemp());
        chartData.put("LowTemperature", getLowTemp());
        chartData.put("Precipitation", getPrecep());

        System.out.println("Returning from webservice");
        return chartData;
    }

    private Map<String, Double> getHighTemp() {
        Map<String, Double> highTemp = new HashMap<String, Double>();

        highTemp.put("Jan", 48.0);
        highTemp.put("Feb", 44.0);
        highTemp.put("Mar", 53.00);
        highTemp.put("Apr", 64.00);
        highTemp.put("May", 75.00);
        highTemp.put("Jun", 83.00);
        highTemp.put("Jul", 87.00);
        highTemp.put("Aug", 84.00);
        highTemp.put("Sep", 78.00);
        highTemp.put("Oct", 67.00);
        highTemp.put("Nov", 55.00);
        highTemp.put("Dec", 45.00);

        return highTemp;
    }

    private Map<String, Double> getLowTemp() {
        Map<String, Double> lowTemp = new HashMap<String, Double>();

        lowTemp.put("Jan", 27.00);
        lowTemp.put("Feb", 28.00);
        lowTemp.put("Mar", 35.00);
        lowTemp.put("Apr", 44.00);
        lowTemp.put("May", 54.00);
        lowTemp.put("Jun", 63.00);
        lowTemp.put("Jul", 68.00);
        lowTemp.put("Aug", 66.00);
        lowTemp.put("Sep", 59.00);
        lowTemp.put("Oct", 48.00);
        lowTemp.put("Nov", 38.00);
        lowTemp.put("Dec", 29.00);

        return lowTemp;
    }

    private Map<String, Double> getPrecep() {
        Map<String, Double> precep = new HashMap<String, Double>();

        precep.put("Jan", 3.03);
        precep.put("Feb", 2.48);
        precep.put("Mar", 3.23);
        precep.put("Apr", 3.15);
        precep.put("May", 4.13);
        precep.put("Jun", 3.23);
        precep.put("Jul", 4.13);
        precep.put("Aug", 4.88);
        precep.put("Sep", 3.82);
        precep.put("Oct", 3.07);
        precep.put("Nov", 2.83);
        precep.put("Dec", 2.8);

        return precep;
    }
}
