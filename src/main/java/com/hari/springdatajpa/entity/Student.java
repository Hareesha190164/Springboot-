package com.hari.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(uniqueConstraints = @UniqueConstraint(name = "emailid_unique",
//                                                columnNames = "emailId"))
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence",
                    sequenceName = "student_sequence",
                      allocationSize = 2)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long studentId;
    private String firstName;
    private String lastName;

    @Column(
            nullable = false

    )
    private String emailId;
   @Embedded
    private Guardian guardian;




}
