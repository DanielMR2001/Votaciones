
public class ListaComunidades {
	
	private int votosPP, votosPSOE, votosVOX, votosCiudadanos;

	public ListaComunidades(int votosPP, int votosPSOE, int votosVOX, int votosCiudadanos) {
		this.votosPP = votosPP;
		this.votosPSOE = votosPSOE;
		this.votosVOX = votosVOX;
		this.votosCiudadanos = votosCiudadanos;
	}

	public int getVotosPP() {
		return votosPP;
	}

	public void setVotosPP(int votosPP) {
		this.votosPP = votosPP;
	}

	public int getVotosPSOE() {
		return votosPSOE;
	}

	public void setVotosPSOE(int votosPSOE) {
		this.votosPSOE = votosPSOE;
	}

	public int getVotosVOX() {
		return votosVOX;
	}

	public void setVotosVOX(int votosVOX) {
		this.votosVOX = votosVOX;
	}

	public int getVotosCiudadanos() {
		return votosCiudadanos;
	}

	public void setVotosCiudadanos(int votosCiudadanos) {
		this.votosCiudadanos = votosCiudadanos;
	}

	@Override
	public String toString() {
		return "ListaComunidades [votosPP=" + votosPP + ", votosPSOE=" + votosPSOE + ", votosVOX=" + votosVOX + ", votosCiudadanos=" + votosCiudadanos + "]";
	}

}
