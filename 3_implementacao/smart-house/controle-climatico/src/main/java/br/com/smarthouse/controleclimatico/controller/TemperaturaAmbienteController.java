package br.com.smarthouse.controleclimatico.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import br.com.smarthouse.arduino.ArduinoSerial;
import br.com.smarthouse.controleclimatico.business.TemperaturaAmbienteService;
import br.com.smarthouse.controleclimatico.model.QualidadeDoAr;
import br.com.smarthouse.controleclimatico.model.TemperaturaAmbiente;
import br.com.smarthouse.controleclimatico.model.TipoTemperatura;
import br.com.smarthouse.modelgenerics.vo.LeituraAmbienteDTO;

@Controller
@RequestMapping("/temperaturaAmbiente")
public class TemperaturaAmbienteController {
	
	@Autowired
	private TemperaturaAmbienteService temperaturaAmbienteService;
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody TemperaturaAmbiente create() {
		TemperaturaAmbiente temperatura = montaTemperaturaAmbiente();
		temperaturaAmbienteService.create(temperatura);
		return temperatura;
	}

	private TemperaturaAmbiente montaTemperaturaAmbiente() {
		TemperaturaAmbiente temperatura = new TemperaturaAmbiente();
		temperatura.setQualidadeDoAr(QualidadeDoAr.ABAFADO);
		temperatura.setTipoTemperatura(TipoTemperatura.QUENTE);
		temperatura.setIdentificadorUsuario(1L);
		return temperatura;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody TemperaturaAmbiente get() {
//		getTemperatura();
//		setLuzLigada();
		TemperaturaAmbiente temperatura = montaTemperaturaAmbiente();
		temperaturaAmbienteService.create(temperatura);
		return temperatura;
	}
	
	private void setLuzLigada() {
		ArduinoSerial arduino = new ArduinoSerial("/dev/cu.usbmodem1411");
		arduino.send("l");
	}
	
	private void getTemperatura() {
		ArduinoSerial arduino = new ArduinoSerial("/dev/cu.usbmodem1411");
		
		Thread t = new Thread() {
			@Override
			public void run() {
				arduino.initialize();
				
				while(true) {
					String json = arduino.read();
					
					if (json != null) {
						XStream xstream = new XStream(new JettisonMappedXmlDriver());
						xstream.alias("jsonLeituraAmbiente", LeituraAmbienteDTO.class);
						LeituraAmbienteDTO leituraAmbienteDTO = (LeituraAmbienteDTO) xstream.fromXML(json);
						
						System.out.println(leituraAmbienteDTO);
					}
					

					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		t.start();
	}

}
