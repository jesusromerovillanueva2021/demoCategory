package jrv.nttdata.demoCategory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jrv.nttdata.demoCategory.entity.Category;

public interface Repository extends JpaRepository<Category, Integer>{

}
