package Test;


import handler.Word;
import handler.WordListHandler;

/**
 * Diese Klasse testet die Klasse Word.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class WordTest {
    
    private Word word;
    
    public WordTest() {
        word = new Word();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Startet das Word und raet einen richtigen und einen falschen Buchstaben.
     */
    @Before
    public void setUp() {
        word.startUp("word");
        word.guess('x');
        word.guess('w');
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Testet, ob der falsch geratene Buchstabe aufscheint.
     */
    @Test
    public void testListWrongGuesses() {
        assertEquals(word.listWrongGuesses(), "x");
    }
    
    /**
     * Testet, ob man das Wort auch neu starten kann und dann das neue Wort
     * im Objekt hinterlegt ist.
     */
    @Test
    public void testStartUp() {
        word.startUp("word2");
        assertArrayEquals(word.getWord(), "word2".toCharArray());
    }
    
    /**
     * Testet, ob man das Wort erfolgreich zuruecksetzen kann.
     */
    @Test
    public void testReset() {
        word.reset();
        assertEquals(word.getWord(), null);
    }
}
