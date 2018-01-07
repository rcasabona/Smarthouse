#include "DHT.h"
#include <ArduinoJson.h>

#define DHTPIN A1 // pino conectado ao sensor de temperatura
#define DHTTYPE DHT11 // DHT 11

DHT dht(DHTPIN, DHTTYPE);

// int pinopir = 7; //Pino ligado ao sensor PIR
// int acionamento; //Variavel para guardar valor do sensor

void setup()
{
//  pinMode(pinopir, INPUT); //Define pino sensor como entrada
  Serial.begin(9600);
  dht.begin();
}

void loop()
{
  //  acionamento = digitalRead(pinopir); //Le o valor do sensor PIR
  //
  //  if (acionamento == LOW) //Sem movimento, mantem rele desligado
  //  {
  //    Serial.println("Parado");
  //  }
  //  else //Caso seja detectado um movimento, aciona o rele
  //  {
  //    Serial.println("Movimento !!!");
  //  }

  float h = dht.readHumidity();
  float t = dht.readTemperature();

  // testa se retorno é valido, caso contrário algo está errado.
  if (isnan(t) || isnan(h))
  {
    Serial.println("Failed to read from DHT");
  }
  else
  {

    // Step 2
    StaticJsonBuffer<200> jsonBuffer;
  
    // Step 3
    JsonObject& root = jsonBuffer.createObject();
    JsonObject& jsonLeituraAmbiente = jsonBuffer.createObject();
//    JsonObject& ambiente = root.createNesteObject("ambiente");

    root["jsonLeituraAmbiente"] = jsonLeituraAmbiente;
    jsonLeituraAmbiente["ambiente"] = h;
    jsonLeituraAmbiente["temperatura"] = t;

//    // Temperatura Ambiente
//    JsonArray& data = root.createNestedArray("temperaturaAmbiente");
//    data.add(48.756080);
//    data.add(2.302038);
  
    // Step 4
    root.printTo(Serial);
    Serial.println();
//    root.prettyPrintTo(Serial);
    delay(2000);

     
//    Serial.print("Umidade: ");
//    Serial.print(h);
//    Serial.print(" %t");
//    Serial.print("Temperatura: ");
//    Serial.print(t);
//    Serial.println(" *C");
  }
}
