package com.jonts9.repertorio.domain;

import java.util.ArrayList;
import java.util.List;

public class Musica {
	private Integer id;
	private String nomePrincipal;
	private List<String> nomesAlternativos;
	private String autor;
	private String descricao;
	private String letra;
	private Partitura partituraPrincipal;
	private List<Partitura> partiturasAlternativas;
	private Cifra cifraPrincipal;
	private List<Cifra> cifrasAlternativas;
	private Link linkPrincipal;
	private List<Link> linksAlternativos;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomePrincipal() {
		return nomePrincipal;
	}
	public void setNomePrincipal(String nomePrincipal) {
		getNomesAlternativos().remove(nomePrincipal);
		if(nomePrincipal != null && !nomePrincipal.equals("")) {
			addNomesAlternativos(getNomePrincipal());
		}
		this.nomePrincipal = nomePrincipal;
	}
	public List<String> getNomesAlternativos() {
		return nomesAlternativos != null ? nomesAlternativos : new ArrayList<String>();
	}
	public void addNomesAlternativos(String nomeAlternativo) {
		if (!getNomesAlternativos().contains(nomeAlternativo)) {
			getNomesAlternativos().add(nomeAlternativo);
		}
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public Partitura getPartituraPrincipal() {
		return partituraPrincipal;
	}
	public void setPartituraPrincipal(Partitura partituraPrincipal) {
		this.partituraPrincipal = partituraPrincipal;
	}
	public List<Partitura> getPartiturasAlternativas() {
		return partiturasAlternativas;
	}
	public void setPartiturasAlternativas(List<Partitura> partiturasAlternativas) {
		this.partiturasAlternativas = partiturasAlternativas;
	}
	public Cifra getCifraPrincipal() {
		return cifraPrincipal;
	}
	public void setCifraPrincipal(Cifra cifraPrincipal) {
		this.cifraPrincipal = cifraPrincipal;
	}
	public List<Cifra> getCifrasAlternativas() {
		return cifrasAlternativas;
	}
	public void setCifrasAlternativas(List<Cifra> cifrasAlternativas) {
		this.cifrasAlternativas = cifrasAlternativas;
	}
	public Link getLinkPrincipal() {
		return linkPrincipal;
	}
	public void setLinkPrincipal(Link linkPrincipal) {
		this.linkPrincipal = linkPrincipal;
	}
	public List<Link> getLinksAlternativos() {
		return linksAlternativos;
	}
	public void setLinksAlternativos(List<Link> linksAlternativos) {
		this.linksAlternativos = linksAlternativos;
	}
}
