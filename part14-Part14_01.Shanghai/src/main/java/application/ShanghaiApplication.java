package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Define the x-axis and y-axis with appropriate ranges
        NumberAxis xAxis = new NumberAxis(2007, 2017, 1);
        NumberAxis yAxis = new NumberAxis(50, 80, 5); // Ranking usually between 50 and 80
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        // Create a LineChart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki Ranking (2007-2017)");

        // Prepare data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Ranking");

        // Add data to the series
        int[] years = {2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017};
        int[] rankings = {73, 68, 72, 72, 74, 73, 76, 73, 67, 56, 56};

        for (int i = 0; i < years.length; i++) {
            series.getData().add(new XYChart.Data<>(years[i], rankings[i]));
        }

        // Add series to the chart
        lineChart.getData().add(series);

        // Create Scene with LineChart
        Scene scene = new Scene(lineChart, 800, 600); // Width and Height

        // Set up the Stage
        primaryStage.setTitle("University of Helsinki Ranking");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }
}
