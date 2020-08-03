import java.awt.*;

public class Grid {
    Cell[][] cells;
    
    public Grid() {
        cells = new Cell[20][20];
        // fill the cell aray with cells
    }

    public void paint (Graphics g) {
        //code to paint the cells
        for (int i = 0; i < cells.length; i++){
            for (int j = 0; j < cells[i].length; j++){
                g.setColor(Color.WHITE);
                g.fillRect(((i*35)+10), ((j*35)+10), 35, 35);
                g.setColor(Color.BLACK);
                g.drawRect(((i*35)+10), ((j*35)+10), 35, 35);
            }
    
        }
    }
}