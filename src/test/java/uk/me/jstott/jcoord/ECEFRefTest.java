package uk.me.jstott.jcoord;

import org.junit.Test;
import uk.me.jstott.jcoord.ECEFRef;
import uk.me.jstott.jcoord.LatLng;

import static org.junit.Assert.assertEquals;

/**
 * ECEFRef unit tests.
 * (c) 2006 Jonathan Stott
 * Created on 02-Apr-2006
 *
 * @author Jonathan Stott
 * @version 1.1
 * @since 1.1
 */
public class ECEFRefTest {

  /*
   * Test for 'uk.me.jstott.jcoord.ECEFRef(LatLng)'
   */
  @Test
  public void testLatLngConstructor() {
    LatLng ll = new LatLng(52.65716468040487, 1.7197915435025186, 0.0);
    ECEFRef ecef = new ECEFRef(ll);
    assertEquals(3875333.7837, ecef.getX(), 0.01);
    assertEquals(116357.0618, ecef.getY(), 0.01);
    assertEquals(5047492.1819, ecef.getZ(), 0.01);
  }


  /*
   * Test for 'uk.me.jstott.jcoord.ECEFRef.toLatLng()'
   */
  @Test
  public void testToLatLng() {
    ECEFRef ecef = new ECEFRef(3875333.7837, 116357.0618, 5047492.1819);
    LatLng ll = ecef.toLatLng();
    assertEquals(52.65716468040487, ll.getLatitude(), 0.001);
    assertEquals(1.7197915435025186, ll.getLongitude(), 0.001);
    assertEquals(0.0, ll.getHeight(), 0.001);
  }

}
