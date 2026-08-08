package exxo.app.workflow;

import java.util.Scanner;

public class CreateWorkspace {
    
    private final Scanner reader;
    
    private CreateWorkspace() {
        this.reader = new Scanner(System.in);
    }
    
    public static CreateWorkspace start() {
        return new CreateWorkspace();
    }
    
}