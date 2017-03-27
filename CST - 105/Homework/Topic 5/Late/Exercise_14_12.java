import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_14_12 extends Application{
	
	private int projectPercent = 20;
	private String project = "Projects";
	private String projectColor = "Red";
	
	private int quizPercent = 10;
	private String quiz = "Quizzes";
	private String quizColor = "Blue";
	
	private int midtermPercent = 30;
	private String midterm = "Midterm";
	private String midtermColor = "Green";
	
	private int finalPercent = 40;
	private String finalLabel = "Final";
	private String finalColor = "Orange";
	
	@Override
    public void start(Stage primaryStage) {
		primaryStage.setTitle("Grade Percents");
		final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Grades");
        xAxis.setLabel("Grade Category");       
        yAxis.setLabel("Percent");
        
        Series<String, Integer> series1 = new XYChart.Series<String, Integer>();
        series1.getData().add(new XYChart.Data<String, Integer>(project, projectPercent));
        series1.getData().add(new XYChart.Data<String, Integer>(quiz, quizPercent));
        series1.getData().add(new XYChart.Data<String, Integer>(midterm, midtermPercent));
        series1.getData().add(new XYChart.Data<String, Integer>(finalLabel, finalPercent));
        
        Scene scene  = new Scene(bc,800,600);
        bc.getData().add(series1);
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}

}
