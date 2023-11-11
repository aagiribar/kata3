package software.ulpgc.kata3.swing;

import software.ulpgc.kata3.ChartDisplay;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private ChartDisplay chartDisplay;

    public MainFrame() throws HeadlessException {
        setTitle("Chart");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        add(createChartDisplay());
    }

    public ChartDisplay getChartDisplay() {
        return chartDisplay;
    }

    private Component createChartDisplay() {
        JFreePanelChartDisplay display = new JFreePanelChartDisplay();
        chartDisplay = display;
        return display;
    }
}
