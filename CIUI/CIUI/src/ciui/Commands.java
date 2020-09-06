package ciui;


public enum Commands {
    ALL("-all");
    
    private String command;
    
    Commands(String command) {
        this.command = command;
    }
    
    public String getCommand() {
        return command;
    }
}
