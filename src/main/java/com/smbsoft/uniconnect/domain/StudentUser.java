package com.smbsoft.uniconnect.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * A StudentUser.
 */

@Document(collection = "student_user")
public class StudentUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("graduate")
    private Boolean graduate;

    // I hope this will work until 2050 ;-)
    @Min(value = 1900)
    @Max(value = 2500)
    @Field("graduateYear")
    private Integer graduateYear;

    @Min(value = 0)
    @Max(value = 8)
    @Field("currentSemester")
    private Integer currentSemester;

    // String array of interests
    @Field("interests")
    private String[] interests;

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public StudentUser interests(String[] interests){
        this.interests = interests;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean isGraduate() {
        return graduate;
    }

    public StudentUser graduate(Boolean graduate) {
        this.graduate = graduate;
        return this;
    }

    public void setGraduate(Boolean graduate) {
        this.graduate = graduate;
    }

    public Integer getGraduateYear() {
        return graduateYear;
    }

    public StudentUser graduateYear(Integer graduateYear) {
        this.graduateYear = graduateYear;
        return this;
    }

    public void setGraduateYear(Integer graduateYear) {
        this.graduateYear = graduateYear;
    }

    public Integer getCurrentSemester() {
        return currentSemester;
    }

    public StudentUser currentSemester(Integer currentSemester) {
        this.currentSemester = currentSemester;
        return this;
    }

    public void setCurrentSemester(Integer currentSemester) {
        this.currentSemester = currentSemester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StudentUser student_user = (StudentUser) o;
        if (student_user.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, student_user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "StudentUser{" +
            "id=" + id +
            ", graduate='" + graduate + "'" +
            ", graduateYear='" + graduateYear + "'" +
            ", currentSemester='" + currentSemester + "'" +
            ", interests='" + Arrays.toString(interests) + "'"+
            '}';
    }
}
