import java.awt.Frame;

// using association method by creating object 
public class BasicFrame {

    public BasicFrame(String t) {
        Frame fm = new Frame(t);
        fm.setVisible(true);
        fm.setSize(300, 500);
    }

    public static void main(String[] args) {
        BasicFrame obj = new BasicFrame("Basic Frame");
    }
}