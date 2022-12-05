import java.util.Collection;
import java.util.HashMap;

public class localFunction {

    private int noOfArguments;
    private HashMap<String, Type> localVariable;

    public localFunction(String name, Type type, int noOfArguments) {
        this.localVariable = new HashMap<>();
        localVariable.put(name, type);
        this.noOfArguments = noOfArguments;
    }

    public Type getType(String name) {
        return localVariable.get(name);
    }

    public boolean contains(String name) {
        return localVariable.containsKey(name);
    }

    public void addVariable(String name, Type type) {
        localVariable.put(name, type);
    }

   public int getNoOfArguments() {
        return noOfArguments;
   }

   public Collection<Type> getLocalVariableTypes() {
        return localVariable.values();
   }
}
