package Club.ServiceLayer;

import com.dal.cs.backend.Club.ClassObject.Club;
import com.dal.cs.backend.Club.ServiceLayer.ClubServiceLayer;
import com.dal.cs.backend.Club.ServiceLayer.IClubServiceLayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

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
    public void updateClubDetailsTest() {
        try {
            Club club = new Club();
            club.setClubID("CLB_1");
            club.setClubName("Dal & Kings Bike Society");
            club.setDescription("Enthusiastic club organising biking trips.");
            String result = iclubServiceLayer.updateClubDetails(club);
            System.out.println("result: " + result);
        }
        catch (Exception e) {
            fail("Test failed: Exception occured- "+e.getMessage());
        }
    }
}
