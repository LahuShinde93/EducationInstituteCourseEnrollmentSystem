package com.nit.MultiThreading;

public class Main {
    public static void main(String[] args) {
        Course[] courses = {
            new Course(1, "Mathematics", 1000.0),
            new Course(2, "Science", 1200.0),
            new Course(3, "English", 900.0)
        }; 

        Offer[] offers = {
            new Offer("Special discount: Get 20% off on all courses!"),
            new Offer("Limited time offer: Enroll in any two courses and get one course free!")
        };

        EducationInstitute institute = new EducationInstitute(courses, offers);

        Student virat = new Student("Virat", institute);
        Student dhoni = new Student("Dhoni", institute);

        // Start threads to simulate concurrent student interactions
        virat.start();
        dhoni.start();

        try { 
            virat.join();
            dhoni.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
