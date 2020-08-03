import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        //window.run
    }

    public class Canvas extends JPanel{
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }
        Grid grid = new Grid();
        @Override
        public void paint(Graphics g){
            grid.paint(g);
            //if(getMousePosition() != null){
           //     public void Cell(getMousePosition().getX(), getMousePosition().getY());
           // }
        }
    }

    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run(){
        while(true){
            this.repaint();
        }
    }
}