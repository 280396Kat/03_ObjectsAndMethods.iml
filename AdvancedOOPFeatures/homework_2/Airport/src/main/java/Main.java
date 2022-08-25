import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream()
                .filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE))
                .filter(flight -> convertDateToLocalDate(flight.getDate()).isBefore(LocalDateTime.now().plusHours(2)) &&
                                convertDateToLocalDate(flight.getDate()).isAfter(LocalDateTime.now())))
                                .collect(Collectors.toList());


        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.

    }
    private static LocalDateTime convertDateToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

}