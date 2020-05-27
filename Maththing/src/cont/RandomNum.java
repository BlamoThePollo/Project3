package cont;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RandomNum{

    /*
    generate a random int number between 0-9
    then we want to generate a second int that is =< origional int
    then we want to make a joptionpane input box that shows the two numbers in the text box
    n1-n2=sol
    check if player's solution isn correct
    if player solution = true solution (n1-n1)
        say correct and ++1 the number oc correct solutions
    else
        say sucks to suck
    */
            // grayed out equations are for addition method this method shwos how to make a
            // a substraction method  and a loop


            static int correct = 0;
            static JFrame parent = new JFrame();

            // loops for player set amount
            // string from joption pane for num question
            // parse the string into an int
            // for loop to that int
            static int length=-1;

            public static void main(String[] a) {
                while(length==-1)
        {
            String lon = JOptionPane.showInputDialog(null, "How many questions do you want to fail?");
            length = Integer.parseInt(CheckStr(lon));
        }


        for (int time = 1; time <= length; time++) {
            int n = (int) (Math.random() * 2);
            if (n == 1) {
                addition(time);
            } else if (n == 0) {
                subtraction(time);
            }
            if(time==length)
            {
                JOptionPane.showMessageDialog(parent, (double)correct/length*100+"% correct");
            }
        }
    }
    public static void addition(int time)
    {
        int n1 = (int)(Math.random()*10);
        int n2 = (int)(Math.random()*10);




        String result = JOptionPane.showInputDialog(null, "Question "+time+":  " + n1
                + " + " + n2+ "=");

        // makes player result an int
        int res = Integer.parseInt(CheckStr(result));


        //ckecks if question is correct
if(res== n1+n2)
    {
        JOptionPane.showMessageDialog(parent, "Dude what. How did you get it right?");
        correct++;
    }
    else
    {
        JOptionPane.showMessageDialog(parent, "Sped. Even on addition..");
    }



    }

    public static void subtraction(int time)
    {
        int n1 = (int)(Math.random()*10);

        int n2 = (int)(Math.random()*(n1+1));

        String result = JOptionPane.showInputDialog(null, "Question "+time+":  " + n1
                + " - " + n2+ "=");


        int res = Integer.parseInt(CheckStr(result));


        //ckecks if question is correct
        if(res== n1-n2)
        {
            JOptionPane.showMessageDialog(parent, "Dude what. How did you get it right?");
            correct++;
        }
        else
        {
            JOptionPane.showMessageDialog(parent, "Sped. Even on subtraction..");
        }




    }

    public static String CheckStr(String input)
    {
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            if(input.equals("exit")||input.equals("Exit")||input.equals("EXIT"))
            {
                System.exit(0);
            }
            return "-1";
        }

        return input;
    }




}
