package me.DDoS.MCCasino.permission;

/**
 *
 * @author DDoS
 */
public enum Permission {
    
    USE("mccasino.use"), 
    SETUP("mccasino.setup");

    private final String permString;

    private Permission(String name) {
        
        this.permString = name;
    
    }

    public String getNodeString() {
    
        return permString;
    
    }
}
