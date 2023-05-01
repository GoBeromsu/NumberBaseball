package org.example;

public class Validator {
    private int[] data;

    Validator(int[] data) {
        this.data = data;
    }

    private boolean checkError() {
        // if length is short
        if (data.length != 4) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            // If the input value is outside the range of 0 to 9
            if (data[i] < 0 || data[i] > 9) {
                return false;
            }
            // duplicate check
            for (int j = i + 1; j < 4; j++) {
                if (data[i] == data[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final int INVALID_LENGTH = 1;
    private static final int INVALID_VALUE = 2;
    private static final int DUPLICATE_VALUE = 3;

    public void validate() throws InvalidDataException {
        if (data.length != 4) {
            throw new InvalidDataException("Error: Invalid input length. Please enter four numbers.");
        }
        for (int i = 0; i < 4; i++) {
            if (data[i] < 0 || data[i] > 9) {
                throw new InvalidDataException("Error: Invalid input value. Please enter numbers between 0 and 9.");
            }
            for (int j = i + 1; j < 4; j++) {
                if (data[i] == data[j]) {
                    throw new InvalidDataException("Error: Duplicate value. Please enter four unique numbers.");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] testData = {1, 2, 3, 4};
        Validator validator = new Validator(testData);
        try {
            validator.validate();
            System.out.println("Validation successful.");
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidDataException extends Exception {
    InvalidDataException(String message) {
        super(message);
    }
}
