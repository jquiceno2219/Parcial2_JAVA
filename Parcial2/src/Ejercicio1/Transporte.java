package Ejercicio1;

public enum Transporte {
    BUS (25, "Motor grande"){
        @Override
        public String mostrarDescripcion() {
            return "\nEl bus es un medio de transporte que puede trasladar" +
                    "a numerosos pasajeros de manera simultánea y que realiza un recorrido fijo. Permite transportar "+getCapacidad()+
                    " pasajeros y tiene un motor: "+getTipoMotor();
        }
    },
    TREN (69, "Motor de Carbón"){
        @Override
        public String mostrarDescripcion() {
            return "\nLos trenes son un tipo de vehículo ferroviario que cuenta con vagones y una locomotora. " +
                    "El tren se utiliza tanto para el transporte de mercancías como de pasajeros y, en líneas generales, contamina muy poco. " +
                    "Permiten transportar hasta: "+getCapacidad()+
                    " pasajeros y tiene un motor: "+getTipoMotor();
        }
    },
    BARCO (300, "Motor a vapor"){
        @Override
        public String mostrarDescripcion() {
            return "\nConstrucción, de madera, metal u otro material, capaz de flotar en el agua y que se usa como medio de transporte.. " +
                    "Permiten transportar hasta: "+getCapacidad()+
                    " pasajeros y tiene un motor: "+getTipoMotor();
        }

    },
    MOTO (2, "V8"){
        @Override
        public String mostrarDescripcion() {
            return "\nVehículo de dos ruedas impulsado por un motor. " +
                    "Permiten transportar hasta: "+getCapacidad()+
                    " pasajeros y tiene un motor: "+getTipoMotor();
        }

    },
    AVIÓN (180, "Motor electrónico"){
        @Override
        public String mostrarDescripcion() {
            return "\nVehículo de transporte, provisto de alas y uno o varios motores, capaz de desplazarse por el aire. " +
                    "Permiten transportar hasta: "+getCapacidad()+
                    " pasajeros y tiene un motor: "+getTipoMotor();
        }

    };

    private int capacidad;
    private String tipoDeMotor;
    Transporte(int capacidad, String tipoDeMotor) {
        this.capacidad = capacidad;
        this.tipoDeMotor = tipoDeMotor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipoMotor() {
        return tipoDeMotor;
    }

    public String mostrarDescripcion() {
        return "Default";
    }
}