//// Fig. 4.26: DrawLinesController.java
//// Using strokeLine to connect the corners of a canvas.
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.canvas.GraphicsContext;
//
//public class DrawLinesController_4_26 {
//    @FXML private Canvas canvas; // used to get the GraphicsContext
//
//    // when user presses Draw Lines button, draw two Lines in the Canvas
//    @FXML
//    void drawLinesButtonPressed(ActionEvent event) {
//        // get the GraphicsContext, which is used to draw on the Canvas
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//
//        // draw line from upper-left to lower-right corner
//        gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());
//
//        // draw line from upper-right to lower-left corner
//        gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());
//    }
//}