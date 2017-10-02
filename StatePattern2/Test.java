public class Test {
    public static void main(String[] args) {
        TransitionsTable transitionsTable = new TransitionsTable();
        Context c = new Context(transitionsTable.getStates()[0]);
        c.push();
        assert c.getState() == transitionsTable.getStates()[1];
        c.push();
        assert c.getState() == transitionsTable.getStates()[2];
        c.push();
        assert c.getState() == transitionsTable.getStates()[3];
        c.push();
        assert c.getState() == transitionsTable.getStates()[0];
        c.pull();
        assert c.getState() == transitionsTable.getStates()[2];
        c.pull();
        assert c.getState() == transitionsTable.getStates()[1];
        c.pull();
        assert c.getState() == transitionsTable.getStates()[0];
    }
}
