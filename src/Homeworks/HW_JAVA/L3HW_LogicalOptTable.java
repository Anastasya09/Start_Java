package Homeworks.HW_JAVA;

public class L3HW_LogicalOptTable {

    public static void main(String[] args) {

        System.out.println("Example table.");

        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));


        System.out.println();
        System.out.println("Homework table.");

        boolean P, Q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        P = true;
        Q = true;

        System.out.print((P?1:0) + "\t" + (Q?1:0) + "\t");
        System.out.print((P&Q?1:0) + "\t" + (P|Q?1:0) + "\t");
        System.out.println((P^Q?1:0) + "\t" + (!P?1:0));

        P = true;
        Q = false;

        System.out.print((P?1:0) + "\t" + (Q?1:0) + "\t");
        System.out.print((P&Q?1:0) + "\t" + (P|Q?1:0) + "\t");
        System.out.println((P^Q?1:0) + "\t" + (!P?1:0));

        P = false;
        Q = true;

        System.out.print((P?1:0) + "\t" + (Q?1:0) + "\t");
        System.out.print((P&Q?1:0) + "\t" + (P|Q?1:0) + "\t");
        System.out.println((P^Q?1:0) + "\t" + (!P?1:0));

        P = false;
        Q = false;

        System.out.print((P?1:0) + "\t" + (Q?1:0) + "\t");
        System.out.print((P&Q?1:0) + "\t" + (P|Q?1:0) + "\t");
        System.out.println((P^Q?1:0) + "\t" + (!P?1:0));

    }
}
