Smarthouse
===========================================

Projeto para transformar residencias simples em casas inteligentes

# Conteúdo
- Integração Arduino com JAVA
  - [Integração com MAC] (#integração-com-mac)
  - [Montando JSON] (#montando-json)

## Integração com MAC
Utilize a integração com MAC neste endereço: http://playground.arduino.cc/Interfacing/Java
No mac é necessário:

```bash
sudo mkdir /var/lock
sudo chmod go+rwx /var/lock
```

## Montando JSON
https://github.com/bblanchon/ArduinoJson

## Descrição do projeto
O projeto é básiado em micro-serviços, as aplicações se comunicam através do protocolo HTTP, REST. O projeto smarthouse-multimodele mapeia todos os projetos que utilizam o projeto model-module. O projeto model-module contém as entitys comuns a todos os projetos.

O projeto core-arduino contem a chamada ao Arduino, então todos os projetos deverão acessar compenentes internos do Arduino através do core-arduino.