package com.hillel.hw11.Car.Implementation;

    abstract class AmphibianCar extends Car {
        private int propeller;


        public AmphibianCar(String typeOfEngine, String brand, int price,
                     int maxSpeed, int consumption) {

            super(typeOfEngine, brand, price, maxSpeed, consumption);
            this.propeller = propeller;
        }

        public int getPropeller() {
            return propeller;
        }

        public void setPropeller(int propeller) {
            this.propeller = propeller;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "typeOfEngine='" + typeOfEngine + '\'' +
                    ", brand='" + brand + '\'' +
                    ", price=" + getPrice() +
                    ", maxSpeed=" + getMaxSpeed() +
                    ", consumption=" + getConsumption() +
                    ", propeller =" + propeller +
                    '}';
        }
    }
