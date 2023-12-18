package software.ulpgc.kata3.swing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import software.ulpgc.kata3.Chart;
import software.ulpgc.kata3.ChartDisplay;

import javax.swing.*;
import java.util.Map;

public class JFreePanelChartDisplay extends JPanel implements ChartDisplay {

    @Override
    public void show(Chart chart) {
        add(new ChartPanel(chartOf(chart)));
    }

    private JFreeChart chartOf(Chart chart) {
        return ChartFactory.createBarChart(
                chart.title(),
                chart.xAxisLabel(),
                chart.yAxisLabel(),
                dataset(chart.data()));
    }

    private CategoryDataset dataset(Map<String, Double> data) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String platform : data.keySet()) {
            dataset.addValue(data.get(platform), platform, "");
        }
        return dataset;
    }
}
