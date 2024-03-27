# Medidor de areas y perimetros para figuras

Por: **Kevin Alejandro Leal Torres** 

Al día: **Martes, 26 de marzo de 2024**

Para la materia: **Computación en Java**

---

## Resumen:

Este conjunto de programas es para calcular el area y el perimetro de un circulo, un cuadrado y un triangulo. Esto mediante una interfaz llamada Shape, que comparte los métodos getArea y getPerimeter.

### Shape.java

Esta interfaz sólo tiene declarada dos métodos:

```java
    public double getArea();
```
Que es para que se pueda calcular el area de alguna figura geometrica


```java
    public double getPerimeter();
```
Que es para que se pueda calcular el perimetro de alguna figura geometrica


### Circle.java

Esta clase contiene los métodos de ```Shape.java``` y, además, contiene los siguientes:

```java
private double radius;
```
Para calcular el area y perimetro de la figura

```java
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }
```
Método ya implemetado para obtener el area del circulo

```java
  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }
```
Método ya implementado para obtener el perimetro del circulo

### Square.java

Contiene la variable:

```java
private double side;
```
Para calcular area y perimetro del cuadrado

Y los métodos:

```java
    @Override
    public double getArea() {
        return side * side;
    }
```
Para conocer el area del cuadrado

```java
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
```
Para conocer el perimetro del cuadrado

### Triangle.java

Contiene las variables:
```java
private double sideA;
private double sideB;
private double sideC;
```
Que son los datos del triangulo para conocer area y perimetro

Y los métodos:

```java
  @Override
  public double getArea() {
    double s = (sideA + sideB + sideC) / 2;
    return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
  }
```
Para conocer el area del triangulo

```java
  @Override
  public double getPerimeter() {
    return sideA + sideB + sideC;
  }
```
Para conocer el perimetro del triangulo

