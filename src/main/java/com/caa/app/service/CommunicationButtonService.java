package com.caa.app.service;

import com.caa.app.entity.CommunicationButton;
import com.caa.app.repository.CommunicationButtonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunicationButtonService {

    private CommunicationButtonRepository communicationButtonRepository;

    public CommunicationButtonService(CommunicationButtonRepository communicationButtonRepository) {
        this.communicationButtonRepository = communicationButtonRepository;
    }

    public List<CommunicationButton> findAllButtons(){
        return communicationButtonRepository.findAll();
    }
}
