import java.awt.Color;

public class RedState extends State {
    @Override
    public Color getColor() {
        return (Color.red);
    }
    
    public RedState(TransitionsTable transitionsTable) {
        super(transitionsTable);
    }
}
