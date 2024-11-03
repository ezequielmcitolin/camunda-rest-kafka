package br.ufrgs.ecd11.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.MismatchingMessageCorrelationException;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.rest.dto.message.MessageCorrelationResultDto;
import org.camunda.bpm.engine.runtime.MessageCorrelationBuilder;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufrgs.ecd11.dto.AlunoDTO;

@RestController
@RequestMapping("/aluno/iniciar")
@RequiredArgsConstructor
@Slf4j
public class ecd11Controller {
	
	private final static String MESSAGE_START = "INICIA_PROCESSAMENTO";
	
	private final RuntimeService runtimeService;

    @PostMapping()
    public void executarReguaRelacionamento(@RequestBody AlunoDTO mensagem){
    	
    	log.info("Iniciando procesamento  para {}", mensagem);
    
    }
}
