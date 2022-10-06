package com.example.batchdemo.domain.repository;

import com.example.batchdemo.domain.entity.DeletedBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeletedBoardRepository extends JpaRepository<DeletedBoard, Long> {
}
