package exxo.app.cli.terminal;

import java.io.Reader;
import java.io.Writer;

public class StandardTerminal extends Terminal {
    
    private StandardTerminal(Reader reader, Writer writer) {
        super(reader, writer);
    }
    
}