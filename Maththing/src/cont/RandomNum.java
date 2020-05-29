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
        wrong
    */
            // grayed out equations are for addition method this method shwos how to make a
            // a substraction method  and a loop


            //INSTANCE VARIABLES
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
            //The first window that opens up
            //Input window that the user types in how many questions they want to answer
            String lon = JOptionPane.showInputDialog(null, "How many questions do you want to fail?");
            length = Integer.parseInt(CheckStr(lon));
        }

        //For timed mode, ends the game when the time is over
        //When the time ends it shows you what percent you got correct
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
    //Addition method that gets two random numbers from 1-9
    public static void addition(int time)
    {
        int n1 = (int)(Math.random()*10);
        int n2 = (int)(Math.random()*10);



        //Records the players input
        String result = JOptionPane.showInputDialog(null, "Question "+time+":  " + n1
                + " + " + n2+ "=");

        // makes player result an int
        int res = Integer.parseInt(CheckStr(result));


        //Checks if the players imput is correct, if it is adds the amnt correct with a correlating message
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
    //Subtraction method that does the exact same thing as the addition method
    //But instead of checking via adding two ints it subtracts them
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
    //A try catch method that closes the game when the user types exit
    //If they type something else it will return -1 instead of whatever they put in attempt that would normally crash the game
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
