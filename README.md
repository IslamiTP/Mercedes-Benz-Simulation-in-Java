---

# Mercedes-Benz Simulation in Java

## Project Overview

This project is a Java-based simulation of Mercedes-Benz car models. It includes the creation, manipulation, and validation of car objects with specific attributes such as model, year, and speed. The project demonstrates object-oriented programming principles in Java, including class definitions, constructors, setters, getters, operator overloading, exception handling, and user input processing.

## Features

- **Car Class (`Mercedes.java`)**: Represents a Mercedes-Benz car with attributes for model, year, and speed. Includes methods for setting and getting these attributes, as well as for validating input data.
- **Operator Overloading**: Implements equality and addition operations for car objects.
- **Exception Handling**: Ensures robust error handling for invalid input data.
- **User Input Processing**: Allows users to enter car details through the console, with validation against predefined models, years, and speeds.

## Classes and Methods

### `Mercedes.java`
- **Constructors**:
    - `Mercedes()`: Default constructor.
    - `Mercedes(String model, int year, int speed)`: Parameterized constructor with validation.
- **Setters**:
    - `setModel(String model)`: Sets the car model.
    - `setYear(int year)`: Sets the car year.
    - `setSpeed(int speed)`: Sets the car speed with validation.
- **Getters**:
    - `getModel()`: Gets the car model.
    - `getYear()`: Gets the car year.
    - `getSpeed()`: Gets the car speed.
- **Validation Methods**:
    - `dasTempo()`: Ensures the car speed meets the minimum threshold.
    - `readFromInput(Scanner scanner)`: Reads and validates user input.
- **Overridden Methods**:
    - `equals(Object obj)`: Checks if two car objects are equal.
    - `toString()`: Returns a string representation of the car object.
- **Additional Methods**:
    - `add(Mercedes other)`: Combines two car objects into one.

### `Main.java`
- **Main Method**:
    - Initializes predefined car objects.
    - Prompts user for input to create custom car objects.
    - Validates user input and handles errors gracefully.
    - Demonstrates equality and addition operations on car objects.
    - Displays results to the console.

## How to Run

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/yourusername/mercedes-benz-simulation.git
   cd mercedes-benz-simulation
   ```

2. **Compile the Code**:
   ```sh
   javac Mercedes.java Main.java
   ```

3. **Run the Program**:
   ```sh
   java Main
   ```

## Example Usage

Upon running the program, you will see a list of predefined Mercedes-Benz models with their attributes. You will then be prompted to enter your own car details. The program will validate your input and provide feedback or perform operations based on the entered data.

Example Output:
```
Auffuhren of Mercedes-Benz:
------------------------------
S-Klass:    2024 290 kph
E63s:       2016 300 kph
C63:        2009 250 kph
Brabus:     2020 240 kph
Brabus:     2021 330 kph
------------------------

Enter Your Mercedes-Benz 
Und Example:
Klass Year Speed

Mercedes-Benz Ein: 
E63s 2016 290
Mercedes-Benz Zwei: 
C63 2009 250
Model: E63s, Year: 2016, Speed: 290 Is nein de same as Model: C63, Year: 2009, Speed: 250

Mercedes-Benz Zweimal: Model: E63sC63, Year: 4025, Speed: 270

```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
