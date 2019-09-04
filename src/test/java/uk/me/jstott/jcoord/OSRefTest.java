package uk.me.jstott.jcoord;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import uk.me.jstott.jcoord.OSRef;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OSRefTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 55.00793350, -1.63509470, "NZ23336822" },
            { 55.00793350, -1.63509470, "NZ23336822" },
            { 55.27392830, -2.07162170, "NY95459776" },
            { 55.34695322, -2.46549256, "NT70480598" },
            { 55.07704000, -1.54471670, "NZ29067594" },
            { 55.54650170, -1.69597330, "NU19182813" },
            { 55.56885670, -1.64451170, "NU22413063" },
            { 55.05398170, -1.64884000, "NZ22437334" },
            { 55.14710372, -1.97922751, "NZ01328364" },
            { 55.33516630, -2.11948693, "NT92420457" },
            { 55.31509120, -1.55736380, "NU28080242" },
            { 55.31332170, -1.55670170, "NU28130223" }});
    }

    @Parameter
    public double lat;

    @Parameter(1)
    public double lng;

    @Parameter(2)
    public String expected;

    @Test
    public void testGetOsRefWithPrecisionOfEightDigits() {
        OSRef osRef = new uk.me.jstott.jcoord.LatLng(lat, lng).toOSRef();
        String actual = osRef.getOsRefWithPrecisionOf(OSRef.Precision.EIGHT_DIGITS);
        assertEquals(expected, actual);
    }
}
