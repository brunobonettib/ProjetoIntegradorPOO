package model;

import java.time.LocalDate;

public class Pesquisa 
{
	private int id;
	private String instituto;
	private LocalDate data;
	private String local;
	private Float mediaIdade;
	private int tipo;
	private int formato;
	
	public Pesquisa(String instituto, LocalDate data, String local, Float mediaIdade, int tipo, int formato ) 
	{
		this.instituto = instituto;
		this.data = data;
		this.local = local;
		this.mediaIdade = mediaIdade;
		this.tipo = tipo;
		this.formato = formato;
	}
	
	public Pesquisa() 
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
	
	public String getInstituto()
	{
		return instituto;
	}
	
	public void setInstituto(String instituto) 
	{
		this.instituto = instituto;
	}
	
	public LocalDate getData()
	{
		return data;
	}
	
	public void setData(LocalDate data) 
	{
		this.data = data;
	}
	
	public String getLocal()
	{
		return local;
	}
	
	public void setLocal(String local) 
	{
		this.local = local;
	}
	
	public Float getMediaIdade() 
	{
		return mediaIdade;
	}
	
	public void setMediaIdade(Float mediaIdade) 
	{
		this.mediaIdade = mediaIdade;
	}
	
	public int getTipo() 
	{
		return tipo;
	}
	
	public void setTipo(int tipo) 
	{
		this.tipo = tipo;
	}
	
	public int getFormato() 
	{
		return formato;
	}
	
	public void setFormato(int formato) 
	{
		this.formato = formato;
	}

}
