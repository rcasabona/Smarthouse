#include "DHT.h"

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
    Serial.print("Umidade: ");
    Serial.print(h);
    Serial.print(" %t");
    Serial.print("Temperatura: ");
    Serial.print(t);
    Serial.println(" *C");
  }
}
