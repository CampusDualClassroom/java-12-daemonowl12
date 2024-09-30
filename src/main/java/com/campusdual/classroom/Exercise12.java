package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla", "Gasoline");

        // Tacometro a 0
        System.out.println("¿Tacómetro en cero?: " + myCar.isTachometerEqualToZero());

        // Encender el coche comprobando el valor correcto del tacómetro
        myCar.start();

        // Encender coche cuando ya esta encendido
        myCar.start();

        // Apagar el coche comprobando que el valor del tacómetro es correcto
        myCar.stop();

        // Apagar el coche mientras todavía está en movimiento
        myCar.start();
        myCar.accelerate();
        myCar.stop();

        // Acelerar el coche
        myCar.accelerate();
        System.out.println("Velocidad actual: " + myCar.speedometer + " km/h");

        // Acelerar hasta intentar superar la velocidad máxima
        for (int i = 0; i < 30; i++) {
            myCar.accelerate();
        }
        System.out.println("Velocidad después de intentar superar el máximo: " + myCar.speedometer + " km/h");

        // Frenar la velocidad
        myCar.brake();
        System.out.println("Velocidad después de frenar: " + myCar.speedometer + " km/h");

        // Frenar hasta un valor negativo
        for (int i = 0; i < 10; i++) {
            myCar.brake();
        }
        System.out.println("Velocidad después de intentar frenar a un valor negativo: " + myCar.speedometer + " km/h");

        // Girar el volante 20 grados
        myCar.turnAngleOfWheels(20);
        System.out.println("Ángulo del volante: " + myCar.wheelsAngle + " grados");

        // Girar el volante más de 45 grados ó -45 grados
        myCar.turnAngleOfWheels(50);
        System.out.println("Ángulo del volante después de intentar girar más de 45 grados: " + myCar.wheelsAngle + " grados");
        myCar.turnAngleOfWheels(-50);
        System.out.println("Ángulo del volante después de intentar girar menos de -45 grados: " + myCar.wheelsAngle + " grados");

        // Detener el coche y poner marcha atrás
        myCar.brake();
        myCar.setReverse(true);
        System.out.println("Marcha actual: " + myCar.gear);

        // Poner marcha atrás mientras el coche está en movimiento marcha adelante
        myCar.setReverse(false);
        myCar.accelerate();
        myCar.setReverse(true);
        System.out.println("Marcha actual después de intentar cambiar a reversa en movimiento: " + myCar.gear);
    }

}