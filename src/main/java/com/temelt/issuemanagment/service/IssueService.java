package com.temelt.issuemanagment.service;

import com.temelt.issuemanagment.dto.IssueDto;
import com.temelt.issuemanagment.util.TPage;
import org.springframework.data.domain.Pageable;


public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(Long issue);

    IssueDto update(Long id, IssueDto issue);

}
