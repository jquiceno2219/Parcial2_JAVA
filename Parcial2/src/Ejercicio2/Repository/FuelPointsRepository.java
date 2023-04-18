package Ejercicio2.Repository;
import Ejercicio2.Model.FuelPoints;

import java.util.List;
import java.io.IOException;

public interface FuelPointsRepository {

    FuelPoints findById(int id);
    List<FuelPoints> findAll() throws IOException, ClassNotFoundException;
    void save(FuelPoints fuelPoints) throws IOException;
    void update(FuelPoints fuelPoints) throws IOException;
    void delete(FuelPoints fuelPoints) throws IOException;
}


