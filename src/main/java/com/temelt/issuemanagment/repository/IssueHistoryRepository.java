package com.temelt.issuemanagment.repository;

import com.temelt.issuemanagment.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {


}
