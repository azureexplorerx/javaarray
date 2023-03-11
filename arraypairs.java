// creating a pair array to store pairs of integers
int[][] pairs = new int[5][2];

// initialize the pairs
pairs[0] = new int[]{1, 2};
pairs[1] = new int[]{32, 4};
pairs[2] = new int[]{5, 63};
pairs[3] = new int[]{17, 8};
pairs[4] = new int[]{9, 10};

// looping through the pairs array and print each pair
for (int i = 0; i < pairs.length; i++) {
    int[] pair = pairs[i];
    System.out.println("Pair " + (i+1) + ": (" + pair[0] + ", " + pair[1] + ")");
}
