package com.ram.myblogsmongo.service;

import com.ram.myblogsmongo.collection.Tag;
import com.ram.myblogsmongo.collection.Tag;

import java.util.List;
import java.util.Optional;

public interface TagService {
    Tag createTag(Tag tag);

    Tag updateTag(Tag tag);

    List<Tag> getAllTags();

    Optional<Tag> getActiveSingleTag(String id, boolean active);

    Optional<Tag> getSingleTag(String id);

    Optional<Tag> getSingleTagByName(String tagName);

    void permanentlyDeleteTag(String id);
}
