package com.ram.myblogsmongo.repository;

import com.ram.myblogsmongo.collection.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TagRepository extends MongoRepository<Tag,String> {

    Optional<Tag> findByTagName(String tagName);

    Optional<Tag> findByIdAndActive(String id, boolean active);
}
