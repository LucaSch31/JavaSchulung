package com.materna.candyLord;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.Symbols;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import java.io.IOException;

import static com.googlecode.lanterna.input.KeyType.Escape;

public class GUI {
    public static void createGameSurface() throws IOException    {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();

        Screen screen = new TerminalScreen(terminal);
        TextGraphics tg = screen.newTextGraphics();

        screen.startScreen();
        tg.setBackgroundColor(TextColor.ANSI.BLACK);

        tg.putString(36,2, "CandyLord", SGR.BOLD);

        tg.drawLine(new TerminalPosition(5,2), new TerminalPosition(5,13), Symbols.DOUBLE_LINE_VERTICAL);
        tg.drawLine(new TerminalPosition(74,2), new TerminalPosition(74,13), Symbols.DOUBLE_LINE_VERTICAL);
        tg.drawLine(new TerminalPosition(6,1), new TerminalPosition(73,1), Symbols.DOUBLE_LINE_HORIZONTAL);
        tg.drawLine(new TerminalPosition(6,14), new TerminalPosition(73,14), Symbols.DOUBLE_LINE_HORIZONTAL);
        tg.drawLine(new TerminalPosition(5,1), new TerminalPosition(5,1), Symbols.DOUBLE_LINE_TOP_LEFT_CORNER);
        tg.drawLine(new TerminalPosition(74,1), new TerminalPosition(74,1), Symbols.DOUBLE_LINE_TOP_RIGHT_CORNER);
        tg.drawLine(new TerminalPosition(5,14), new TerminalPosition(5,14), Symbols.DOUBLE_LINE_BOTTOM_LEFT_CORNER);
        tg.drawLine(new TerminalPosition(74,14), new TerminalPosition(74,14), Symbols.DOUBLE_LINE_BOTTOM_RIGHT_CORNER);
        tg.drawLine(new TerminalPosition(6,3), new TerminalPosition(9,3), Symbols.DOUBLE_LINE_HORIZONTAL);
        tg.drawLine(new TerminalPosition(21,3), new TerminalPosition(73,3), Symbols.DOUBLE_LINE_HORIZONTAL);
        tg.drawLine(new TerminalPosition(5,3), new TerminalPosition(5,3), Symbols.DOUBLE_LINE_T_RIGHT);
        tg.drawLine(new TerminalPosition(74,3), new TerminalPosition(74,3), Symbols.DOUBLE_LINE_T_LEFT);
        tg.drawLine(new TerminalPosition(6,5), new TerminalPosition(9,5), Symbols.DOUBLE_LINE_HORIZONTAL);
        tg.drawLine(new TerminalPosition(21,5), new TerminalPosition(24,5), Symbols.DOUBLE_LINE_HORIZONTAL);
        tg.drawLine(new TerminalPosition(26,5), new TerminalPosition(29,5), Symbols.DOUBLE_LINE_HORIZONTAL);
        tg.drawLine(new TerminalPosition(40,5), new TerminalPosition(44,5), Symbols.DOUBLE_LINE_HORIZONTAL);
        tg.drawLine(new TerminalPosition(5,5), new TerminalPosition(5,5), Symbols.DOUBLE_LINE_T_RIGHT);
        tg.drawLine(new TerminalPosition(25,5), new TerminalPosition(25,5), Symbols.DOUBLE_LINE_T_DOWN);
        tg.drawLine(new TerminalPosition(44,4), new TerminalPosition(44,13), Symbols.DOUBLE_LINE_VERTICAL);
        tg.drawLine(new TerminalPosition(44,5), new TerminalPosition(44,5), Symbols.DOUBLE_LINE_T_LEFT);
        tg.drawLine(new TerminalPosition(44,3), new TerminalPosition(44,3), Symbols.DOUBLE_LINE_T_DOWN);
        tg.drawLine(new TerminalPosition(44,14), new TerminalPosition(44,14), Symbols.DOUBLE_LINE_T_UP);
        tg.drawLine(new TerminalPosition(25,6), new TerminalPosition(25,13), Symbols.DOUBLE_LINE_VERTICAL);
        tg.drawLine(new TerminalPosition(25,14), new TerminalPosition(25,14), Symbols.DOUBLE_LINE_T_UP);

        tg.setForegroundColor(TextColor.ANSI.RED);
        tg.putString(new TerminalPosition(29,5),"Street Prices");

        tg.setForegroundColor(TextColor.ANSI.RED);
        tg.setForegroundColor(TextColor.ANSI.YELLOW);
        tg.putString(new TerminalPosition(9,5), "Sweets on Hand");

        tg.setForegroundColor(TextColor.ANSI.BLUE);
        tg.putString(new TerminalPosition(9,3), "Date:");

        tg.setForegroundColor(TextColor.ANSI.WHITE);
        tg.putString(new TerminalPosition(7,6),"eating paper");
        tg.putString(new TerminalPosition(7,7),"chocalate");
        tg.putString(new TerminalPosition(7,8),"sour gum");
        tg.putString(new TerminalPosition(7,9),"sour patches");
        tg.putString(new TerminalPosition(7,10),"haribo");
        tg.putString(new TerminalPosition(7,11),"giotto");
        tg.putString(new TerminalPosition(7,12),"rafaelo");
        tg.putString(new TerminalPosition(7,13),"toblerone");

        tg.putString(new TerminalPosition(27,6),"eating paper");
        tg.putString(new TerminalPosition(27,7),"chocalate");
        tg.putString(new TerminalPosition(27,8),"sour gum");
        tg.putString(new TerminalPosition(27,9),"sour patches");
        tg.putString(new TerminalPosition(27,10),"haribo");
        tg.putString(new TerminalPosition(27,11),"giotto");
        tg.putString(new TerminalPosition(27,12),"rafaelo");
        tg.putString(new TerminalPosition(27,13),"toblerone");

        tg.setForegroundColor(TextColor.ANSI.GREEN);

        tg.putString(new TerminalPosition(46,4), "Location:");
        tg.putString(new TerminalPosition(50,5), "Hold:");
        tg.putString(new TerminalPosition(50,7), "Cash:");
        tg.putString(new TerminalPosition(47,8), "In Bank:");
        tg.putString(new TerminalPosition(47,9), "In Debt:");
        tg.putString(new TerminalPosition(65,5), "(10 max)", SGR.BOLD);

        tg.putString(new TerminalPosition(14,18), "( )uy Candy", SGR.BOLD);
        tg.putString(new TerminalPosition(14,19), "( )ell Candy", SGR.BOLD);
        tg.putString(new TerminalPosition(14,20), "( )et to another city", SGR.BOLD);
        tg.putString(new TerminalPosition(46,18), "( )isit bank", SGR.BOLD);
        tg.putString(new TerminalPosition(46,19), "See ( )oan Shark", SGR.BOLD);
        tg.putString(new TerminalPosition(46,20), "( )uit game", SGR.BOLD);

        tg.setForegroundColor(TextColor.ANSI.RED);

        tg.putString(new TerminalPosition(15,18), "B", SGR.BOLD);
        tg.putString(new TerminalPosition(15,19), "S", SGR.BOLD);
        tg.putString(new TerminalPosition(15,20), "J", SGR.BOLD);
        tg.putString(new TerminalPosition(47,18), "V", SGR.BOLD);
        tg.putString(new TerminalPosition(51,19), "L", SGR.BOLD);
        tg.putString(new TerminalPosition(47,20), "Q", SGR.BOLD);

        screen.refresh();
    }
}
