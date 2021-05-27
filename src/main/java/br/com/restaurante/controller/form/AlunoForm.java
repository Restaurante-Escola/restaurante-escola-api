package br.com.restaurante.controller.form;

import java.time.LocalDate;

import br.com.restaurante.controller.dto.AlunoDto;
import br.com.restaurante.model.Aluno;

//classe apenas para representar o que recebemos do cliente por JSON
public class AlunoForm {
	
	private Long matricula;

	private String nome;
	
	private String nomeSocial;

	private Integer idade;
	
	private String estadoCivil;

	private LocalDate dataNascimento;
	
	private String rg;
	
	private String cpf;

	private String telefoneCelular;
	
	private String numeroWhatsapp;
	
	private String telefoneRecado;
	
	private String nomePessoaTelefoneRecado;
	
	private String endereco;

	private String email;
	
	private String nomeResponsavel;
	
	private String escolaridade;
	
	private String escolaFundamental;
	
	private String escolaMedio;
	
	private String anoMedio;
	
	private String anoFormacaoMedio;
	
	private String camiseta;
	
	private String cidade;

	private String bairro;

	private String observacaoEndereco;

	private String nomePai;

	private String nomeMae;

	private String sapato;

	private String servicoAtendimento;
	
	private String unidade;
	
	private String tecnico;
	
	private String telefoneTecnico;

	private Boolean alergia;

	private Boolean alergiaRemedio;

	private Boolean alergiaAlimento;

	private Boolean alergiaOutros;

	private String especificacaoAlergia;

	private Boolean hipertensao;

	private Boolean hipotensao;

	private Boolean epilepsia;

	private Boolean diabetes;

	private Boolean problemaRenal;

	private Boolean problemaOcular;

	private Boolean problemaRespiratorio;

	private Boolean fumante;
	
	private String medicamentosUsoContinuo;

	private String observasao;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getNumeroWhatsapp() {
		return numeroWhatsapp;
	}

	public void setNumeroWhatsapp(String numeroWhatsapp) {
		this.numeroWhatsapp = numeroWhatsapp;
	}

	public String getTelefoneRecado() {
		return telefoneRecado;
	}

	public void setTelefoneRecado(String telefoneRecado) {
		this.telefoneRecado = telefoneRecado;
	}

	public String getNomePessoaTelefoneRecado() {
		return nomePessoaTelefoneRecado;
	}

	public void setNomePessoaTelefoneRecado(String nomePessoaTelefoneRecado) {
		this.nomePessoaTelefoneRecado = nomePessoaTelefoneRecado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getEscolaFundamental() {
		return escolaFundamental;
	}

	public void setEscolaFundamental(String escolaFundamental) {
		this.escolaFundamental = escolaFundamental;
	}

	public String getEscolaMedio() {
		return escolaMedio;
	}

	public void setEscolaMedio(String escolaMedio) {
		this.escolaMedio = escolaMedio;
	}

	public String getAnoMedio() {
		return anoMedio;
	}

	public void setAnoMedio(String anoMedio) {
		this.anoMedio = anoMedio;
	}

	public String getAnoFormacaoMedio() {
		return anoFormacaoMedio;
	}

	public void setAnoFormacaoMedio(String anoFormacaoMedio) {
		this.anoFormacaoMedio = anoFormacaoMedio;
	}

	public String getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(String camiseta) {
		this.camiseta = camiseta;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getObservacaoEndereco() {
		return observacaoEndereco;
	}

	public void setObservacaoEndereco(String observacaoEndereco) {
		this.observacaoEndereco = observacaoEndereco;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getSapato() {
		return sapato;
	}

	public void setSapato(String sapato) {
		this.sapato = sapato;
	}

	public String getServicoAtendimento() {
		return servicoAtendimento;
	}

	public void setServicoAtendimento(String servicoAtendimento) {
		this.servicoAtendimento = servicoAtendimento;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getTelefoneTecnico() {
		return telefoneTecnico;
	}

	public void setTelefoneTecnico(String telefoneTecnico) {
		this.telefoneTecnico = telefoneTecnico;
	}

	public Boolean getAlergia() {
		return alergia;
	}

	public void setAlergia(Boolean alergia) {
		this.alergia = alergia;
	}

	public Boolean getAlergiaRemedio() {
		return alergiaRemedio;
	}

	public void setAlergiaRemedio(Boolean alergiaRemedio) {
		this.alergiaRemedio = alergiaRemedio;
	}

	public Boolean getAlergiaAlimento() {
		return alergiaAlimento;
	}

	public void setAlergiaAlimento(Boolean alergiaAlimento) {
		this.alergiaAlimento = alergiaAlimento;
	}

	public Boolean getAlergiaOutros() {
		return alergiaOutros;
	}

	public void setAlergiaOutros(Boolean alergiaOutros) {
		this.alergiaOutros = alergiaOutros;
	}

	public String getEspecificacaoAlergia() {
		return especificacaoAlergia;
	}

	public void setEspecificacaoAlergia(String especificacaoAlergia) {
		this.especificacaoAlergia = especificacaoAlergia;
	}

	public Boolean getHipertensao() {
		return hipertensao;
	}

	public void setHipertensao(Boolean hipertensao) {
		this.hipertensao = hipertensao;
	}

	public Boolean getHipotensao() {
		return hipotensao;
	}

	public void setHipotensao(Boolean hipotensao) {
		this.hipotensao = hipotensao;
	}

	public Boolean getEpilepsia() {
		return epilepsia;
	}

	public void setEpilepsia(Boolean epilepsia) {
		this.epilepsia = epilepsia;
	}

	public Boolean getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(Boolean diabetes) {
		this.diabetes = diabetes;
	}

	public Boolean getProblemaRenal() {
		return problemaRenal;
	}

	public void setProblemaRenal(Boolean problemaRenal) {
		this.problemaRenal = problemaRenal;
	}

	public Boolean getProblemaOcular() {
		return problemaOcular;
	}

	public void setProblemaOcular(Boolean problemaOcular) {
		this.problemaOcular = problemaOcular;
	}

	public Boolean getProblemaRespiratorio() {
		return problemaRespiratorio;
	}

	public void setProblemaRespiratorio(Boolean problemaRespiratorio) {
		this.problemaRespiratorio = problemaRespiratorio;
	}

	public Boolean getFumante() {
		return fumante;
	}

	public void setFumante(Boolean fumante) {
		this.fumante = fumante;
	}

	public String getMedicamentosUsoContinuo() {
		return medicamentosUsoContinuo;
	}

	public void setMedicamentosUsoContinuo(String medicamentosUsoContinuo) {
		this.medicamentosUsoContinuo = medicamentosUsoContinuo;
	}

	public String getObservasao() {
		return observasao;
	}

	public void setObservasao(String observasao) {
		this.observasao = observasao;
	}

	public Aluno converter() {
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		
		//fazer todos os outros atributos
		
		return aluno;
	}

	public AlunoDto atualizar(Aluno aluno) {
		//implementar
		return null;
	}
}
