package task3;

public class HouseBuilder { //The Builder doesn’t allow other objects to access the product while it’s being built
    private int walls;   //so we modificated they like private
    private int doors;
    private int windows;
    private int roof;
    private int garage;

     public HouseBuilder(Builder builder) {
        this.walls = builder.walls;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.roof = builder.roof;
        this.garage = builder.garage;
    }

    static class Builder {
        private int walls;
        private int doors;
        private int windows;
        private int roof;
        private int garage;

        public Builder buildWalls(int walls) {
            this.walls = walls;
            return this;
        }

        public Builder buildDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder buildWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder buildRoof(int roof) {
            this.roof = roof;
            return this;
        }

        public Builder buildGarage(int garage) {
            this.garage = garage;
           return this;
        }

        public HouseBuilder getResult() {
            return new HouseBuilder(this);
        }
    }
}


