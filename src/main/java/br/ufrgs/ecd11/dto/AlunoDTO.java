package br.ufrgs.ecd11.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AlunoDTO {
	
	@Getter @Setter public int IdAluno;
	@Getter @Setter public String Nome;
	
}
