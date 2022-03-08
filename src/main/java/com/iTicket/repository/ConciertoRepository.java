
package com.iTIcket.repository;

import com.iTIcket.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConciertoRepository extends CrudRepository<Concierto,Long> {
    
}
