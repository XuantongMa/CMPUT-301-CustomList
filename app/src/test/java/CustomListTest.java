import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS" ));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void hasCityTest(){
        City city = new City("Edmonton","AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest(){
        City city = new City("Edmonton","AB");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void countCitiesTest(){
        list.addCity(new City("Montreal","Quebec"));
        list.addCity(new City("Edmonton","Alberta"));
        int listSize = list.getCount();
        assertEquals(listSize, list.countCities());
    }
}
