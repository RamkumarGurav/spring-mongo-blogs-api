package com.ram.myblogsmongo.repository;

import com.ram.myblogsmongo.collection.Category;
import com.ram.myblogsmongo.collection.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends MongoRepository<Category,String> {
    Optional<Category> findByCategoryName(String string);
    Optional<Tag> findByIdAndActive(String id, boolean active);
}
