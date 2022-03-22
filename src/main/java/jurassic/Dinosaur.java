package jurassic;

public class Dinosaur {

    private String breed;
    private int expectedCount;
    private int actualCount;

    public Dinosaur(String breed, int expectedCount, int actualCount) {
        this.breed = breed;
        this.expectedCount = expectedCount;
        this.actualCount = actualCount;
    }

    public String getBreed() {
        return breed;
    }

    public int getExpectedCount() {
        return expectedCount;
    }

    public int getActualCount() {
        return actualCount;
    }
}
