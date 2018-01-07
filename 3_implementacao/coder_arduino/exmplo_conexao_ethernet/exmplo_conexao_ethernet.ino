//Programa: Automacao Residencial com Arduino e Ethernet Shield
//Autor: FILIPEFLOP

//#include <SPI.h>
#include <Ethernet.h>
String readString;

int pino_rele1 = 3;
boolean ligado = true;

//Definicoes de IP, mascara de rede e gateway
byte mac[] = {0xDE, 0xA2, 0xBE, 0xEF, 0xFE, 0xED};
IPAddress ip(192,168,0,51);          // Define o endereco IP
IPAddress gateway(192,168,0,1);      // Define o gateway
IPAddress subnet(255,255,255,0);  // Define a máscara de rede

EthernetServer server(80);

void setup()
{
  Serial.begin(9600);
  pinMode(pino_rele1, OUTPUT);

  //Inicializa Ethernet Shield
  Ethernet.begin(mac, ip, gateway, subnet);
  server.begin();

  Serial.println("FILIPEFLOP - Automacao Residencial"); 

  //Desliga o rele
  digitalWrite(pino_rele1, HIGH);
}

void loop()
{
  EthernetClient client = server.available();
  if (client) {
    while (client.connected())
    {
      if (client.available())
      {
        char c = client.read();
        if (readString.length() < 100) {
          readString += c;
        }
        if (c == 'n')
        {
          //Controle do rele1
          Serial.println(readString);
          //Liga o Rele 1
          if (readString.indexOf("?ligar") > 0)
          {
            digitalWrite(pino_rele1, LOW);
            Serial.println("Rele 1 Ligado");
            ligado = false;
          }
          else
          {
            //Desliga o Rele 1
            if (readString.indexOf("?desligar") > 0)
            {
              digitalWrite(pino_rele1, HIGH);
              Serial.println("Rele 1 Desligado");
              ligado = true;
            }
          }

          readString = "";

          client.println("HTTP/1.1 200 OK");
          client.println("Content-Type: text/html");
          client.println();
          client.println("<html>");
          client.println("<head>");
          client.println("<title>Automacao Residencial</title>");
          client.println("<meta http-equiv='Content-Type' content='text/html; charset=ISO-8859-1'>");
          client.println("<meta name='viewport' content='width=720, initial-scale=0.5' />");
          client.println("<link rel='stylesheet' type='text/css' href='http://img.filipeflop.com/files/download/automacao/automacao_residencial.css' />");
          client.println("<script type='text/javascript' src='https://img.filipeflop.com/files/download/automacao/automacao_residencial.js'></script>");
          client.println("</head>");
          client.println("<body>");
          client.println("<div id='wrapper'>");
          client.println("<div id='div1'>Rele 1</div>");
          client.println("<div id='div2'>Rele 2</div>");
          client.print("<div id='rele'></div><div id='estado' style='visibility: hidden;'>");
          client.print(ligado);
          client.println("</div>");
          client.println("<div id='botao'></div>");
          client.println("<div id='botao_2'></div>");
          client.print("<div id='rele_2'></div><div id='estado_2' style='visibility: hidden;'>");
          client.println("</div>");
          client.println("</div>");
          client.println("<script>AlteraRele1()</script>");
          client.println("<script>AlteraRele2()</script>");
          client.println("</div>");
          client.println("</body>");
          client.println("</head>");

          delay(1);
          client.stop();
        }
      }
    }
  }
}
