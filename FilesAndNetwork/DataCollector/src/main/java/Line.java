public class Line {
    private String lineName;
    private String lineNumber;

    public Line(String lineName, String lineNumber) {

        this.lineName = lineName;
        this.lineNumber = lineNumber;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }


    public String toString() {
        return "Название линии:" + lineName + "\n" + "Номер линии:" + lineNumber;
    }

}
