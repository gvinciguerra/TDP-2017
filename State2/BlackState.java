import java.awt.Color;

public class BlackState extends State {
    @Override
    public Color getColor() {
        return (Color.black);
    }
    
    public BlackState(TransitionsTable transitionsTable) {
        super(transitionsTable);
    }
}
