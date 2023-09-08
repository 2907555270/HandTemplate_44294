package com.hand.demo.template_44294.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName student
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student implements Serializable {
    private Long id;
    private String name;

    private static final long serialVersionUID = 1L;
}