package JavaFxExercise;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CookieClicker extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	private Circle cookie;
	private Button resetButton;
	private int clicks = 0;
	private Text clickerText;
	
	@Override
	public void start(Stage stageOne) throws Exception {
		stageOne.setTitle("Cookie Clicker!");
		BorderPane pane = new BorderPane();
		StackPane pane1 = new StackPane();
		StackPane pane2 = new StackPane();
		
		cookie = new Circle();
		cookie.setRadius(100);
		//cookie.setCenterX(200);
		//cookie.setCenterY(200);
		cookie.setFill(Color.RED);
		
		resetButton = new Button("Reset Click Count");
		resetButton.setOnAction(e -> {
			clicks = -1;
			clickerText.setText("Times Clicked: " + clicks);
		});
		clickerText = new Text("Times Clicked: " + clicks);
		Text changeColor = new Text("Press the R/B/G keys to change the circles color.");
		
		pane1.getChildren().addAll(cookie, clickerText);
		pane2.getChildren().add(resetButton);
		
		pane.setCenter(pane1);
		pane.setBottom(pane2);
		pane.setTop(changeColor);
		pane.setPadding(new Insets (10, 10, 10, 10));
		
		Scene scene = new Scene (pane, 400, 400);
		
		scene.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
		    @Override
		    public void handle(MouseEvent mouseEvent) {
		       clicks++;
		       clickerText.setText("Times Clicked: " + clicks); 
		    }
		});
		
		scene.setOnKeyPressed(e -> {
			switch (e.getCode()){
				case R: cookie.setFill(Color.RED); break;
				case B: cookie.setFill(Color.BLUE); break;
				case G: cookie.setFill(Color.GREEN); break;
				default:cookie.setFill(Color.YELLOW); break;
			}
		});
		
		stageOne.setScene(scene);
		stageOne.show();
	}
	

}
