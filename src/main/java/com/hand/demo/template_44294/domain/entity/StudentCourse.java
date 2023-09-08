package com.hand.demo.template_44294.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 
 * @TableName student_course
 */
@Setter
@Getter
public class StudentCourse implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long studentId;

    /**
     * 
     */
    private Long courseId;

    private static final long serialVersionUID = 1L;
}