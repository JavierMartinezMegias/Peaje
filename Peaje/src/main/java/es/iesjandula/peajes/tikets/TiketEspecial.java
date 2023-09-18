package es.iesjandula.peajes.tikets;

import java.util.Objects;

import es.iesjandula.pasajeros.constantes.Constantes;

public class TiketEspecial implements Itikets 
{
	
	private double kilometroInicial;
	private double kilometroFinal;
	private double precio;
	private int pasajeros;
	
	

	/**
	 * @param kilometroInicial
	 * @param kilometroFial
	 * @param precio
	 * @param pasajeros
	 */
	public TiketEspecial(double kilometroInicial, double precio, int pasajeros) 
	{
		this.kilometroInicial = kilometroInicial;
		this.precio = precio;
		this.pasajeros = pasajeros;
	}

	

	/**
	 * @return the kilometroInicial
	 */
	public double getKilometroInicial() 
	{
		return this.kilometroInicial;
	}



	/**
	 * @param kilometroInicial the kilometroInicial to set
	 */
	public void setKilometroInicial(double kilometroInicial) 
	{
		this.kilometroInicial = kilometroInicial;
	}



	/**
	 * @return the kilometroFinal
	 */
	public double getKilometroFinal() 
	{
		return this.kilometroFinal;
	}



	/**
	 * @param kilometroFinal the kilometroFinal to set
	 */
	public void setKilometroFinal(double kilometroFinal)
	{
		this.kilometroFinal = kilometroFinal;
	}



	/**
	 * @return the precio
	 */
	public double getPrecio() 
	{
		return this.precio;
	}



	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio)
	{
		this.precio = precio;
	}



	/**
	 * @return the pasajeros
	 */
	public int getPasajeros() 
	{
		return this.pasajeros;
	}



	/**
	 * @param pasajeros the pasajeros to set
	 */
	public void setPasajeros(int pasajeros) 
	{
		this.pasajeros = pasajeros;
	}
	
	/**
	 * This method set the exit km
	 */
	@Override
	public void registrarSalida(int kilometroSalida) 
	{
		this.setKilometroFinal(kilometroSalida);
		
	}
	
	/**
	 * @param method calculate the price and the discount
	 * @return the price 
	 */
	public double calculoDeTarifa() 
	{
		double pago;
		if(this.kilometroFinal-this.kilometroInicial >= 500)
		{
			pago=(((this.kilometroFinal-this.kilometroInicial)*this.precio)-(((this.kilometroFinal-this.kilometroInicial)*this.precio)*Constantes.DESCUENTOESPECIAL))*this.pasajeros;
		}
		else 
		{
			pago=((this.kilometroFinal-this.kilometroInicial)*this.precio)*this.pasajeros;
		}
		return pago;

	}


	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) 
		{
			return true;
		}
		if (!(obj instanceof TiketEspecial)) 
		{
			return false;
		}
		TiketEspecial other = (TiketEspecial) obj;
		return Double.doubleToLongBits(kilometroFinal) == Double.doubleToLongBits(other.kilometroFinal)
				&& Double.doubleToLongBits(kilometroInicial) == Double.doubleToLongBits(other.kilometroInicial)
				&& pasajeros == other.pasajeros
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}



	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append(Constantes.TIKET_ESPECIAL_KILOMETRO_INICIAL);
		builder.append(this.kilometroInicial);
		builder.append(Constantes.KILOMETRO_FINAL);
		builder.append(this.kilometroFinal);
		builder.append(Constantes.PRECIOESPECIAL);
		builder.append(this.precio);
		builder.append(Constantes.PASAJEROSESPECIAL);
		builder.append(this.pasajeros);
		builder.append(Constantes.STR);
		return builder.toString();
	}

	
	
}
