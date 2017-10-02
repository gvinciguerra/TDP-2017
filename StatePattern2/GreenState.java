import java.awt.Color;

public class GreenState extends State {
    @Override
    public Color getColor() {
        return (Color.green);
    }
    
    public GreenState(TransitionsTable transitionsTable) {
        super(transitionsTable);
    }
}
