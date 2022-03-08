package com.iTIcket.service;

import com.iTIcket.entity.Concierto;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface IConciertoService {

    public List<Concierto> getAllConciertos();

    public void saveConcierto(Concierto concierto);

    public Concierto getConciertoById(long id);

    public void delete(long id);

}
