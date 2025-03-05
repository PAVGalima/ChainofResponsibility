public class OrganicWasteCollector extends WasteCollector{
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic")) {
            System.out.println("Organic waste collected and composted.");
        } else {
            super.collectWaste(container);
        }
    }

}
