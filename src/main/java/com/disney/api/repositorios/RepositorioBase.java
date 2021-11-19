package com.disney.api.repositorios;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface RepositorioBase<E , ID extends Serializable> extends JpaRepository<E, ID>{

}
