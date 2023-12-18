package software.ulpgc.kata3;

import java.util.Map;

public record Chart(String title, String xAxisLabel, String yAxisLabel, Map<String, Double> data) {
}
