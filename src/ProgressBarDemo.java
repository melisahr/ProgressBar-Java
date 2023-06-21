import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBarDemo(){
        //Create JProgressBar
        bar.setValue(0);
        bar.setBounds(50,100,300,80);
        bar.setStringPainted(true);

        //Changes the message's font
        bar.setFont(new Font ("Poppins", Font.BOLD,25));
        //Change fill color
        bar.setForeground(Color.BLUE);
        //Change the background
        bar.setBackground(Color.black);

        //add the bar to frame
        frame.add(bar);

        //create frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        //Calling the method
        fill();
    }

    public void fill(){
      int counter = 0;
      //the counter is less than or equal to 100
      while(counter <=100){
        //set the bar to whatever the counter is
          bar.setValue(counter);
          //generates the progress bar to increase
          try {
              Thread.sleep(50);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          //counter equals counter plus one
            counter+=1;
      }
      bar.setString("Done!");
    }
}
