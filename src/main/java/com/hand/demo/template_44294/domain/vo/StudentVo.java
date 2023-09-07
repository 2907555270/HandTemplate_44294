package com.hand.demo.template_44294.domain.vo;

import com.hand.demo.template_44294.domain.entity.Course;
import lombok.Data;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:41
 */
@Data
public class StudentVo {
    /**
     * 学生id
     */
    private Long studentId;
    /**
     * 学生名称
     */
    private String studentName;
    /**
     * 学生所学课程
     */
    private List<CourseVo> courseVos;
}
