package handler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Diese Klasse handlet die Woerter, die im Endeffekt vom Hangman-Spieler
 * erraten werden sollen. Es liest ein File oder einen String mit Woertern
 * ein und kann dann ein zufaelliges Wort herausgeben.
 * 
 * @author Gabriel Pawlowsky
 * @version 1.0
 */
public class WordListHandler {

    private ArrayList<String> wordList;

    /**
     * Konstruktor, der die Wortliste initialisiert und entweder ein File mit
     * Woertern oder eine String mit Woertern einliest.
     */
    public WordListHandler() {
        wordList = new ArrayList<String>();
        //Einlesen der Woerter ueber eine Datei
        /*BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Gabriel/Documents/Schule/APR/Java/NetbeansWorkspace/Hangman/wordlist.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                wordList.add(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(WordListHandler.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(WordListHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        //Einlesen der Woerter ueber einen String
        String words = "abbey abruptly affix askew axiom azure bagpipes bandwagon banjo bayou bikini blitz bookworm boxcar boxful buckaroo buffalo buffoon cobweb daiquiri disavow duplex"
                + " dwarves equip exodus fishhook fixable foxglove galaxy galvanize gazebo gizmo glowworm guffaw haiku haphazard hyphen icebox injury ivory ivy jaundice jawbreaker jaywalk"
                + " jazzy jigsaw jiujitsu jockey jovial joyful juicy jumbo kazoo keyhole khaki kilobyte kiosk kiwifruit knapsack luxury marquis megahertz microwave mystify"
                + " nightclub nowadays numbskull ovary oxidize oxygen pajama peekaboo pixel pizazz pneumonia polka quartz quiz quorum razzmatazz rhubarb rickshaw schizophrenia sphinx"
                + " spritz squawk subway swivel topaz unknown unworthy unzip uptown vaporize vixen vodka vortex walkway waltz wavy waxy wheezy whiskey whomever wimpy wizard woozy xylophone"
                + " yachtsman yippee youthful zephyr zigzag zilch zodiac zombie";
         String[] wordsArray = words.split(" ");
         for(String word : wordsArray){
            wordList.add(word);
         }
    }

    /**
     * Methode, die ein zufaelliges Wort aus der Liste der eingelesenen 
     * zurueckgibt.
     * 
     * @return das zufaellige Wort
     */
    public String getRandomWord() {
        int random = (int) (Math.random() * this.wordList.size());
        return this.wordList.get(random);
    }

    /**
     * @return the wordList
     */
    public ArrayList<String> getWordList() {
        return wordList;
    }

    /**
     * @param wordList the wordList to set
     */
    public void setWordList(ArrayList<String> wordList) {
        this.wordList = wordList;
    }
}
