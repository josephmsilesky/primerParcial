package com.iTIcket.service;

import com.iTIcket.entity.Concierto;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.iTIcket.repository.ConciertoRepository;

@Service
public class ConciertoService implements IConciertoService {

    @Autowired
    private ConciertoRepository conciertoRepository;

    @Override
    public List<Concierto> getAllConciertos() {
        return (List<Concierto>) conciertoRepository.findAll();
    }

    @Override
    public void saveConcierto(Concierto concierto) {
        conciertoRepository.save(concierto);
    }

    @Override
    public Concierto getConciertoById(long id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id);
    }

}
