package org.example.l6_2;

// Exception personnalisée
class DatabaseException extends Exception {
    public DatabaseException(String message) {
        super(message);
    }
}