package Ejercicio2.Repository;
import Ejercicio2.Model.FuelPoints;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FuelPointsRepoImpl implements FuelPointsRepository {
private List<FuelPoints> fuelPointsList;

public FuelPointsRempoImpl() throws IOException, ClassNotFoundException{
fuelPointsList = new ArrayList<>();
}

    @Override
    public FuelPoints findById(int id) {
        return fuelPointsList.stream()
        .filter(FuelPoints -> FuelPoints.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<FuelPoints> findAll() throws IOException, ClassNotFoundException {
    fuelPointsList = (List<FuelPoints>) FuelPointsSerializer.readObjectFromFile("fuelPoints.ax");
    return fuelPointsList;
}

    @Override
    public void save(FuelPoints fuelPoints) throws IOException{
        this.fuelPointsList.add(fuelPoints);
        FuelPointsSerializer.writeObjectToFile(this.fuelPointsList, "fuelPoints.ax");
    }

    @Override
    public void update(FuelPoints fuelPoints) throws IOException{
        FuelPoints oldFuel = findById(fuelPoints.getId());
        if (oldFuel != null) {
            fuelPointsList.remove(oldFuel);
            fuelPointsList.add(fuelPoints);
        }
    }

    @Override
    public void delete(FuelPoints fuelPoints) throws IOException{
        this.fuelPointsList.remove(fuelPoints);
        FuelPointsSerializer.writeObjectToFile(this.fuelPointsList, "fuelPoints.ax");
    }
}
