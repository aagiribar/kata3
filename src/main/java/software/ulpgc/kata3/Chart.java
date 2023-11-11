package software.ulpgc.kata3;

import java.util.Map;

public record Chart(String title, String xAxis, String yAxis, Map<String, Double> data) {
}
