public class Cube {
    // property
    private int side;

    public Cube(){
        side = 1;
    }
    public Cube(int i) {
        side = i;

    }

    //
    public int getSide(){
        return this.side;
    }

    public void setSide(int n){
        side = n;
        if(n < 1){
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");


        }
    }

    public int calculateSurfaceArea(){
        int area = 0;
        area = this.side * this.side * 6;
        return area;
    }

    public int calculateVolume(){
        int volume = 0;
        volume = this.side * this.side * this.side;
        return volume;
    }
}