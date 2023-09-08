package com.hand.demo.template_44294.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName course
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Course implements Serializable {

    private Long id;

    private String name;

    private Long teacherId;

    private static final long serialVersionUID = 1L;
}