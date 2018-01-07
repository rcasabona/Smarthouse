int pinopir = 2;

void setup() {
  // put your setup code here, to run once:
  pinMode(pinopir, OUTPUT); //Define pino sensor como entrada
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(pinopir, HIGH);
  delay(1000);
  digitalWrite(pinopir, LOW);
  delay(1000);
}
