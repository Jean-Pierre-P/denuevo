package com.otravez.denuevo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.otravez.denuevo.model.Mascota;

@Repository
public class MascotaRepository {
    List<Mascota> pets=new ArrayList<>();

    public Mascota create(Mascota mascota)
    {
        pets.add(mascota);
        return mascota;
    }
}
