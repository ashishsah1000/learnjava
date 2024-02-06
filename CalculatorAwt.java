import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorAwt extends Frame implements ActionListener {
    // declaration
    Label pLable, rLable, tlable, silabel, alabel;
    TextField principaltf, ratetf, timetf, sitf, amounttf;
    Button clear, calulate;

    public CalculatorAwt() {
        this.setVisible(true);
        this.setTitle("Simple intereset calculator");
        this.setSize(500, 500);
        this.setLayout(null);

        // window closing
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // creating font class object
        Font f = new Font("consolas", Font.BOLD, 20);

        // creating labels
        pLable = new Label("Principal");
        pLable.setFont(f);
        pLable.setBounds(50, 50, 100, 100);
        rLable = new Label("Rate");
        rLable.setFont(f);
        rLable.setBounds(50, 100, 100, 100);
        tlable = new Label("time");
        tlable.setFont(f);
        tlable.setBounds(50, 150, 100, 100);
        silabel = new Label("simple interest");
        silabel.setFont(f);
        silabel.setBounds(50, 200, 100, 100);
        alabel = new Label("Amount");
        alabel.setBounds(50, 250, 100, 100);

        // text fields
        principaltf = new TextField("eneter principal");
        principaltf.setFont(f);
        principaltf.setBounds(200, 50, 200, 40);
        ratetf = new TextField("eneter rate");
        ratetf.setFont(f);
        ratetf.setBounds(200, 100, 200, 40);
        timetf = new TextField("eneter time");
        timetf.setFont(f);
        timetf.setBounds(200, 150, 200, 40);
        sitf = new TextField();
        sitf.setFont(f);
        sitf.setEditable((false));
        sitf.setBounds(200, 200, 200, 40);
        amounttf = new TextField();
        amounttf.setFont(f);
        amounttf.setEditable((false));
        amounttf.setBounds(200, 250, 200, 40);

        clear = new Button("clear");
        clear.setFont(f);
        clear.setBounds(300, 350, 100, 40);
        calulate = new Button("calulate");
        calulate.setFont(f);
        calulate.setBounds(300, 350, 150, 40);

        this.add(pLable);
        this.add(rLable);
        this.add(tlable);
        this.add(silabel);
        this.add(alabel);
        this.add(principaltf);
        this.add(ratetf);
        this.add(timetf);
        this.add(sitf);
        this.add(amounttf);
        this.add(clear);
        this.add(calulate);

        clear.addActionListener(this);
        calulate.addActionListener(this);
    }

    public static void main(String[] args) {
        CalculatorAwt obj = new CalculatorAwt();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button clickButton = (Button) e.getSource();
        String clickButtonLable = clickButton.getLabel();
        if (clickButtonLable.equals("Calculate")) {
            Float p, si, amount;
            int rate, time;
            p = Float.parseFloat(principaltf.getText());
            rate = Integer.parseInt(ratetf.getText());
            time = Integer.parseInt(timetf.getText());

            // calculating interest
            si = (p * rate * time) / 100;
            amount = p + si;
            sitf.setText(Float.toString(si));
            amounttf.setText(Float.toHexString(amount));
        } else {
            principaltf.setText("");
            timetf.setText("");
            ratetf.setText("");
            sitf.setText("");
            amounttf.setText("");
        }
    }
}
