package com.hanik.jigsawboot.domains;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Assignment extends BaseEntity {

    Date startDate;

    Date endDate;
}
