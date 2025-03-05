public class HazardousWasteCollector extends WasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous")) {
            System.out.println("Hazardous waste collected and disposed of safely.");
        } else {
            super.collectWaste(container);
        }
    }
}
