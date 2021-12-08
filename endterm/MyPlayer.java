public class MyPlayer implements Player {
    
    Map map;
    Position pos;

    public MyPlayer(){};

    public void setMap(Map map) {
        this.map = map;
        this.pos = new Position(map.X, map.Y);
    }

    public void moveRight() {
        int size = map.getSize();
        int X = pos.getX();
        int Y = pos.getY();
        if(X + 1 < size && Y >= 0 && Y < size && map.getValueAt(X + 1, Y) != '1') pos.setX(X + 1);;
    }

    public void moveLeft() {
        int size = map.getSize();
        int X = pos.getX();
        int Y = pos.getY();
        if(X > 0 && Y >= 0 && Y < size){
            if( map.getValueAt(X - 1, Y) != '1')
            pos.setX(X - 1);
        } 
    }

    public void moveUp() {
        int size = map.getSize();
        int X = pos.getX();
        int Y = pos.getY();
        if(Y > 0 && X >= 0 && X < size){
            if(map.getValueAt(X, Y - 1) != '1')
            pos.setY(--Y);
        }
    }

    public void moveDown() {
        int size = map.getSize();
        int X = pos.getX();
        int Y = pos.getY();
        if(Y + 1 < size && X >= 0 && X < size && map.getValueAt(X, Y + 1) != '1') pos.setY(++Y);
    }

    public Position getPosition() {
        return this.pos;
    }
}