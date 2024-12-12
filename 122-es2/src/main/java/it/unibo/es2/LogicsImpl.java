//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

public class LogicsImpl implements Logics{
    final Map<Pair<Integer, Integer>, String> buttons;

    public LogicsImpl(int size) {
        buttons = new HashMap<>(size);
    }

    @Override
    public String hit(Pair<Integer, Integer> buttonPosition) {
        return "aa";
    }

    @Override
    public boolean toQuit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toQuit'");
    }

}
