package twrapper;

public class TurtleWrapper {
    private static Turtle t = new Turtle();
    static {
        t.speed(200);
    }


    /**
     * Pauses the program for a given amount of time.
     *
     * @param time the time to wait in miliseconds
     */
    private static void wait(int time)
    {
        try
        {
            Thread.sleep(time);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }


    /**
     * Sets the speed of the animation.
     *
     * @param delay milliseconds it takes to do one action
     * @return state change timestamp
     */
    public static long speed(double delay) {
        return t.speed(delay);
    }

    /**
     * Moves the turtle forward by the distance.
     *
     * @param distance distance to move forward
     * @return state change timestamp
     */
    public static long forward(double distance) {
        return t.forward(distance);
    }

    /**
     * Moves the turtle backward by the distance.
     *
     * @param distance distance to move backward
     * @return state change timestamp
     */
    public static long backward(double distance) {
        return t.backward(distance);
    }

    /**
     * Turns the turtle left by the number of indicated degrees.
     *
     * @param angle angle in degrees
     * @return state change timestamp
     */
    public static long left(double angle) {
        return t.left(angle);
    }

    /**
     * Turns the turtle right by the number of indicated degrees.
     *
     * @param angle angle in degrees
     * @return state change timestamp
     */
    public static long right(double angle) {
        return t.right(angle);
    }

    /**
     * Gets the direction the turtle is facing neglecting tilt.
     *
     * @return state change timestamp
     */
    public static double getDirection() {
        return t.getDirection();
    }

    /**
     * Sets the direction the turtle is facing neglecting tilt.
     *
     * @param direction angle counter-clockwise from east
     * @return state change timestamp
     */
    public static long setDirection(double direction) {
        return t.setDirection(direction);
    }

    /**
     * Moves the turtle to (0,0) and facing east.
     *
     * @return state change timestamp
     */
    public static long home() {
        return t.home();
    }

    /**
     * Sets the direction in such a way that it faces (x,y)
     *
     * @param x x coordinate of target location
     * @param y y coordinate of target location
     * @return state change timestamp
     */
    public static long face(double x, double y) {
        return t.face(x, y);
    }

    /**
     * Gets direction towards (x,y)
     *
     * @param x x coordinate of target location
     * @param y y coordinate of target location
     * @return angle in degrees where 0<=angle<360
     */
    public static double towards(double x, double y) {
        return t.towards(x, y);
    }

    /**
     * Gets the distance to another position.
     *
     * @param x x coordinate of target location
     * @param y y coordinate of target location
     * @return distance between turtle's current location and another position
     */
    public static double distance(double x, double y) {
        return t.distance(x, y);
    }

    /**
     * Gets the x coordinate of the turtle.
     *
     * @return x coordinate
     */
    public static double getX() {
        return t.getX();
    }

    /**
     * Gets the y coordinate of the turtle.
     *
     * @return y coordinate
     */
    public static double getY() {
        return t.getY();
    }

     /**
     * Sets the position and direction of a turtle.
     *
     * @param x         x coordinate
     * @param y         y coordinate
     * @param direction angle counter-clockwise from east in degrees
     * @return state change timestamp
     */
    public static long setPosition(double x, double y, double direction) {
        return t.setPosition(x, y, direction);
    }

     /**
     * Sets the position and direction of a turtle.
     *
     * @param x x coordinate
     * @param y y coordinate
     * @return state change timestamp
     */
    public static long setPosition(double x, double y) {
        return t.setPosition(x, y);
    }

     /**
     * Sets the width of the turtles path
     *
     * @param penWidth width of the turtles path
     * @return state change timestamp
     */
    public static long width(double penWidth) {
        return t.width(penWidth);
    }

     /**
     * Picks the turtle's tail up so it won't draw on the screen as it moves.
     *
     * @return state change timestamp
     */
    public static long up() {
        return t.up();
    }

     /**
     * Puts the turtle's tail down so it will draw on the screen as it moves.
     *
     * @return state change timestamp
     */
    public static long down() {
        return t.down();
    }

    /**
     * Sets the turtle's path color.
     *
     * @param penColor Color of the turtle's path.
     * @return state change timestamp
     */
    public static long penColor(String penColor) {
        return t.penColor(penColor);
    }

     /**
     * Put a copy of the current turtle shape on the canvas.
     *
     * @return state change timestamp
     */
    public static long stamp() {
        return t.stamp();
    }

    /**
     * Put a dot 3 times the size of the penWidth on the canvas.
     *
     * @return state change timestamp
     */
    public static long dot() {
        return t.dot();
    }

    /**
     * Put a dot 3 times the size of the penWidth on the canvas.
     *
     * @param color color of dot
     * @return state change timestamp
     */
    public static long dot(String color) {
        return t.dot(color);
    }

    /**
     * Clears all the drawing that a turtle has done but all the turtle
     * settings remain the same. (color, location, direction, shape)
     */
    public static void clear() {
        t.clear();
    }

    /**
     * Waits 2 seconds, clears the screen adn resets the position of the turtle.
     */
    public static void reset() {
        wait(2000);
        t.home();
        t.clear();
    }

}
