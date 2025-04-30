package internship.week6.algorithm;

import java.util.ArrayList;
import java.util.List;

public class InterfaceChallenge {

    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Sydney Town Hall ", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House ",
                UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Nigeria ", UsageType.SPORT));

        mappables.add(new UtilityLine("Drip College", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Drip Olympic Blvd", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}
