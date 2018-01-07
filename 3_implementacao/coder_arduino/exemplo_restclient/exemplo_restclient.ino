#include <Ethernet.h>
#include <SPI.h>
#include "RestClient.h"

//Definicoes de IP, mascara de rede e gateway
byte mac[] = {0xDE, 0xA2, 0xBE, 0xEF, 0xFE, 0xED};
IPAddress ip(192,168,0,51);          // Define o endereco IP
IPAddress gateway(192,168,0,1);      // Define o gateway
IPAddress subnet(255,255,255,0);  // Define a máscara de rede

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  Ethernet.begin(mac, ip);

  server.begin();
  Serial.print("My IP address: ");
  Serial.println(Ethernet.localIP());
}

void loop() {
  // put your main code here, to run repeatedly:

}
