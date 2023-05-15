package es.mdef.gestionPreguntasXML.entidades;

import java.util.ArrayList;
import java.util.List;

public class FamiliaImpl extends es.mdef.support.Familia{

    private Long id;

	private List<Pregunta> preguntas = new ArrayList<>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public long getTamano() {
		return getPreguntas().size();
	}
	public List<Pregunta> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	@Override
	public String toString() {
		return "FamiliaImpl [id=" + id + ", preguntas=" + preguntas + "]";
	}
	
}
