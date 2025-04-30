package com.otravez.denuevo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otravez.denuevo.model.Mascota;
import com.otravez.denuevo.repository.MascotaRepository;

@Service
public class MascotaService {
    @Autowired
    private MascotaRepository mascotaRepository;

    public Mascota guardarMascota(Mascota mascota)
    {
        //System.out.println("Aqui se filtra la mascota");
        return mascotaRepository.create(mascota);
        
    }
}
