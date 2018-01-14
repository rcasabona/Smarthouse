package br.com.smarthouse.corearduino.vo;

public enum EnumAmbiente {
	
	URI_ARDUINO("uri.arduino");
	
	private String caminho;
	
	private EnumAmbiente(final String _caminho) {
		this.caminho = _caminho;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

}
