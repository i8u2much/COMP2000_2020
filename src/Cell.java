import java.awt.*;

public class Cell {
    int x;
    int y;

    public Cell(int x, int y) {
        x = this.x;
        y = this.y;
    }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(((x*35)+10), ((y*35)+10), 35, 35);
        g.setColor(Color.BLACK);
        g.drawRect(((x*35)+10), ((y*35)+10), 35, 35);
        }
}
