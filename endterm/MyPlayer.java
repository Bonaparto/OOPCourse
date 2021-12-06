public class MyPlayer implements Player {
    
    Map map;
    Position pos;
    int size;

    public MyPlayer(){};

    public void setMap(Map map) {
        this.map = map;
        size = map.getSize();
        pos = new Position(map.X, map.Y);
    }

    public void moveRight() {
        int X = pos.getX();
        int Y = pos.getY();
        if(X + 1 < size && map.getValueAt(X + 1, Y) != '1') pos.setX(X + 1);;
    }

    public void moveLeft() {
        int X = pos.getX();
        int Y = pos.getY();
        if(X > 0 && map.getValueAt(X - 1, Y) != '1') pos.setX(X - 1);
    }

    public void moveUp() {
        int X = pos.getX();
        int Y = pos.getY();
        if(Y > 0 && map.getValueAt(X, Y - 1) != '1') pos.setY(--Y);
    }

    public void moveDown() {
        int X = pos.getX();
        int Y = pos.getY();
        if(Y + 1 < size && map.getValueAt(X, Y + 1) != '1') pos.setY(++Y);
    }

    public Position getPosition() {
        return this.pos;
    }
}