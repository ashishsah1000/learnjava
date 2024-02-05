import java.awt.Color;
import java.awt.Frame;

public class BasicFrameExtend extends Frame {
    public BasicFrameExtend() {
        this.setVisible(true);
        this.setSize(500, 300);
        this.setTitle("user definded frame");
        // using color object
        Color c = new Color(120, 201, 110);
        this.setBackground(c);
    }

    public static void main(String[] args) {
        BasicFrameExtend obj = new BasicFrameExtend();
    }
}
