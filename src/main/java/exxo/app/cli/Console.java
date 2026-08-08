package exxo.app.cli;

import java.io.IOException;

public interface Console {
    
    String readLine();
    
    void print(String text) throws IOException;
    
}