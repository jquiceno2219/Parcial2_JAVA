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
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1.Add \n 2.Show List \n 3.Edit List \n 4.Delete \n 5.Exit");
            opt = s.next();
            switch(opt) {
                case "1": {

                    System.out.println("User Id: ");
                    Integer id = s.nextInt();

            }
        }
}