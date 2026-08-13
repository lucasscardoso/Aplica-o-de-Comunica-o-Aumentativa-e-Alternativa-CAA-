package com.caa.app.controller;

import com.caa.app.entity.CommunicationButton;
import com.caa.app.service.CommunicationButtonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/buttons")
public class CommunicationButtonController {

    private static final Logger log = LoggerFactory.getLogger(CommunicationButtonController.class);
    private CommunicationButtonService communicationButtonService;

    public CommunicationButtonController(CommunicationButtonService communicationButtonService) {
        this.communicationButtonService = communicationButtonService;
    }

    @GetMapping("/findallbuttons")
    public List<CommunicationButton> findAllButtons(){
        log.info("BUSCANDO TODOS OS BOTOES......");
        return communicationButtonService.findAllButtons();
    }
}
