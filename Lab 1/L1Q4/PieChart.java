package L1Q4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PieChart extends Application {
    @Override
    public void start(Stage stage) {
        ObservableList<javafx.scene.chart.PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new javafx.scene.chart.PieChart.Data("January 2016", 2500),
                new javafx.scene.chart.PieChart.Data("February 2016", 1600),
                new javafx.scene.chart.PieChart.Data("March 2016", 2000),
                new javafx.scene.chart.PieChart.Data("April 2016", 2700),
                new javafx.scene.chart.PieChart.Data("May 2016", 3200),
                new javafx.scene.chart.PieChart.Data("Jun 2016", 800));

        javafx.scene.chart.PieChart pieChart = new javafx.scene.chart.PieChart(pieChartData);

        pieChart.setTitle("Total Sales Of Product A");

        pieChart.setClockwise(true);

        pieChart.setLabelLineLength(50);

        pieChart.setLabelsVisible(true);

        pieChart.setStartAngle(180);

        Group root = new Group(pieChart);

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Pie chart");

        stage.setScene(scene);

        stage.show();
    }
    public static void main(String []args){
        launch(args);
    }
}
