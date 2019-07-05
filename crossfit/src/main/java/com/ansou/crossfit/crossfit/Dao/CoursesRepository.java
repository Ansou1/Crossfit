package com.ansou.crossfit.crossfit.Dao;

import com.ansou.crossfit.crossfit.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Course, Integer> {
}
