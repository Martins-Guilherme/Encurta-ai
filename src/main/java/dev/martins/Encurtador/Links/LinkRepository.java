package dev.martins.Encurtador.Links;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
  Link findByUrlLong(String urlLong);
  Link findByUrlEncurtada(String urlEncurtada);
}
