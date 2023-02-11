package csis3275.project.seasell.product.repository;

import csis3275.project.seasell.product.dto.ProductDto;
import csis3275.project.seasell.product.model.Product;
import csis3275.project.seasell.product.model.ProductStatus;
import java.util.List;
import java.util.Optional;

import csis3275.project.seasell.user.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findAllByStatus(ProductStatus status);
    Optional<Product> findById(int id);

    List<Product> findAllBySeller(AppUser seller);
}
