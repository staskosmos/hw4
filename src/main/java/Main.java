public class Main {

        public static void main(String[] args) {

            Motorcycle ducatti = new Motorcycle("Ducatti Streetfighter V2", "153 л.с", 9500);
            Motorcycle kawasaki = new Motorcycle();
            kawasaki.setModel("kawasaki ninja");
            kawasaki.setPower("73 л. с.");
            kawasaki.setPrice(7000);

            System.out.println(ducatti);
            System.out.println(kawasaki);

            Car audi = new Car("Audi A6", 20000);
            Car bmw = new Car();
            bmw.setModel("BMW M2");
            bmw.setPrice(35000);

            System.out.println(audi);
            System.out.println(bmw);
        }
    }

