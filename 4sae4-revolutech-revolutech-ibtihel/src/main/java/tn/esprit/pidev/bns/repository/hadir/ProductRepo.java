package tn.esprit.pidev.bns.repository.hadir;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.bns.entity.hadir.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
