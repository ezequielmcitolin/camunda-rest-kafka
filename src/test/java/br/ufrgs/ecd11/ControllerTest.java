package br.ufrgs.ecd11;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.spring.boot.starter.test.helper.AbstractProcessEngineRuleTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import br.ufrgs.ecd11.controller.ecd11Controller;
import br.ufrgs.ecd11.dto.AlunoDTO;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ControllerTest extends AbstractProcessEngineRuleTest {

  @Autowired
  public RuntimeService runtimeService;

  private MockMvc mvc;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    this.mvc = MockMvcBuilders.standaloneSetup(new ecd11Controller(runtimeService) ).build();
  }
  
  // https://github.com/igia/caremanagement/blob/b292f54fc0b197aebca763086b0f33399a2eca02/src/test/java/io/igia/caremanagement/web/rest/camunda/GoalResourceTest.java
	  
	  
  @Test
  public void shouldExecuteHappyPath() throws Exception  {

	  // given 
	  
	  AlunoDTO req = new AlunoDTO(1, "Ezequielc");
	  mvc.perform(post("/aluno/iniciar")
			  		  .contentType(TestUtil.APPLICATION_JSON_UTF8)
			  	      .content(TestUtil.convertObjectToJsonBytes(req)))
	  	 .andExpect(status().isOk());

  }

}
