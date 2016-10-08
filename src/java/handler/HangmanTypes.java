package handler;

/**
 * Enum, der das Aussehen des Handmans zu unterschiedlichen Zeiten als 
 * String in ASCII-Art speichert.
 * 
 * @author Gabriel Pawlowsky
 * @version 1.0
 */
public enum HangmanTypes {

    /**
     * Die Aussehen der Hangmans nach unterschiedlich vielen falsch geratenen
     * Buchstaben. Dies wird in ASCII-Art als String gespeichert.
     */
    ROUND10("<FONT FACE= \\\"Courier New\\\">"
    + "________ <br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;/|\\<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
    + "|\\&nbsp;&nbsp;&nbsp;/&nbsp;\\<br>"
    + "|_\\_______<br>"
    + "</FONT>"),
    ROUND9("<FONT FACE= \\\"Courier New\\\">"
    + "________ <br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;/|\\<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
    + "|\\&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;<br>"
    + "|_\\_______<br>"
    + "</FONT>"),
    ROUND8("<FONT FACE= \\\"Courier New\\\">"
    + "________ <br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;/|\\<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
    + "|\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|_\\_______<br>"
    + "</FONT>"),
    ROUND7("<FONT FACE= \\\"Courier New\\\">"
    + "________ <br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;/|&nbsp;<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
    + "|\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|_\\_______<br>"
    + "</FONT>"),
    ROUND6("<FONT FACE= \\\"Courier New\\\">"
    + "________ <br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
    + "|\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|_\\_______<br>"
    + "</FONT>"),
    ROUND5("<FONT FACE= \\\"Courier New\\\">"
    + "________ <br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|_\\_______<br>"
    + "</FONT>"),
    ROUND4("<FONT FACE= \\\"Courier New\\\">"
    + "________ <br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|_\\_______<br>"
    + "</FONT>"),
    ROUND3("<FONT FACE= \\\"Courier New\\\">"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|_\\_______<br>"
    + "</FONT>"),
    ROUND2("<FONT FACE= \\\"Courier New\\\">"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "|_\\_______<br>"
    + "</FONT>"),
    ROUND1("<FONT FACE= \\\"Courier New\\\">"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>"
    + "</FONT>");

    /**
     * Der Text.
     * 
     * @param text
     */
    private HangmanTypes(final String text) {
        this.text = text;
    }
    private final String text;

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
