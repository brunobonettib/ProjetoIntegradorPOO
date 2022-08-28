package model;

public class TipoPesquisa 
{
	private int id;
	private String descricao;

	
	public TipoPesquisa(String descricao) 
	{
		this.descricao = descricao;
	}
	
	public TipoPesquisa() 
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
	
	public String getDescricao() 
	{
		return descricao;
	}
	
	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}
}
