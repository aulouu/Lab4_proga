package Moves;
import Moves.LocationForPerson;

public interface Location {
    void changeLoc(LocationForPerson e);
    LocationForPerson getLoc();
}
