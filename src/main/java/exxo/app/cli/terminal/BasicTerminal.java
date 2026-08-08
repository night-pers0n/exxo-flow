package exxo.app.cli.terminal;

import exxo.app.cli.Console;

import java.io.Reader;
import java.io.PrintWriter;
import java.io.Writer;

import java.util.Objects;

public class BasicTerminal implements Console {
    
    private final Reader reader;
    
    private final Writer writer;
    
    protected BasicTerminal(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    protected BasicTerminal(Reader reader) {
        this(reader, new PrintWriter(System.out));
    }
    
    public static BasicTerminal of(Reader reader, Writer writer) {
        return new BasicTerminal(
            Objects.requireNonNull(reader), 
            Objects.requireNonNull(writer)
        );
    }
    
    public static BasicTerminal standard() {
        return of(new PrintWriter(System.out));
    }
    
    @Override
    public void print(String text) {
    }
    
}
