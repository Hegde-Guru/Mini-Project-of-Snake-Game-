import javax.swing.*;

public class Frame extends JFrame {
    Frame(){
        //adding pannel to frame
        this.add (new panel());
        //naming the window
        this.setTitle("SnakeGame");
        //to make sure uniform game window size
        this.setResizable( false );
        this.setVisible(true);
        this.pack();



    }
}
