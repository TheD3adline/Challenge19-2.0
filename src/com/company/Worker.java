package com.company;

public class Worker implements Comparable {

    private int id;
    private String lastName;

    public Worker(int id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + id;
    }

    //Method to sort the array workers alphabetically via lastName, and if lastName is same then use id to sort ascending

    @Override
    public int compareTo(Object o) {
        if(o instanceof Worker) {
            Worker other = (Worker) o;
            if(this.lastName.compareTo(other.lastName) != 0) { // != 0 to sort alphabetically, == 0 to sort reverse alphabetically
                return this.lastName.compareTo(other.lastName);
            }
            if(this.id < other.id) {
                return -1;
            }
            if(this.id > other.id) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
