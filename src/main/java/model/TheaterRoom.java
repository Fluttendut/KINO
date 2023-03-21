package model;

import java.util.ArrayList;

public class TheaterRoom
{
    public ArrayList<Row> rows = new ArrayList<Row>();

    public TheaterRoom()
    {

    }

    public TheaterRoom(ArrayList<Row> rows)
    {
        this.rows = rows;
    }

    public Row getRow(int rowNumber)
    {
        return rows.get(rowNumber);
    }
}
