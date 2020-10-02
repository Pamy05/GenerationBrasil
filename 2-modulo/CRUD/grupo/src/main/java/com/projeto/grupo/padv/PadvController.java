package com.projeto.grupo.padv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/padv")
public class PadvController {
	
	@GetMapping
	public String GetMeuGrupo() {
		return "Eu considero a minha familia como o meu grupo principal de convivio.";
	}
	
	@GetMapping("/descricao")
	public String GetImportancia() {
		return "Costumo falar que sempre fui um bichinho mais isolado, portanto meus unicos contados humanos em maioria \n"
				+ "sempre foi familiar, e isso me moldou no eu de hoje, não sei interagir frequentemente com desconhecidos "
				+ "\npor muito tempo sem ser de forma exautiva, até em grupos de colegas é dificil pra mim me relacionar a "
				+ "\nponto de virar amizade, ter a familia sempre desde o inicio com esse monopolio do meu circulo social"
				+ "\nque também não permitiam o eu criança interagir com os outros me deu essa trava, é o que mais de negativo"
				+ "\nesse circulo me deu, mas em forma geral me deram a visão de tanta coisa errada que fizeram o que não seria"
				+ "\ninterrante de se fazer, ou seja, aprender com o erro alheio.";
	}

}
