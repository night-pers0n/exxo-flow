
package exxo.app.cli.terminal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class StandardTerminal extends Terminal {
    
    StandardTerminal() {
        super(
            new BufferedReader(new InputStreamReader(System.in)), 
            new PrintWriter(System.out)
        );
    }
    
}
