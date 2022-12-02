import java.util.HashMap;

public class Frame {
    private HashMap<String, Object> localVariable;
    private Frame calledBy = null;


    public Frame(String name) {
        this.localVariable = new HashMap<>();
        localVariable.put("funcName", name);
    }

    public Frame(String name, Frame calledBy) {
        this.localVariable = new HashMap<>();
        localVariable.put("funcName", name);
        this.calledBy = calledBy;
    }

    public String getFuncName() {
        return (String) localVariable.get("funcName");
    }

    public void addVariable(String name, Object value) {
        localVariable.put(name, value);
    }

    public Object getVariable(String name) {
        return localVariable.get(name);
    }

    public void reassignVariable(String name, Object value) {
        localVariable.replace(name,value);
    }
}
