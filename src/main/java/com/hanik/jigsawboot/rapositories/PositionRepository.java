package com.hanik.jigsawboot.rapositories;

import com.hanik.jigsawboot.domains.Position;
import com.hanik.jigsawboot.domains.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
}
