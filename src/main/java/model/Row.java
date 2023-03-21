package model;

import java.util.ArrayList;

public class Row
{
    ArrayList<Seat> seats = new ArrayList<Seat>();

    public Seat getSeat(int seatNumber)
    {
        return seats.get(seatNumber);
    }

    public Row()
    {

    }

    public Row(ArrayList<Seat> seats)
    {
        this.seats = seats;
    }

}