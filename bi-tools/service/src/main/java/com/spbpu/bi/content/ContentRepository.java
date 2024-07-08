package com.spbpu.bi.content;

import com.spbpu.model.ContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContentRepository extends JpaRepository<ContentEntity, UUID> {
}
