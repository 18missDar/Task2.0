package operations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public abstract class OperationsFactory {

    public static final Map<String, Method> commands = new HashMap<>();
    private static final Commanders com = new Commanders();


    static {

        for (Method m : com.getClass().getDeclaredMethods()) {
            if (m.isAnnotationPresent(Command.class)) {
                Command cmd = m.getAnnotation(Command.class);
                commands.put(cmd.operator(), m);
            }
        }
    }

    public static Operations getOperation(String s) throws InvocationTargetException, IllegalAccessException {
        return commands.get(s) != null ? (Operations) commands.get(s).invoke(com) : null;
    }


}
