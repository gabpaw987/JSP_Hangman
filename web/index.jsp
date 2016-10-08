<%-- 
    Document   : index
    Created on : 01.11.2012, 19:23:54
    Author     : Gabriel
--%>

<%@page import="handler.HangmanTypes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- Diese beiden Zeilen erzeugen einen neuen WordListHandler und ein neues
        Word zu Benutzung in diesem File.-->
        <jsp:useBean id="wordListHandler" scope="session" class="handler.WordListHandler" />  
        <jsp:useBean id="word" scope="session" class="handler.Word" />
    <center>

        <h1>Welcome to my Hangman Game</h1>


        <%
            //Resete das Word, wenn der Reset-Button geklickt wurde
            if (request.getParameter("reset") != null) {
                if (request.getParameter("reset").equals("Reset")) {
                    word.reset();
                }
            }
            
            //Wenn noch kein Wort initialisiert ist, holt dies ein Zufaelliges
            //aus der Liste
            if (word.getWord() == null) {
                word.startUp(wordListHandler.getRandomWord());
            }

            //Ratet den Buchstaben, der im Textfeld steht
            if (request.getParameter("guess") != null && !request.getParameter("guess").equals("")) {
                word.guess(request.getParameter("guess").charAt(0));
            }
        %>

        <form name="Guessing Form" action="index.jsp">
            Guess a Letter:
            <%
                //Hierbei handelt es sich um den OK-Button und das Rate-
                //Textfeld. Sie werden disabled, wenn der Spieler gewonnen
                //oder verloren hat.
                if (word.hasWon() || word.getWrongGuesses().size() + 1 == 10) {
                    out.println("<input type=\"text\" name=\"guess\" maxlength=\"1\" disabled=\"disabled\" />");
                    out.println("<input type=\"submit\" value=\"OK\" disabled=\"disabled\" />");
                } else {
                    out.println("<input type=\"text\" name=\"guess\" maxlength=\"1\" />");
                    out.println("<input type=\"submit\" value=\"OK\" />");
                }
            %>
            <input type="submit" value="Reset" name="reset" />
        </form>         

        <%
            //Ausgabe des richtigen Wortes
            //out.println(word.getWord());
            //out.println("<br>");
            //Ausgabe der bisher richtig geratenen Buchstaben
            out.println(word.getGuessed());
            out.println("<br>");
        %>
        <br>
        Sie haben folgende falsche Buchstaben eingegeben: <% out.println(word.listWrongGuesses());%> <br>
        <br>
        <%
            //Gibt an, ob der Spieler bereits gewonnen, oder verloren hat
            if (word.hasWon()) {
                out.println("Sie haben gewonnen!");
            } else if (word.getWrongGuesses().size() + 1 == 10) {
                out.println("Sie haben verloren!");
            }
        %>
    </center>
    <%
        //Gibt den Hangman in der Form als ASCII-Art aus, die der bisherigen
        //Anzahl an falsch geratenen Buchstaben entspricht, aus.
        String hangman;
        switch (word.getWrongGuesses().size() + 1) {
            case 1:
                hangman = HangmanTypes.ROUND1.toString();
                break;
            case 2:
                hangman = HangmanTypes.ROUND2.toString();
                break;
            case 3:
                hangman = HangmanTypes.ROUND3.toString();
                break;
            case 4:
                hangman = HangmanTypes.ROUND4.toString();
                break;
            case 5:
                hangman = HangmanTypes.ROUND5.toString();
                break;
            case 6:
                hangman = HangmanTypes.ROUND6.toString();
                break;
            case 7:
                hangman = HangmanTypes.ROUND7.toString();
                break;
            case 8:
                hangman = HangmanTypes.ROUND8.toString();
                break;
            case 9:
                hangman = HangmanTypes.ROUND9.toString();
                break;
            case 10:
                hangman = HangmanTypes.ROUND10.toString();
                break;
            default:
                hangman = "";
                break;
        }
        out.println(hangman);
    %>
</body>
</html>

