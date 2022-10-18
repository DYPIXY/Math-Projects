import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Graph extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        NumberAxis xAxis = new NumberAxis(1960, 2020, 10); 
        xAxis.setLabel("Years"); 
        
        NumberAxis yAxis = new NumberAxis(0, 350, 50); 
        yAxis.setLabel("No.of schools");

        LineChart linechart = new LineChart(xAxis, yAxis);
        
        XYChart.Series series = new XYChart.Series(); 
        series.getData().add(new XYChart.Data(1970, 15));
        series.getData().add(new XYChart.Data(1980, 30));
        series.getData().add(new XYChart.Data(1990, 60));
        series.getData().add(new XYChart.Data(2000, 120));
        series.getData().add(new XYChart.Data(2013, 300));
        series.getData().add(new XYChart.Data(2014, 400));

        linechart.getData().add(series);
      
        Group root = new Group(linechart);
        Scene scene = new Scene(root, 600, 300);
        
        primaryStage.setTitle("Teste ultra foda");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args){  
        launch(args);
        System.out.print("mord kaiser");
    }
}
