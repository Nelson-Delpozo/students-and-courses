package io.bootify.students_and_classes.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class StudentDTO {

    private Long id;

    @Size(max = 255)
    private String firstName;

    @NotNull
    @Size(max = 255)
    private String lastName;

    private Long course;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Long getCourse() {
        return course;
    }

    public void setCourse(final Long course) {
        this.course = course;
    }

}
