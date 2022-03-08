package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@RepositoryRestResource(exported = false)
public interface AuthorRepository extends JpaRepository<Author, Long> {}