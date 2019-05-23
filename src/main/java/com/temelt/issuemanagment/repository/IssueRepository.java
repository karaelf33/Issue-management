package com.temelt.issuemanagment.repository;

import com.temelt.issuemanagment.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue,Long> {
}
