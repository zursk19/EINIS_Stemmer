package stemmer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stemmerForm {

    private JPanel panelMain;
    private JButton runButton;

    public stemmerForm() {
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    appIO test = new appIO();
                    String stringPath = "C:\\Users\\dawid.zurawski\\testfile.txt";

                    StemmerText testStemmer = new StemmerText(test.getText(stringPath));
                    testStemmer.test();
                } catch (Exception exc) {
                    System.out.println(exc.toString());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Polish Language Stemmer");
        frame.setContentPane(new stemmerForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
