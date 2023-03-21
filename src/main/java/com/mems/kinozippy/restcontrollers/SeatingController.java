package com.mems.kinozippy.restcontrollers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class SeatingController
{
   /* public final void Mockup ()
    {
        Seat r1seat1 = new Seat("r1s1");
        Seat r1seat2 = new Seat("r1s2");
        Seat r2seat1 = new Seat("r2s1");
        Seat r2seat2 = new Seat("r2s2");
        ArrayList<Seat> seatsR1 = new ArrayList<Seat>();
        ArrayList<Seat> seatsR2 = new ArrayList<Seat>();
        seatsR1.add(r1seat1);
        seatsR1.add(r1seat2);
        seatsR1.add(r2seat1);
        seatsR1.add(r2seat2);

        Row r1 = new Row(seatsR1);
        Row r2 = new Row(seatsR2);
        ArrayList<Row> rows = new ArrayList<Row>();
        rows.add(r1);
        rows.add(r2);
        TheaterRoom room1 = new TheaterRoom(rows);
        databaseMockUp.add(room1);
    }

    private final ArrayList<TheaterRoom> databaseMockUp = new ArrayList<TheaterRoom>();

    @GetMapping("/cinema")
    public String seatsList () throws JsonProcessingException
    {
        Mockup();

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(databaseMockUp);

        return json;
    }*/

    @GetMapping("/cinema/{room}/{row}/{seat}")
    public String seatsGet (@PathVariable int room,@PathVariable int row,@PathVariable int seat) throws JsonProcessingException
    {
        //Mockup(); dette skal være data fra databasen
        //dette skal være databasen
        //Seat selectedSeat = databaseMockUp.get(room).getRow(row).getSeat(seat);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString("");


        return json;
    }
}
