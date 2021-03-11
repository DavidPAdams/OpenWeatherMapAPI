package com.dav.d25_weatherApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dav.d25_weatherApp.model.Zips;

@Repository
public interface ZipCodeRepository
    extends CrudRepository<Zips, Long> {
  List<Zips> findAll();
  List<Zips> findAllByOrderByCreatedAtDesc();
}