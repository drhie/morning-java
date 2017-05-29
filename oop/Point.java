public class Point {
  private int x = 0;
  private int y = 0;

  public Point() {
    this.x = x;
    this.y = y;
  }
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }
  public int getY() {
    return this.y;
  }
  public int[] getXY() {
    int[] results = new int[2];
    results[0] = this.x;
    results[1] = this.y;
    return results;
  }

  public void setX(int x) {
    this.x = x;
  }
  public void setY(int y) {
    this.y = y;
  }
  public void setXY(int x, int y) {
    this.setX(x);
    this.setY(y);
  }

  //overloaded method
  public double distance(int x, int y) {
    int xDiff = this.x - x;
    int yDiff = this.y - y;
    return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
  }

  public double distance(Point another) {
    int xDiff = this.x - another.x;
    int yDiff = this.y - another.y;
    return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
  }

  public double distance() {
    return Math.sqrt(this.x*this.x + this.y*this.y);
  }

  public String toString() {
    return String.format("%d, %d", x, y);
  }
}
