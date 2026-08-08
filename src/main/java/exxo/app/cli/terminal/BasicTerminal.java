package exxo.app.cli.terminal;

import exxo.app.cli.Console;

import java.io.Writer;
import java.io.PrintWriter;

import java.util.Objects;

public class BasicTerminal implements Console {
    
    private final Writer writer;
    
    protected BasicTerminal(Writer writer) {
        this.writer = writer;
    }
    
    public static BasicTerminal of(Writer writer) {
        return new BasicTerminal(Objects.requireNonNull(writer));
    }
    
    @Override
    public void print(String text) {
    }
    
}
