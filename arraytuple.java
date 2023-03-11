//Weare simulating a tuple class in Java.
//Define a Tuple class
class Tuple {
    private int first;
    private String second;
    private double third;

    public Tuple(int first, String second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public double getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}

// Create an array of Tuples
Tuple[] tuples = new Tuple[3];

// Initialize the tuples
tuples[0] = new Tuple(1, "first", 1.1);
tuples[1] = new Tuple(2, "second", 2.2);
tuples[2] = new Tuple(3, "third", 3.3);

// Loop through the tuples array and print each tuple
for (int i = 0; i < tuples.length; i++) {
    Tuple tuple = tuples[i];
    System.out.println("Tuple " + (i+1) + ": " + tuple.toString());
}
