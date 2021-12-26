package br.com.rocketseat.expert.club.auditenvers.repository;

import br.com.rocketseat.expert.club.auditenvers.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByPublished(boolean published);

    List<Book> findByTitleContaining(String title);
}