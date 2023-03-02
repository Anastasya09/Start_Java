package Homeworks;

import java.io.IOException;

class L4HW_HelpClassDemo {

    public static void main(String[] args) throws IOException {

        char choice, ignore;

        L4HW_Help1 hlpobj = new L4HW_Help1();

        for(;;) {
            do {
                hlpobj.showMenu();
                choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
             } while(ignore != '\n');

            } while(!hlpobj.isValid(choice));

            if(choice == 'q') break;

            System.out.println("\n");
            hlpobj.helpOn(choice);
        }
    }
}
