package br.com.restaurante.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe que representa a entidade Aluno
 *
 * @author Gabriel Romano
 */

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_matricula_aluno")
	private Long matricula;

	@Column(name = "nm_aluno")
	private String nome;
	
	@Column(name = "nm_social_aluno")
	private String nomeSocial;

	@Column(name = "cd_idade_aluno")
	private Integer idade;

	@Column(name = "dt_nascimento_aluno")
	private LocalDate dataNascimento;

	@Column(name = "nm_endereco_aluno")
	private String endereco;

	@Column(name = "nm_cidade_aluno")
	private String cidade;

	@Column(name = "nm_bairro_aluno")
	private String bairro;

	@Column(name = "ds_obs_endereco_aluno")
	private String observacaoEndereco;

	@Column(name = "nm_pai_aluno")
	private String nomePai;

	@Column(name = "nm_mae_aluno")
	private String nomeMae;

	@Column(name = "cd_telefone_aluno_fixo")
	private String telefoneFixo;

	@Column(name = "cd_telefone_celular_aluno")
	private String telefoneCelular;

	@Column(name = "nm_email_aluno")
	private String email;

	@Column(name = "ic_alergia_aluno")
	private Boolean alergia;

	@Column(name = "ic_alergia_remedio_aluno")
	private Boolean alergiaRemedio;

	@Column(name = "ic_alergia_alimento_aluno")
	private Boolean alergiaAlimento;

	@Column(name = "ic_alergia_outros_aluno")
	private Boolean alergiaOutros;

	@Column(name = "ds_especificacao_alergia_aluno")
	private String especificacaoAlergia;

	@Column(name = "ic_hipertensao_aluno")
	private Boolean hipertensao;

	@Column(name = "ic_hipotensao_aluno")
	private Boolean hipotensao;

	@Column(name = "ic_epilepsia_aluno")
	private Boolean epilepsia;

	@Column(name = "ic_diabetes_aluno")
	private Boolean diabetes;

	@Column(name = "ic_problema_renal_aluno")
	private Boolean problemaRenal;

	@Column(name = "ic_problema_ocular_aluno")
	private Boolean problemaOcular;

	@Column(name = "ic_problema_respiratorio_aluno")
	private Boolean problemaRespiratorio;

	@Column(name = "ic_fumante_aluno")
	private Boolean fumante;

	@Column(name = "ds_obs_aluno")
	private String observasao;

	@Column(name = "ds_emergencia_aluno")
	private String emergencia;

	@Column(name = "cd_camiseta_aluno")
	private String camiseta;

	@Column(name = "cd_sapato_aluno")
	private String sapato;

	@Column(name = "dt_criado_em")
	private LocalDate criadoEm;

	@Column(name = "dt_atualizado_em")
	private LocalDate atualizadoEm;

	@OneToMany(mappedBy = "aluno")
	private List<Advertencia> advertencias;

	@OneToMany(mappedBy = "aluno")
	private List<Boletim> boletins;

	@OneToMany(mappedBy = "aluno")
	private List<Frequencia> frequencias;
	
	@OneToMany(mappedBy = "aluno")
	private List<OcorrenciaDiario> ocorrenciaDiario;

	@OneToMany
	private List<Turma> turma;
	
	@Deprecated
	public Aluno() {
	}

	public Aluno(Long matricula, String nome, String nomeSocial,Integer idade, LocalDate dataNascimento, String endereco, String cidade,
			String bairro, String observacaoEndereco, String nomePai, String nomeMae, String telefoneFixo,
			String telefoneCelular, String email, Boolean alergia, Boolean alergiaRemedio, Boolean alergiaAlimento,
			Boolean alergiaOutros, String especificacaoAlergia, Boolean hipertensao, Boolean hipotensao,
			Boolean epilepsia, Boolean diabetes, Boolean problemaRenal, Boolean problemaOcular,
			Boolean problemaRespiratorio, Boolean fumante, String observasao, String emergencia, String camiseta,
			String sapato, LocalDate criadoEm) {
		this.matricula = matricula;
		this.nome = nome;
		this.nomeSocial = nomeSocial;
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
	
	public String getNomeSocial() {
		return nomeSocial;
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

	public List<Advertencia> getAdvertencias() {
		return advertencias;
	}

	public void setAtualizadoEm(LocalDate atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}

	public void setAdvertencias(List<Advertencia> advertencias) {
		this.advertencias = advertencias;
	}

	public List<Boletim> getBoletins() {
		return boletins;
	}

	public void setBoletins(List<Boletim> boletins) {
		this.boletins = boletins;
	}

	public List<Frequencia> getFrequencias() {
		return frequencias;
	}

	public void setFrequencias(List<Frequencia> frequencias) {
		this.frequencias = frequencias;
	}

	public List<Turma> getTurma() {
		return turma;
	}

	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}

	public List<OcorrenciaDiario> getOcorrenciaDiario() {
		return ocorrenciaDiario;
	}

	public void setOcorrenciaDiario(List<OcorrenciaDiario> ocorrenciaDiario) {
		this.ocorrenciaDiario = ocorrenciaDiario;
	}
	
	@Override
	public int hashCode() { 
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
}
