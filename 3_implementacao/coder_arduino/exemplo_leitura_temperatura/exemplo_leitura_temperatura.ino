const int IM35 = A1;
double temperatura;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);

}

void loop() {
  // put your main code here, to run repeatedly:
  temperatura = (double(analogRead(IM35))*5/(1023))/0.01;
  Serial.println(temperatura);
//  Serial.println(montaJson(temperatura));
  delay(2000);
}
// /dev/tty.usbmodem1421
// /dev/cu.usbmodem1421

//String montaJson(temperatura) {
//  String json = "{temperatura:" + temperatura + "}";
//  return json;
//}
