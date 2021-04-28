package br.com.restaurante.modelo;

import java.time.LocalDate;

/**
 * A classe que representa a entidade Alunos
 *
 * @author Gabriel Romano
 */
public class Aluno {

	private Long matricula;
	private String nome;
	private Integer idade;
	private LocalDate dataNascimento;
	private String endereco;
	private String cidade;
	private String bairro;
	private String observacaoEndereco;
	private String nomePai;
	private String nomeMae;
	private String telefoneFixo;
	private String telefoneCelular;
	private String email;
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
	private String observasao;
	private String emergencia;
	private String camiseta;
	private String sapato;
	private LocalDate criadoEm;
	private LocalDate atualizadoEm;

	@Deprecated
	public Aluno() {
	}

	public Aluno(Long matricula, String nome, Integer idade, LocalDate dataNascimento, String endereco, String cidade,
			String bairro, String observacaoEndereco, String nomePai, String nomeMae, String telefoneFixo,
			String telefoneCelular, String email, Boolean alergia, Boolean alergiaRemedio, Boolean alergiaAlimento,
			Boolean alergiaOutros, String especificacaoAlergia, Boolean hipertensao, Boolean hipotensao,
			Boolean epilepsia, Boolean diabetes, Boolean problemaRenal, Boolean problemaOcular,
			Boolean problemaRespiratorio, Boolean fumante, String observasao, String emergencia, String camiseta,
			String sapato, LocalDate criadoEm) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.cidade = cidade;
		this.bairro = bairro;
		this.observacaoEndereco = observacaoEndereco;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.telefoneFixo = telefoneFixo;
		this.telefoneCelular = telefoneCelular;
		this.email = email;
		this.alergia = alergia;
		this.alergiaRemedio = alergiaRemedio;
		this.alergiaAlimento = alergiaAlimento;
		this.alergiaOutros = alergiaOutros;
		this.especificacaoAlergia = especificacaoAlergia;
		this.hipertensao = hipertensao;
		this.hipotensao = hipotensao;
		this.epilepsia = epilepsia;
		this.diabetes = diabetes;
		this.problemaRenal = problemaRenal;
		this.problemaOcular = problemaOcular;
		this.problemaRespiratorio = problemaRespiratorio;
		this.fumante = fumante;
		this.observasao = observasao;
		this.emergencia = emergencia;
		this.camiseta = camiseta;
		this.sapato = sapato;
		this.criadoEm = criadoEm;
	}

	public Long getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public String getObservacaoEndereco() {
		return observacaoEndereco;
	}

	public String getNomePai() {
		return nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public String getEmail() {
		return email;
	}

	public Boolean getAlergia() {
		return alergia;
	}

	public Boolean getAlergiaRemedio() {
		return alergiaRemedio;
	}

	public Boolean getAlergiaAlimento() {
		return alergiaAlimento;
	}

	public Boolean getAlergiaOutros() {
		return alergiaOutros;
	}

	public String getEspecificacaoAlergia() {
		return especificacaoAlergia;
	}

	public Boolean getHipertensao() {
		return hipertensao;
	}

	public Boolean getHipotensao() {
		return hipotensao;
	}

	public Boolean getEpilepsia() {
		return epilepsia;
	}

	public Boolean getDiabetes() {
		return diabetes;
	}

	public Boolean getProblemaRenal() {
		return problemaRenal;
	}

	public Boolean getProblemaOcular() {
		return problemaOcular;
	}

	public Boolean getProblemaRespiratorio() {
		return problemaRespiratorio;
	}

	public Boolean getFumante() {
		return fumante;
	}

	public String getObservasao() {
		return observasao;
	}

	public String getEmergencia() {
		return emergencia;
	}

	public String getCamiseta() {
		return camiseta;
	}

	public String getSapato() {
		return sapato;
	}

	public LocalDate getCriadoEm() {
		return criadoEm;
	}

	public LocalDate getAtualizadoEm() {
		return atualizadoEm;
	}

}
