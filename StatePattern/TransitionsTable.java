import java.util.*;

public class TransitionsTable {
    private State states[] = {new RedState(), new BlueState(),  new GreenState(), new BlackState()};
    private Map<State, List<State>> transitions = new HashMap<>(); // state -> [state-on-push, state-on-pull]
    
    public TransitionsTable() {
        State pushTransitions[] = {states[1], states[2], states[3], states[0]};
        State pullTransitions[] = {states[2], states[0], states[1], states[2]};
        for (int i = 0; i < states.length; i++)
            transitions.put(states[i], Arrays.asList(pushTransitions[i], pullTransitions[i]));
    }
    
    public State nextStateOnPush(State state) {
        return transitions.get(state).get(0);
    }

    public State nextStateOnPull(State state) {
        return transitions.get(state).get(1);
    }
    
    public State[] getStates() {
        return states;
    }
}
