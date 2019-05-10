package com.apipusaka.pusakaapi.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="Pegawai")
public class Pegawai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="nama")
    private String nama;
    @Column(name="nip")
    private String nip;
    @Column(name="email")
    private  String email;
    @Column(name="no_tlp")
    private String No_Telp;
    @Column(name="tgl_lahir")
    private Date tgl_lahir;
    @Column(name="tempat")
    private String tempat;
    @Column(name = "foto")
    private String Foto;
}
