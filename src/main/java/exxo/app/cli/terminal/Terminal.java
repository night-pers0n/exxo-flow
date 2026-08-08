package exxo.app.cli.terminal;

import exxo.app.cli.Console;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public abstract class Terminal implements Console {
    
    private final Reader reader;
    
    private final Writer writer;
    
    protected Terminal(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    public static Terminal standard() {
        return (Terminal) (new StandardTerminal());
    }
    
    @Override
    public void print(String text) throws IOException {
        this.writer.write(text);
        this.writer.flush();
    }
    
}
