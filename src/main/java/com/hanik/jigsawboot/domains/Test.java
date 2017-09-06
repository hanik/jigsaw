package com.hanik.jigsawboot.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Table(name="Test")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String testName;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE")
    private Date createDate;
}
