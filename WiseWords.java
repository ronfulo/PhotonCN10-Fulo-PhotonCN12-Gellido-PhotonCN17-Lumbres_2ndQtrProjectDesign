/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2aa;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Jhoenica C. Gellido
 */


public class WiseWords {
    protected ArrayList<String> burnOut;
    protected ArrayList<String> unsatisfied;
    protected ArrayList<String> failedAssessment;
    
    public WiseWords() {
        burnOut = new ArrayList<> ();
        unsatisfied = new ArrayList<> ();
        failedAssessment = new ArrayList<> ();
        addSetQuotes();
    }
    
    public void addSetQuotes() {
        burnOut.add("Get some sleep");
        burnOut.add("Don’t burn the midnight oil");
        burnOut.add("Take a break");

        unsatisfied.add("Better luck next time");
        unsatisfied.add("Move forward");
        unsatisfied.add("No one is perfect");

        failedAssessment.add("One assessment won’t be the end of you");
        failedAssessment.add("Bawi next life");
        failedAssessment.add("Move on");
    }
    public void motivate(String category) {
        ArrayList<String> quotes = getQuotesForCateg(category);
        if (quotes != null && !quotes.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(quotes.size());
            String randomQuote = quotes.get(randomIndex);
            System.out.println(randomQuote);
        } else {
            System.out.println("No quotes available for category");
        }
    }
    
    private ArrayList<String> getQuotesForCateg(String c) {
        switch (c) {
            case "burnOut":
                return burnOut;
            case "unsatisfied":
                return unsatisfied;
            case "failedAssessment":
                return failedAssessment;
            default:
                return null;
        }
    }

    public void addWisdom(String category, String quote) {
        ArrayList<String> quotes = getQuotesForCateg(category);

        if (quotes != null) {
            quotes.add(quote);
            System.out.println("Quote added to wall");
        } else {
            System.out.println("Invalid category.");
        }
    }
}
