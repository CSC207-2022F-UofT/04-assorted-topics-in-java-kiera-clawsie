/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }


    public boolean addDrivable(String id, Drivable object) {
        if (!this.drivable_map.containsKey(id)) {
            this.drivable_map.put(id, object);
            return true;
        } else {
            return false;
        }
    }

    public boolean hasFasterThan(int speed) {
        for (Drivable object : this.drivable_map.values()) {
            if (object.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }

    public List<Tradable> getTradable() {
        ArrayList<Tradable> tradableSoFar = new ArrayList<Tradable>();
        for (Drivable object : this.drivable_map.values()) {
            if (object instanceof Tradable) {
                tradableSoFar.add(((Tradable) object));
            }
        }
        return tradableSoFar;
    }



    
}