package es.iesjandula.peajes.tikets;

import es.iesjandula.pasajeros.constantes.Constantes;

public class TiketGeneral implements Itikets 
{
	
	private double kilometroInicial;
	private double kilometroFinal;
	private double precio;
	
	
	/**
	 * @param kilometroInicial
	 * @param kilometroFial
	 * @param precio
	 */
	public TiketGeneral(double kilometroInicial, double precio) 
	{		
		this.kilometroInicial = kilometroInicial;
		this.precio = precio;
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
	 * @return the kilometroFial
	 */
	public double getKilometroFinal() 
	{
		return this.kilometroFinal;
	}


	/**
	 * @param kilometroFial the kilometroFial to set
	 */
	public void setKilometroFinal(double kilometroFial) 
	{
		this.kilometroFinal = kilometroFial;
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
	 * @param method calculate the price and the discount
	 * @return the price
	 */
	public double calculoDeTarifa() 
	{
		double pago;
		if(this.kilometroFinal-this.kilometroInicial >= 100)
		{
			pago=((this.kilometroFinal-this.kilometroInicial)*this.precio)-(((this.kilometroFinal-this.kilometroInicial)*this.precio)*Constantes.DESCUENTOGENERAL);
		}
		else 
		{
			pago=((this.kilometroFinal-this.kilometroInicial)*this.precio);
		}
		return pago;

	}


	/**
	 * @param method set the exit km
	 */
	@Override
	public void registrarSalida(int kilometroSalida) {
		this.setKilometroFinal(kilometroSalida);
		
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(Constantes.TIKET_GENERAL_KILOMETRO_INICIAL);
		builder.append(this.kilometroInicial);
		builder.append(Constantes.KILOMETRO_FIAL);
		builder.append(Constantes.PRECIOGENERAL);
		builder.append(this.precio);
		builder.append(Constantes.STR);
		return builder.toString();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TiketGeneral)) {
			return false;
		}
		TiketGeneral other = (TiketGeneral) obj;
		return Double.doubleToLongBits(kilometroFinal) == Double.doubleToLongBits(other.kilometroFinal)
				&& Double.doubleToLongBits(kilometroInicial) == Double.doubleToLongBits(other.kilometroInicial)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}



	

}
