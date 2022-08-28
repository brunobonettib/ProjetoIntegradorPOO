package model;

public class CandidatoPesquisa 
{
	private int id;
	private int idCandidato;
	private int idPesquisa;
	private int voto;
	
	public CandidatoPesquisa(int idCandidato, int idPesquisa, int voto ) 
	{
		this.idCandidato = idCandidato;
		this.idPesquisa = idPesquisa;
		this.voto = voto;
	}
	
	public CandidatoPesquisa() 
	{
		
	}
	
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public int getIdCandidato() 
	{
		return idCandidato;
	}
	
	public void setIdCandidato(int idCandidato) 
	{
		this.idCandidato = idCandidato;
	}
	
	public int getIdPesquisa() 
	{
		return idPesquisa;
	}
	
	public void setIdPesquisa(int idPesquisa) 
	{
		this.idPesquisa = idPesquisa;
	}
	
	public int getVoto() 
	{
		return voto;
	}
	
	public void setVoto(int voto) 
	{
		this.voto = voto;
	}
	
	public void CalcularVotos() 
	{
		//Lógica de cálculo dos votos, não consegui definir se vai vir via procedure do banco, se vai ser atualizado via api, então não consegui pensar numa lógica correta.
	}
	
}
