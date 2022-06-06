package com.iamyajat.model;

public class Course {
    // COURSE CODE, COURSE TITLE, COURSE TYPE, ROOM NUMBER, SLOT, EMPLOYEE NAME
    public String courseCode;
    public String courseTitle;
    public String courseType;
    public String roomNumber;
    public String slot;
    public String employeeName;

    public Course(String courseCode, String courseTitle, String courseType, String roomNumber, String slot, String employeeName) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseType = courseType;
        this.roomNumber = roomNumber;
        this.slot = slot;
        this.employeeName = employeeName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                ", courseType='" + courseType + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", slot='" + slot + '\'' +
                ", employeeName='" + employeeName + '\'' +
                "}\n";
    }

    public static Course parse(String line) {
        String[] tokens = line.split(",");
        return new Course(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
    }
}
