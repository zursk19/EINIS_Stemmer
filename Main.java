package stemmer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import java.io.*;

public class Main extends Application {

    JButton runButton;
    JButton openButton;

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Polish-Language Stemmer");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show(); */

        runButton = new JButton();
        openButton = new JButton();
        runButton.setText("Stem test text from file");
        TextField text = new TextField();


        final FileChooser fileChooser = new FileChooser();


        //This eventually needs to be changes to process the whole action instead of test
        //runButton.setOnAction(e -> testMethod());

        /*openButton.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(final ActionEvent e) {
                        File file = fileChooser.showOpenDialog(Window newWindow = new Window());
                        if (file != null) {
                            openFile(file);
                        }
                    }
                });*/

        StackPane layout = new StackPane();
        /*FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose file path");
        fileChooser.showOpenDialog();*/

        layout.getChildren().add(text);
        layout.getChildren().add(runButton);

        Scene scene = new Scene(layout, 600, 400);
        primaryStage.setTitle("Polish-Language Stemmer");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);

        //System.out.println(test.getText(stringPath));

    }

//     Use this method for testing purposes. Test instances and data
    public static void testMethod() {
        appIO test = new appIO();
        String stringPath = "C:\\Users\\dawid.zurawski\\testfile.txt";

        StemmerText testStemmer = new StemmerText(test.getText(stringPath));
        testStemmer.test();
    }
}
