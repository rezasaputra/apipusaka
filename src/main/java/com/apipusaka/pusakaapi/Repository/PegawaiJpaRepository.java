package com.apipusaka.pusakaapi.Repository;

import com.apipusaka.pusakaapi.Model.Pegawai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PegawaiJpaRepository extends JpaRepository <Pegawai,Long> {

    Pegawai findByNama(String nama);
}
