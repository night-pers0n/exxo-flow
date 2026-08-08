package exxo.app.cli.terminal;

import java.io.Reader;
import java.io.Writer;

import java.util.Objects;

class StandardTerminal extends Terminal {
    
    private StandardTerminal(Reader reader, Writer writer) {
        super(reader, writer);
    }
    
}
