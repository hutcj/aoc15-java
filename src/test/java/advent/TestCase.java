package advent;

import java.util.HashMap;
import java.util.LinkedList;

public class TestCase {
    private LinkedList<HashMap<String,String>> testCases;

    public TestCase() {
        this.testCases = new LinkedList<HashMap<String,String>>();
    }

    public void add(String i, String o) {
        HashMap<String,String> c = new HashMap<String,String>();
        c.put("input", i);
        c.put("output", o);
        this.testCases.add(c);
    }

    public LinkedList<HashMap<String,String>> getTests(){
        return this.testCases;
    }
}