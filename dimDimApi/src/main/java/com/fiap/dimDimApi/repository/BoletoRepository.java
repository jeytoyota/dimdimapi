package com.fiap.dimDimApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.dimDimApi.model.Boleto;

@Repository
public interface BoletoRepository extends JpaRepository<Boleto, Long> {

}
