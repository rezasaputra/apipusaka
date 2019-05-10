package com.apipusaka.pusakaapi.Controller;

import com.apipusaka.pusakaapi.Model.Pegawai;
import com.apipusaka.pusakaapi.Repository.PegawaiJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PegawaiController {
    @Autowired
    PegawaiJpaRepository jpaRepo;

    @GetMapping(value = "/pegawai")
    public List<Pegawai> findAll(){
        return jpaRepo.findAll();
    }

    @GetMapping(value="/pegawai/{nama}")
    public Pegawai findbyNama(@PathVariable final String nama){
        return jpaRepo.findByNama(nama);
    }

    @PostMapping(value="/pegawai")
    public Pegawai save(@RequestBody final Pegawai pegawai){
        jpaRepo.save(pegawai);
        return jpaRepo.findByNama(pegawai.getNama());
    }


}
