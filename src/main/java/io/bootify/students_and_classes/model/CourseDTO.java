package io.bootify.students_and_classes.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class CourseDTO {

    private Long id;

    @NotNull
    @Size(max = 255)
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

}
