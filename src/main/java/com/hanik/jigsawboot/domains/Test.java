package com.hanik.jigsawboot.domains;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="TEST_DATA")
@Entity
public class Test extends BaseEntity {

    String testName;
}
