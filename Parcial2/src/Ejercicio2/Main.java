package Ejercicio2;
import Ejercicio2.Model.FuelPoints;
import Ejercicio2.Repository.FuelPointsRepoImpl;
import Ejercicio2.Repository.FuelPointsRepository;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opt = "1";
        FuelPointsRepository fuelPoints = new FuelPointsRepoImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Welcome To the Menu: \n 1.Add \n 2.Show List \n 3.Edit List \n 4.Delete \n 5.Exit");
            opt = s.next();
            switch (opt) {
                case "1": {

                    System.out.println("User Id: ");
                    int id = s.nextInt();
                    System.out.println("User name: ");
                    String clientName = s.next();
                    System.out.println("Price of fuel: ");
                    int fuelPrice = s.nextInt();
                    System.out.println("Total pts.: ");
                    int ptsAccum = s.nextInt();
                    fuelPoints.save(new FuelPoints(id, clientName, fuelPrice, ptsAccum));
                    ;
                    break;

                }
                case "2": {
                    List<FuelPoints> fuelPoints1 = fuelPoints.findAll();
                    fuelPoints1.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("=====Edit=====");
                    System.out.println("Id: ");
                    int id = s.nextInt();
                    System.out.println("Client Name: ");
                    String clientName = s.next();
                    System.out.println("Fuel Price: ");
                    int fuelPrice = s.nextInt();
                    System.out.println("Pts: ");
                    int ptsAccum = s.nextInt();
                    FuelPoints update = new FuelPoints(id, clientName, fuelPrice, ptsAccum);
                    fuelPoints.update(update);
                    break;
                }
                case "4": {
                    System.out.println("=====Delete=====");
                    System.out.println("Insert Id: ");
                    int id = s.nextInt();
                    fuelPoints.delete(fuelPoints.findById(id));
                    fuelPoints.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opt = "5";
                    break;
                }

            }
        }while (opt != "5") ;
    }
}