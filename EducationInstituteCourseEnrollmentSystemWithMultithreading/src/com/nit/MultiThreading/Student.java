package com.nit.MultiThreading;

public class Student extends Thread {
    private String name;
    private EducationInstitute institute;

    public Student(String name, EducationInstitute institute) {
        this.name = name;
        this.institute = institute;
    }

    public void viewCoursesAndFees() {
        System.out.println("Available Courses:");
        for (Course course : institute.getCourses()) {
            System.out.println(course);
        }
        System.out.println();
    }

    public void viewOffers() {
        System.out.println("Ongoing Offers:");
        for (Offer offer : institute.getOffers()) {
            System.out.println(offer.getOfferText());
        }
        System.out.println();
    }

    public void enrollInCourse(int courseId) {
        institute.enrollStudentInCourse(courseId, name);
    }

    @Override
    public void run() {
        viewCoursesAndFees();
        viewOffers();
        enrollInCourse(1); // Example enrollment
    }
}
