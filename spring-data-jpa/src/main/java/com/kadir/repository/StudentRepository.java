package com.kadir.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kadir.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // HQL : Sınıf ismi ve değişken isimleri kullanılarak sorgular yazılır
    // @Query(value = "from Student", nativeQuery = false)

    // SQL : Tablo isimleri ve kolon isimleri kullanılarak sorgular yazılır
    @Query(value = "select * from student.student", nativeQuery = true)
    List<Student> findAllStudents();

    @Query(value = "from Student s where s.id = :id")
    Optional<Student> findStudentById(Integer id);

}
