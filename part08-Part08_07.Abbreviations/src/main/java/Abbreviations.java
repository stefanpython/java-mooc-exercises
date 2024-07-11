import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> map;
    
    public Abbreviations() {
        this.map = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String exlanation) {
        this.map.put(abbreviation, exlanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if(this.map.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        if(this.map.get(abbreviation) != null) {
            return this.map.get(abbreviation);
        }
        return null;
    }
}
