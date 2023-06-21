package tn.esprit.estatemarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.estatemarket.entities.Offer;
import java.util.Set;

public interface OfferRepo extends JpaRepository<Offer, Long>  {
}
