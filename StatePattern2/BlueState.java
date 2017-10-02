import java.awt.Color;

public class BlueState extends State {
    @Override
    public Color getColor() {
        return (Color.blue);
    }
    
    public BlueState(TransitionsTable transitionsTable) {
        super(transitionsTable);
    }
}
