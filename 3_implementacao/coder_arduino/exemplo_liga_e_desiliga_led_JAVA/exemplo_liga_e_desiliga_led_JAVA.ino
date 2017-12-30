int led = 2;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(led, OUTPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  char serial = Serial.read();

  if(serial == 'l')
  {
    Serial.print("Ligado");
//    digitalWrite(led, HIGH);

  } else if (serial == 'd')
  {
    Serial.print("Desligado");
//    digitalWrite(led, LOW);
  }

}
