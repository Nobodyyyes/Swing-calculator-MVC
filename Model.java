public class Model {
    private Viewer viewer;
    private String temp;
    private String leftValue;
    private String rightValue;
    private String clear;
    private char actionValue;
    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
        leftValue = "";
        rightValue = "";
        actionValue = '@';
        clear = "";
        RPN rpn = new RPN(this);
    }
    public void doAction(String command) {
        System.out.println(command);

        if (command.equals("one")) {
            System.out.println("1");
            temp = temp + 1;
        } else if (command.equals("two")) {
            System.out.println("2");
            temp = temp + 2;
        } else if (command.equals("three")) {
            System.out.println("3");
            temp = temp + 3;
        } else if (command.equals("four")) {
            System.out.println("4");
            temp = temp + 4;
        } else if (command.equals("five")) {
            System.out.println("5");
            temp = temp + 5;
        } else if (command.equals("six")) {
            System.out.println("6");
            temp = temp + 6;
        } else if (command.equals("seven")) {
            System.out.println("7");
            temp = temp + 7;
        } else if (command.equals("eight")) {
            System.out.println("8");
            temp = temp + 8;
        } else if (command.equals("nine")) {
            System.out.println("9");
            temp = temp + 9;
        } else if (command.equals("zero")) {
            System.out.println("0");
            temp = temp + 0;
        } else if (command.equals("clear")) {
            temp = clear;
        } else if (command.equals("plus")) {
            System.out.println("+");
            leftValue = temp;
            actionValue = '+';
            temp = "";
            return;
        } else if (command.equals("minus")) {
            leftValue = temp;
            actionValue = '-';
            temp = "";
            return;
        } else if (command.equals("multiplication")) {
            leftValue = temp;
            actionValue = '*';
            temp = "";
            return;
        } else if (command.equals("division")) {
            leftValue = temp;
            actionValue = '/';
            temp = "";
            return;
        } else if (command.equals("equals")) {
            rightValue = temp;
            temp = leftValue + " " + actionValue + " " + rightValue;

            double leftValueDouble = Double.parseDouble(leftValue);
            double rightValueDouble = Double.parseDouble(rightValue);
            double answer = 0.0F;

            switch (actionValue) {
                case '+':
                    answer = leftValueDouble + rightValueDouble;
                    break;
                case '-':
                    answer = leftValueDouble - rightValueDouble;
                    break;
                case '*':
                    answer = leftValueDouble * rightValueDouble;
                    break;
                case '/':
                    answer = leftValueDouble / rightValueDouble;
                    break;
                default:
            }
            temp = "" + answer;
        }

            System.out.println("temp" + temp);
            viewer.update(temp);
    }
}
