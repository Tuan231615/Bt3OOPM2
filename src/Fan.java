public class Fan {
    private final int SLOW = 1;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
     

    public int getSLOW() {
        return SLOW;
    }

    public int getMedium() {
        int medium = 2;
        return medium;
    }

    public int getFAST() {
        int FAST = 3;
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
         String status = "";
         if(this.isOn()){
             status += ("Fan is on");
             status += ("\nSpeed: " + this.speed + "\n");
         } else {
             status += ("Fan is off \n");
         }
         status += ("Color: " + this.color + "\n");
         status += ("Radius: " + this.radius + "\n");
        return status;
    }
}
