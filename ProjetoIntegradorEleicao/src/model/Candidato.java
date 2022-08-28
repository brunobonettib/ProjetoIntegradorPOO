package model;

public class Candidato 
{
	private int id;
	private String nome;
	private String partido;
	private int fichaLimpa;
	
	public Candidato(String nome, String partido, int fichaLimpa ) 
	{
		this.nome = nome;
		this.partido = partido;
		this.fichaLimpa = fichaLimpa;
	}
	
	public Candidato() 
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
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getPartido() 
	{
		return partido;
	}
	
	public void setPartido(String partido) 
	{
		this.partido = partido;
	}
	
	public int getfichaLimpa() 
	{
		return fichaLimpa;
	}
	
	public void setfichaLimpa(int fichaLimpa) 
	{
		this.fichaLimpa = fichaLimpa;
	}
	
}
