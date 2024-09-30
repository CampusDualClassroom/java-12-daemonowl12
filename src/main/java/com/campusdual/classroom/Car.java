package com.campusdual.classroom;

public class Car {

    int tachometer = 0;
    int speedometer = 0;
    final int MAX_SPEED = 120;
    int wheelsAngle = 0;
    String gear = "N";
    private boolean isRunning = false;
    private boolean reverse = false;

    public Car() {
    }

    public Car(String toyota, String corolla, String gasoline) {
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void start() {
        if (!isRunning) {

            this.tachometer = 1000;
            isRunning = true;
            System.out.println("Vehículo encendido");

        } else {
            System.out.println("El vehículo ya está encendido");

        }
    }

    public void stop() {
        if (this.speedometer == 0 && isRunning) {

            this.tachometer = 0;
            isRunning = false;
            System.out.println("Vehículo apagado");

        } else if (this.speedometer > 0) {
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido");

        } else {
            System.out.println("El vehículo ya está apagado");

        }
    }

    public void accelerate() {
        if (isRunning) {
            if (this.speedometer + 5 <= MAX_SPEED) {
                this.speedometer += 5;
                this.tachometer += 500;
                System.out.println("El vehículo acelera a " + this.speedometer + " km/h.");
            } else {
                this.speedometer = MAX_SPEED;
                System.out.println("No se puede superar la velocidad máxima de " + MAX_SPEED + " km/h.");
            }
        } else {
            System.out.println("El vehículo debe estar encendido para acelerar.");
        }
    }

    public void brake() {
        if (this.speedometer - 5 >= 0) {
            this.speedometer -= 5;
            this.tachometer -= 500;
            System.out.println("El vehículo frena a " + this.speedometer + " km/h.");
        } else {
            this.speedometer = 0;
            this.tachometer = 1000;
            System.out.println("El vehículo está detenido.");
        }
    }

    public void setReverse(Boolean reverse){
        if (this.speedometer == 0) {
            this.reverse = reverse;
            if (reverse) {
                this.gear = "R";
                System.out.println("El coche está en marcha atrás.");
            } else {
                this.gear = "N";
            }
        } else {
            System.out.println("No se puede poner marcha atrás mientras el coche está en movimiento.");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle >= -45 && angle <= 45) {
            this.wheelsAngle = angle;
            System.out.println("El volante se gira a " + this.wheelsAngle + " grados.");
        } else if (angle > 45) {
            this.wheelsAngle = 45;
            System.out.println("El volante se gira al máximo permitido: 45 grados.");
        } else {
            this.wheelsAngle = -45;
            System.out.println("El volante se gira al mínimo permitido: -45 grados.");
        }
    }

}
