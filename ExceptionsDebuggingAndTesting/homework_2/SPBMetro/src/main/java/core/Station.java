package core;

public class Station implements Comparable<Station>
{
    private Line line;

    public Station(String name) {
        this.name = name;
    }

    private String name;
    private String numberLine;

    public Station(Line line, String name, String numberLine) {
        this.line = line;
        this.name = name;
        this.numberLine = numberLine;
    }


    public Line getLine()
    {
        return line;
    }

    public String getName()
    {
        return name;
    }

    public String getNumberLine() {
        return numberLine;
    }

    @Override
    public int compareTo(Station station)
    {
        int lineComparison = line.compareTo(station.getLine());
        if(lineComparison != 0) {
            return lineComparison;
        }
        return name.compareToIgnoreCase(station.getName());
    }

    @Override
    public boolean equals(Object obj)
    {
        return compareTo((Station) obj) == 0;
    }

    @Override
    public String toString()
    {
        return name;
    }
}