/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Klasse, die das Wort, dass vom Hangman-Spieler erraten werden soll,
 * verwaltet. Sie dient gleichzeitig als Hauptklasse, die das Spiel verwaltet
 * und speichert, wenn der Spieler das Spiel gewonnen hat.
 * 
 * @author Gabriel
 */
public class Word {

    //Das zu erratende Wort
    private char[] word;
    //Die Buchstaben des Wortes, die bereits erraten wurden
    private char[] guessed;
    //Liste der falsch geratenen Buchstaben
    private ArrayList<Character> wrongGuesses;
    //Gibt an, ob der Spieler bereits gewonnen hat
    private boolean won;

    /**
     * Da bei der Erstellung eines Beans in einem JSP-File kein spezieller
     * Konstruktor ausgefuerht werden kann, startet diese Methode das Wort
     * und damit das Spiel und sollte immer zu Beginn ausgefuehrt werden.
     * 
     * @param word das erraten werden soll
     */
    public void startUp(String word) {
        setWrongGuesses(new ArrayList<Character>());
        this.word = word.toCharArray();
        this.guessed = new char[this.word.length];
        for (int i = 0; i < guessed.length; i++) {
            guessed[i] = '-';
        }
    }

    /**
     * Raet den uebergebenen Buchstaben c und erfasst ob er richtig oder falsch
     * ist und wird dementsprechend in die Listen eingatragen. Wenn der
     * Buchstabe richtig ist und das Wort vervollstaendigt, wird ebenfalls
     * vermerkt, dass der Spieler gewonnen hat.
     * 
     * @param c Buchstabe der geraten wird
     */
    public void guess(char c) {
        boolean rightOnce = false;
        if (!this.hasWon()) {
            //Wenn der Buchstabe richtig war wird er im geratenen Wort eingesetzt
            for (int i = 0; i < this.word.length; i++) {
                if (this.word[i] == c) {
                    this.guessed[i] = c;
                    rightOnce = true;
                }
            }
            //Wenn der Buchstabe falsch war
            if (!rightOnce) {
                if(!this.wrongGuesses.contains(c))
                    this.wrongGuesses.add(c);
            }
            //Wenn der Benutzer gewonnen hat, wird dies vermerkt.
            if (Arrays.equals(this.guessed, this.word)) {
                this.setWon(true);
            }
        }

    }

    /**
     * Diese Methode setzt das Spiel zurueck und macht ein Neustarten des
     * Spiels moeglich. Dies wird bei einem Klick auf den Reset-Button
     * aufgerufen.
     */
    public void reset() {
        this.word = null;
        this.guessed = null;
        this.won = false;
        setWrongGuesses(new ArrayList<Character>());
    }

    /**
     * @return the word
     */
    public char[] getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(char[] word) {
        this.word = word;
    }

    /**
     * @return the guessed
     */
    public char[] getGuessed() {
        return guessed;
    }

    /**
     * @param guessed the guessed to set
     */
    public void setGuessed(char[] guessed) {
        this.guessed = guessed;
    }

    /**
     * @return the won
     */
    public boolean hasWon() {
        return won;
    }

    /**
     * @param won the won to set
     */
    public void setWon(boolean won) {
        this.won = won;
    }

    /**
     * @return the wrongGuesses
     */
    public ArrayList<Character> getWrongGuesses() {
        return wrongGuesses;
    }

    /**
     * @param wrongGuesses the wrongGuesses to set
     */
    public void setWrongGuesses(ArrayList<Character> wrongGuesses) {
        this.wrongGuesses = wrongGuesses;
    }
    
    /**
     * Diese Methode gibt alle bisher falsch geratenen Buchstaben als schoen
     * formatierten String zurueck.
     * 
     * @return String mit den falsch geratenen Buchstaben
     */
    public String listWrongGuesses(){
        String list = "";
        boolean firstRound = true;
        for (char c : wrongGuesses) {
            if(!firstRound){
                list+=", ";
            }
            list+=(c);
            firstRound = false;
        }
        return list;
    }
}
