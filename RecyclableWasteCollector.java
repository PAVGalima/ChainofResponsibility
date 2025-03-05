public class RecyclableWasteCollector extends WasteCollector{
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Recyclable waste collected and sent for recycling.");
        } else {
            super.collectWaste(container);
        }
    }
}
