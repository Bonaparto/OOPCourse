public class Position {
    
    protected int X;
    protected int Y;

    public Position(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    
    public int getX() {
        return X;
    }
    
    public int getY() {
        return Y;
    }

    public boolean equals(Position p) {
        return p.X == this.X && p.Y == this.Y;
    }

    public String toString() {
        return "(" + X + "," + Y + ")";
    }

}