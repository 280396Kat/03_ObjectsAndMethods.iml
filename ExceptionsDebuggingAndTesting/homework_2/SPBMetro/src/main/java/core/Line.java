package core;

import java.util.ArrayList;
import java.util.List;

public class Line implements Comparable<Line>
{
    private String number;
    private String name;

    public Line(String number, String name)
    {
        this.number = number;
        this.name = name;
    }

    public String getNumber()
    {
        return number;
    }

    public String getName()
    {
        return name;
    }


    @Override
    public boolean equals(Object obj)
    {
        return compareTo((Line) obj) == 0;
    }

    @Override
    public int compareTo(Line line)
    {
        return Integer.compare(number, line.getNumber());
    }
}
