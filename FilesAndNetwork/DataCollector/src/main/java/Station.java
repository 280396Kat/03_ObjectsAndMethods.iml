public class Station {

    private String stationName;
    private String lineNumber;

    public Station(String stationName, String lineNumber) {
        this.stationName = stationName;
        this.lineNumber = lineNumber;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String toString() {
        return "Название станции:" + stationName + "\n" + "Номер линии:" + lineNumber;
    }
}
