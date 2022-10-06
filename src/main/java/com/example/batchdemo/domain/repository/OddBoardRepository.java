package com.example.batchdemo.domain.repository;

import com.example.batchdemo.domain.entity.OddBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OddBoardRepository extends JpaRepository<OddBoard, Long> {
}
