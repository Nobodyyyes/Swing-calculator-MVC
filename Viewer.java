import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Viewer {
    private JTextField textField;
    public Viewer() {
        Controller controller = new Controller(this);

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(15, 300, 60, 60);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("one");

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(80, 300, 60, 60);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("two");

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(145, 300, 60, 60);
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("three");

        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(15, 235, 60, 60);
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("four");

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(80, 235, 60, 60);
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("five");

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(145, 235, 60, 60);
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("six");

        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(15, 170, 60, 60);
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("seven");

        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(80, 170, 60, 60);
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("eight");

        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(145, 170, 60, 60);
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("nine");

        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(15, 105, 60, 60);
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("zero");

        JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(210, 300, 60, 60);
        buttonEquals.addActionListener(controller);
        buttonEquals.setActionCommand("equals");

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(210, 235, 60, 60);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("plus");

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(210, 170, 60, 60);
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("minus");

        JButton buttonMul = new JButton("*");
        buttonMul.setBounds(80, 105, 60, 60);
        buttonMul.addActionListener(controller);
        buttonMul.setActionCommand("multiplication");

        JButton buttonDiv = new JButton("/");
        buttonDiv.setBounds(145, 105, 60, 60);
        buttonDiv.addActionListener(controller);
        buttonDiv.setActionCommand("division");

        JButton buttonClear = new JButton("C");
        buttonClear.setBounds(210, 105, 60, 60);
        buttonClear.addActionListener(controller);
        buttonClear.setActionCommand("clear");

        textField = new JTextField();
        textField.setBounds(20, 55, 245, 40);
        
        JFrame frame = new JFrame("Calculator");
        frame.setSize(285, 400);
        frame.setLocation(300, 450);
        frame.setLayout(null);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonFour);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonSeven);
        frame.add(buttonEight);
        frame.add(buttonNine);
        frame.add(buttonEquals);
        frame.add(buttonPlus);
        frame.add(buttonMinus);
        frame.add(buttonZero);
        frame.add(buttonMul);
        frame.add(buttonDiv);
        frame.add(buttonClear);
        frame.add(textField);
        frame.setVisible(true);
    }
    public void update(String result) {
        textField.setText(result);
    }
}
