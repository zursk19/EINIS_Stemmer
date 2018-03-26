package stemmer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Polish-Language Stemmer");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show(); */

        button = new Button();
        button.setText("Click Me");
        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 600, 400);
        primaryStage.setTitle("Polish-Language Stemmer");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            appIO test = new appIO();
            String stringPath = "C:\\Users\\dawid.zurawski\\testfile.txt";

            System.out.println(test.getText(stringPath));
        }
    }

    public static void main(String[] args) {
        launch(args);

        appIO test = new appIO();
        String stringPath = "C:\\Users\\dawid.zurawski\\testfile.txt";

        //System.out.println(test.getText(stringPath));

    }
}
