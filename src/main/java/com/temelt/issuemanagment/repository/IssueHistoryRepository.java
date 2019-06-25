package com.temelt.issuemanagment.repository;

import com.temelt.issuemanagment.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {

    List<IssueHistory> getByIssueOrderById(Long id);
}
