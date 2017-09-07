package com.hanik.jigsawboot.domains;

import com.hanik.jigsawboot.constants.Role;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@Entity
public class Position extends BaseEntity{

    @Enumerated(EnumType.STRING)
    Role role;

    Date startDate;

    Date endDate;
}
