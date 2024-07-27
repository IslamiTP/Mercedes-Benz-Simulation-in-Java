public class Mercedes {
    private String model;
    private int year;
    private int speed;

    // Default constructor
    public Mercedes() {
    }

    // Constructor with parameters
    public Mercedes(String model, int year, int speed) throws IllegalArgumentException {
        this.model = model;
        this.year = year;
        this.speed = speed;
        dasTempo();
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) throws IllegalArgumentException {
        this.speed = speed;
        dasTempo();
    }

    // Getters
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    // DasTempo method to ensure a minimum speed
    private void dasTempo() throws IllegalArgumentException {
        if (speed < 230) {
            throw new IllegalArgumentException("Das is Mercedes, we is not no Honda. Please insert a serious number for speed. Sincerely, Mercedes AMG.");
        }
    }

    // Equality operator
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Mercedes mercedes = (Mercedes) obj;
        return year == mercedes.year && speed == mercedes.speed && model.equals(mercedes.model);
    }

    // Addition operator
    public Mercedes add(Mercedes other) throws IllegalArgumentException {
        String combinedModel = this.model + other.model;
        int combinedYear = this.year + other.year;
        int combinedSpeed = (this.speed + other.speed) / 2;
        return new Mercedes(combinedModel, combinedYear, combinedSpeed);
    }

    // Input method
    public static Mercedes readFromInput(java.util.Scanner scanner) throws IllegalArgumentException {
        String model = scanner.next();
        int year = scanner.nextInt();
        int speed = scanner.nextInt();

        if (!model.equals("S-Klass") && !model.equals("E63s") && !model.equals("C63") && !model.equals("Brabus")) {
            throw new IllegalArgumentException("Invalid model. You is not good enough for a Mercedes-Benz, go buy a Honda.");
        }
        if (year != 2024 && year != 2016 && year != 2009 && year != 2020 && year != 2021) {
            throw new IllegalArgumentException("Invalid year. You is not good enough for a Mercedes-Benz, go buy a Honda.");
        }
        if (speed != 290 && speed != 300 && speed != 250 && speed != 240 && speed != 330) {
            throw new IllegalArgumentException("Invalid speed. Das is Mercedes, we is not no Honda. Please insert a serious number for speed. Sincerely, Mercedes AMG.");
        }

        return new Mercedes(model, year, speed);
    }

    // Output method
    @Override
    public String toString() {
        return "Model: " + model + ", Year: " + year + ", Speed: " + speed;
    }
}