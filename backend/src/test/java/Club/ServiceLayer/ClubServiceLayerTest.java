package Club.ServiceLayer;

import com.dal.cs.backend.Club.ServiceLayer.ClubServiceLayer;
import com.dal.cs.backend.Club.ServiceLayer.IClubServiceLayer;
import com.dal.cs.backend.Club.ClassObject.Club;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class ClubServiceLayerTest
{
    private IClubServiceLayer iclubServiceLayer;

    @BeforeEach
    public void beforeTestRun() {
        iclubServiceLayer = new ClubServiceLayer() ;
    }
    @Test
    public void getAllClubCategoriesTest() {
        try {
            ArrayList<HashMap<String, String>> result = iclubServiceLayer.getAllClubCategories();
            System.out.println("result: \n" + result);
        }
        catch (Exception e) {
            fail("Test failed: Exception occured- "+e.getMessage());
        }
    }
    @Test
    public void getAllClubsTest()
    {
        List<Club> listOfAllClubs=iclubServiceLayer.getAllClubs();
        System.out.println(listOfAllClubs);
    }
}