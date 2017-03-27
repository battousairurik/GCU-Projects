import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.Box; 
import javafx.stage.Stage; 
         
public class Exercise_14_14 extends Application { 
   @Override 
   public void start(Stage stage) { 
       
      Box box1 = new Box();  
       
      box1.setWidth(300.0); 
      box1.setHeight(600.0);   
      box1.setDepth(300.0); 
           
      Group root = new Group(box1); 
      Scene scene = new Scene(root, 800, 400);   
       
      stage.setTitle("Cube Attempt"); 
      stage.setScene(scene); 
      stage.show(); 
   }
   public static void main(String args[]){ 
      launch(args); 
      //This doesnt create a 3d box, which makes little sense.
   } 
}
