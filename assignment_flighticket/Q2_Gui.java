
package assignment_flighticket;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Q2_Gui extends Application {

    private TextField nameTextField;
    private TextField passportTextField;
    private TextField seatTextField;
    private Label messageLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Flight Booking");

        // Create UI elements
        nameTextField = new TextField();
        passportTextField = new TextField();
        seatTextField = new TextField();
        Button submitButton = new Button("Submit");
        messageLabel = new Label();

        // Set up event handling for the Submit button
        submitButton.setOnAction(e -> bookTicket());

        // Create layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(
                new Label("Enter Passenger Details:"),
                new Label("Name:"),
                nameTextField,
                new Label("Passport No:"),
                passportTextField,
                new Label("Seat No:"),
                seatTextField,
                submitButton,
                messageLabel
        );

        // Set up the scene
        Scene scene = new Scene(layout, 300, 200);

        // Set up the stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void bookTicket() {
        String name = nameTextField.getText();
        String passportNo = passportTextField.getText();
        String seatNo = seatTextField.getText();

        // Validate input (you can add more validation logic as needed)
        if (name.isEmpty() || passportNo.isEmpty() || seatNo.isEmpty()) {
            messageLabel.setText("Please fill in all fields.");
        } else {
            // Perform ticket booking logic here (e.g., add to a linked list or process the data)
            String message = String.format("Ticket booked for %s (%s) on seat %s.", name, passportNo, seatNo);
            messageLabel.setText(message);

            // Optionally, you can clear the input fields after booking
            nameTextField.clear();
            passportTextField.clear();
            seatTextField.clear();
        }
    }
}
