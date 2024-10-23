# Conversor de moneda
Este proyecto es un Conversor de Monedas que permite realizar conversiones entre diferentes monedas utilizando una API de tasas de cambio. El usuario puede elegir entre varias conversiones como USD a ARS, ARS a USD, USD a BRL, BRL a USD, USD a COP y COP a USD.

## Características
Conversión entre:
- Dólar estadounidense (USD) ↔ Peso argentino (ARS)
- Dólar estadounidense (USD) ↔ Real brasileño (BRL)
- Dólar estadounidense (USD) ↔ Peso colombiano (COP)

Integración con la API de Exchange Rate para obtener tasas de cambio actualizadas.

Manejo de errores cuando la API no responde correctamente o se introduce una opción inválida.

## Requisitos
Java 17 o superior.
Conexión a internet para acceder a la API de tasas de cambio.

## Ejemplo de uso

===== Conversor de Monedas =====
Seleccione la conversión que desea realizar:

--- Dólar (USD) ---
1. Dólar (USD) a Peso Argentino (ARS)
2. Peso Argentino (ARS) a Dólar (USD)
3. Dólar (USD) a Real Brasileño (BRL)
4. Real Brasileño (BRL) a Dólar (USD)
5. Dólar (USD) a Peso Colombiano (COP)
6. Peso Colombiano (COP) a Dólar (USD) 
7. Salir
===============================
Ingrese una opción: 5
Ingrese el monto a convertir: 500

================= Resultado de la Conversión=================
Monto original: 500,00 USD
Monto convertido: 2131585,40 COP
***********************************************************

## API Utilizada
Este proyecto utiliza la API de Exchange Rate para obtener tasas de cambio entre las distintas monedas soportadas. La estructura de respuesta de la API es la siguiente:
json
{
    "result": "success",
    "base_code": "USD",
    "target_code": "ARS",
    "conversion_rate": 983.8300
}

