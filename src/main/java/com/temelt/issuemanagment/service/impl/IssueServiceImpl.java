package com.temelt.issuemanagment.service.impl;

import com.temelt.issuemanagment.dto.IssueDto;
import com.temelt.issuemanagment.entity.Issue;
import com.temelt.issuemanagment.repository.IssueRepository;
import com.temelt.issuemanagment.service.IssueService;
import com.temelt.issuemanagment.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeDebug.map;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issue) throws IllegalAccessException {
        if (issue.getDate() == null) {
            throw new IllegalAccessException("Issue Date cannot be null");

        }
        Issue issueDb = modelMapper.map(issue, Issue.class);

        issueDb = issueRepository.save(issueDb);
        return modelMapper.map(issueDb, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        TPage page=new TPage<IssueDto>();
       IssueDto[] dtos=modelMapper.map(data.getContent(),IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }

}
