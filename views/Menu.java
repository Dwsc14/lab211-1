package views;

import java.util.ArrayList;
import java.util.Scanner;
import Controller.*;

public abstract class Menu {
    protected String tiltle;
    protected ArrayList<String> mChoice;
    protected int olen, tlen;

    public Menu() {
    }

    public Menu(String tiltle, String[] mChoice) {
        this.tiltle = tiltle;
        this.mChoice = new ArrayList<>();
        for (String st : mChoice) {
            this.mChoice.add((String) st);
        }
        this.olen = utils.findLargestLenght(mChoice);
        this.tlen = tiltle.length();
    }

    public void display() {
        System.out.println(" " + "-".repeat(olen + 8));
        System.out
                .println("|" + " ".repeat((olen + 8 - tlen) / 2) + tiltle + " ".repeat((olen + 8 - tlen) / 2) + " |");

        System.out.println(" " + "-".repeat(olen + 8));
        for (int i = 0; i < mChoice.size(); i++) {
            System.out
                    .println("|   " + (i + 1) + ". " + mChoice.get(i) + " ".repeat(olen - mChoice.get(i).length() + 2)
                            + "|");
        }
        System.out.println(" " + "-".repeat(olen + 8));
    }

    public int getChoice() {
        display();
        return utils.inputInt("Enter your choice: ", 1, mChoice.size(), false);
    }

    public abstract void excute(int n, int olen);

    public void run() {
        while (true) {
            int n = getChoice();
            excute(n, this.olen);
            if (n >= mChoice.size())
                break;
        }
    }
}
