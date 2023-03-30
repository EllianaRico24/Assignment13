import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        DecimalFormat decFormat = new DecimalFormat("0.0#");

        // Cm to Inch and Inch to Cm

        // Input fields & labels 
        TextField cmText = new TextField();
        Label cmLabel = new Label("Cm");
        TextField inchText = new TextField();
        Label inchLabel = new Label("Inches");

        // Buttons
        Button cmToInchButton = new Button(" ---> ");
        Button inchToCmButton =  new Button(" <--- ");

        // Vbox for buttons
        VBox inchCmButtons = new VBox();
        inchCmButtons.getChildren().addAll(cmToInchButton, inchToCmButton);

        // HBox for first row 
        HBox inchCmRow = new HBox(10); 
        inchCmRow.getChildren().addAll(cmText, cmLabel, inchCmButtons, inchText, inchLabel);
        inchCmRow.setAlignment(Pos.CENTER);



        // Miles to Km and Km to Miles

        // Input fields & labels
        TextField kmText = new TextField();
        Label kmLabel = new Label("Km");
        TextField mileText = new TextField();
        Label mileLabel = new Label("Miles  "); 
        
        // Buttons
        Button kmToMileButton = new Button(" ---> ");
        Button mileToKmButton = new Button(" <--- ");

        // VBox for buttons
        VBox mileKmButtons = new VBox();
        mileKmButtons.getChildren().addAll(kmToMileButton, mileToKmButton);

        // HBox for second row
        HBox mileKmRow = new HBox(10);
        mileKmRow.getChildren().addAll(kmText, kmLabel, mileKmButtons, mileText, mileLabel);
        mileKmRow.setAlignment(Pos.CENTER);



        // Pounds to Kg and Kg to Pounds

        // Input fields & labels
        TextField kgText = new TextField();
        Label kgLabel = new Label("Kg ");
        TextField poundText = new TextField();
        Label poundLabel = new Label("Lb         ");

        // Buttons
        Button kgToPoundButton = new Button(" ---> ");
        Button poundToKgButton = new Button(" <--- ");

        // VBox for buttons
        VBox poundKgButtons = new VBox();
        poundKgButtons.getChildren().addAll(kgToPoundButton, poundToKgButton);

        // HBox for third row
        HBox poundKgRow = new HBox();
        poundKgRow.getChildren().addAll(kgText, kgLabel, poundKgButtons, poundText, poundLabel);
        poundKgRow.setAlignment(Pos.CENTER);



        // Grams to Ounces and Ounces to Grams

        // Input fields & Labels
        TextField gramText = new TextField();
        Label gramLabel = new Label ("g  "); 
        TextField ounceText = new TextField();
        Label ounceLabel = new Label("Ounces"); 

        // Buttons
        Button gramToOunceButton = new Button(" --->");
        Button ounceToGramButton = new Button(" <--- ");

        // VBox for buttons
        VBox gramOunceButtons = new VBox();
        gramOunceButtons.getChildren().addAll(gramToOunceButton, ounceToGramButton);

        // HBox for fourth row
        HBox gramOunceRow = new HBox();
        gramOunceRow.getChildren().addAll(gramText, gramLabel, gramOunceButtons, ounceText, ounceLabel);
        gramOunceRow.setAlignment(Pos.CENTER);




        // VBox for all four rows
        VBox root = new VBox(10);
        root.getChildren().addAll(inchCmRow, mileKmRow, poundKgRow, gramOunceRow);
        root.setAlignment(Pos.CENTER);


        // Code for Buttons        

        // Cm to Inch & Inch to Cm Buttons
        cmToInchButton.setOnAction( e -> {
            String s = new String(cmText.getText());
            double d = Double.parseDouble(s);
            d = d * 0.39370; 
            s = decFormat.format(d);
            inchText.setText(s);
        });

        inchToCmButton.setOnAction( e -> {
            String s = new String (inchText.getText());
            double d = Double.parseDouble(s);
            d = d / 0.39370; 
            s = decFormat.format(d);
            cmText.setText(s);
        });

        // Km to Mile & Mile to Km Buttons
        kmToMileButton.setOnAction( e -> {
            String s = new String(kmText.getText());
            double d = Double.parseDouble(s);
            d = d * 0.62137;
            s = decFormat.format(s);
            mileText.setText(s);
        });

        mileToKmButton.setOnAction( e -> {
            String s = new String(mileText.getText());
            double d = Double.parseDouble(s);
            d = d / 0.62137;
            s = decFormat.format(s);
            kmText.setText(s);
        });

        // Kg to Pound & Pound to Kg Buttons
        kgToPoundButton.setOnAction( e -> {
            String s = new String(kgText.getText());
            double d = Double.parseDouble(s);
            d = d *  2.2046;
            s = decFormat.format(s);
            poundText.setText(s);
        });

        poundToKgButton.setOnAction( e -> {
            String s = new String(poundText.getText());
            double d = Double.parseDouble(s);
            d = d / 2.2046;
            s = decFormat.format(s);
            kgText.setText(s);
        });

        // Gram to Ounce & Ounce to Gram Buttons 
        gramToOunceButton.setOnAction( e -> {
            String s = new String(gramText.getText());
            double d = Double.parseDouble(s);
            d = d * 0.035274; 
            s = decFormat.format(d);
            ounceText.setText(s);
        });

        ounceToGramButton.setOnAction( e -> {
            String s = new String(ounceText.getText());
            double d = Double.parseDouble(s);
            d = d / 0.035274;
            s = decFormat.format(d);
            gramText.setText(s);
        });


        // New scene 
        Scene scene = new Scene(root);

        // Adds new scene to stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Metric Converter");
        primaryStage.setWidth(500);
        primaryStage.setHeight(250); 
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
