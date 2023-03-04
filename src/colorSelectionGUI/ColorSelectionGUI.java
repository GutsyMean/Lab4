package colorSelectionGUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ColorSelectionGUI extends Application
{

	public static void main(String[] args)
	{
		launch(args);
		
	}
	
	private BorderPane pane = new BorderPane();
	private RadioButton rbtSalmon = new RadioButton("Salmon");
	private RadioButton rbtSpringGreen = new RadioButton("Spring Green");
	private RadioButton rbtOrange = new RadioButton("Orange");
	private RadioButton rbtCyan = new RadioButton("Cyan");
	private ToggleGroup colorGroup = new ToggleGroup();
	private CheckBox cbNorth = new CheckBox("North");
	private CheckBox cbSouth = new CheckBox("South");
	private CheckBox cbEast = new CheckBox("East");
	private CheckBox cbWest = new CheckBox("West");
	private Label lblLocation = new Label("Locations");
	private Label lblBackground = new Label("Background Colors");
	private Label lblNorth = new Label("North");
	private Label lblSouth = new Label("South");
	private Label lblEast = new Label("East");
	private Label lblWest = new Label("West");
	
	@Override
	public void start(Stage primaryStage)
	{
		//set radiobutton toggle group
		rbtSalmon.setToggleGroup(colorGroup);
		rbtSpringGreen.setToggleGroup(colorGroup);
		rbtOrange.setToggleGroup(colorGroup);
		rbtCyan.setToggleGroup(colorGroup);
		
		//set border label default background
        lblNorth.setStyle("-fx-background-color: cyan");
        lblSouth.setStyle("-fx-background-color: cyan");
        lblEast.setStyle("-fx-background-color: cyan");
        lblWest.setStyle("-fx-background-color: cyan");
        
        //set borderpane
        pane.setTop(lblNorth);
        pane.setBottom(lblSouth);
        pane.setRight(lblEast);
        pane.setLeft(lblWest);
        
        //alignment of borderpane
        lblNorth.setAlignment(Pos.CENTER);
        lblSouth.setAlignment(Pos.CENTER);
        lblEast.setAlignment(Pos.CENTER);
        lblWest.setAlignment(Pos.CENTER);
        
        //set radiobutton color fills
        rbtSalmon.setStyle("-fx-text-fill: salmon");
        rbtSpringGreen.setStyle("-fx-text-fill: springgreen");
        rbtOrange.setStyle("-fx-text-fill: orange");
        rbtCyan.setStyle("-fx-text-fill: cyan");
        
        //set default color
        rbtCyan.setSelected(true);
        
        //set default check boxes
        cbNorth.setSelected(true);
        cbSouth.setSelected(true);
        cbEast.setSelected(true);
        cbWest.setSelected(true);
        
        //create location vbox
        VBox locations = new VBox(4);
        lblLocation.setStyle("-fx-font-weight:bold");
        locations.setPadding(new Insets(5, 5, 5, 5));
        locations.getChildren().add(lblLocation);
		locations.getChildren().add(cbNorth);
		locations.getChildren().add(cbSouth);
		locations.getChildren().add(cbEast);
		locations.getChildren().add(cbWest);
		locations.setAlignment(Pos.CENTER_LEFT);
		
        //create background selection vbox
        VBox backgroundColors = new VBox(4);
        lblBackground.setStyle("-fx-font-weight:bold");
        backgroundColors.setPadding(new Insets(5, 5, 5, 5));
        backgroundColors.getChildren().add(lblBackground);
        backgroundColors.getChildren().add(rbtSalmon);
        backgroundColors.getChildren().add(rbtSpringGreen);
        backgroundColors.getChildren().add(rbtOrange);
        backgroundColors.getChildren().add(rbtCyan);
        backgroundColors.setAlignment(Pos.CENTER_LEFT);
        
        //add vboxes to an hbox
        HBox hbox = new HBox(locations, backgroundColors);
        hbox.setPrefSize(220, 160);
        
        //set hbox location
        pane.setCenter(hbox);
        
        rbtSalmon.setOnAction(e -> {
        	if (cbNorth.isSelected())
                lblNorth.setStyle("-fx-background-color: salmon");
            if (cbSouth.isSelected())
                lblSouth.setStyle("-fx-background-color: salmon");
            if (cbEast.isSelected())
                lblEast.setStyle("-fx-background-color: salmon");
            if (cbWest.isSelected())
                lblWest.setStyle("-fx-background-color: salmon");
        });
        rbtSpringGreen.setOnAction(e -> {
        	if (cbNorth.isSelected())
                lblNorth.setStyle("-fx-background-color: springgreen");
            if (cbSouth.isSelected())
                lblSouth.setStyle("-fx-background-color: springgreen");
            if (cbEast.isSelected())
                lblEast.setStyle("-fx-background-color: springgreen");
            if (cbWest.isSelected())
                lblWest.setStyle("-fx-background-color: springgreen");
        });
        rbtOrange.setOnAction(e -> {
        	if (cbNorth.isSelected())
                lblNorth.setStyle("-fx-background-color: orange");
            if (cbSouth.isSelected())
                lblSouth.setStyle("-fx-background-color: orange");
            if (cbEast.isSelected())
                lblEast.setStyle("-fx-background-color: orange");
            if (cbWest.isSelected())
                lblWest.setStyle("-fx-background-color: orange");
        });
        rbtCyan.setOnAction(e -> {
        	if (cbNorth.isSelected())
                lblNorth.setStyle("-fx-background-color: cyan");
            if (cbSouth.isSelected())
                lblSouth.setStyle("-fx-background-color: cyan");
            if (cbEast.isSelected())
                lblEast.setStyle("-fx-background-color: cyan");
            if (cbWest.isSelected())
                lblWest.setStyle("-fx-background-color: cyan");
        });
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Color Selection");
        primaryStage.setScene(scene);
        primaryStage.show();
        
		lblNorth.setPrefSize(primaryStage.getWidth(), 40);
		lblSouth.setPrefSize(primaryStage.getWidth(), 40);
		lblEast.setPrefSize(40, primaryStage.getHeight());
		lblWest.setPrefSize(40, primaryStage.getHeight());

	}
}
