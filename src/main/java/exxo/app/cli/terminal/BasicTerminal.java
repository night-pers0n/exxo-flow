package exxo.app.cli.terminal;

import exxo.app.cli.Console;

import java.io.Writer;

public class BasicTerminal implements Console {
    
    private final Writer writer;
    
    protected BasicTerminal(Writer writer) {
        this.writer = writer;
    }
    
    @Override
    public void print(String text) {
    }
    
}