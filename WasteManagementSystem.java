public class WasteManagementSystem {
    
    public static void main(String[] args) {

                System.out.println();
                // Create waste collectors
                WasteCollector organicCollector = new OrganicWasteCollector();
                WasteCollector recyclableCollector = new RecyclableWasteCollector();
                WasteCollector hazardousCollector = new HazardousWasteCollector();
                
                // Set up the chain
                organicCollector.setNextCollector(recyclableCollector);
                recyclableCollector.setNextCollector(hazardousCollector);
                
                // Sample waste containers
                WasteContainer organicWaste = new WasteContainer("organic", 10);
                WasteContainer recyclableWaste = new WasteContainer("recyclable", 20);
                WasteContainer hazardousWaste = new WasteContainer("hazardous", 5);
                WasteContainer unknownWaste = new WasteContainer("electronic", 15);
                
                // Trigger the waste collection process
                organicCollector.collectWaste(organicWaste);
                organicCollector.collectWaste(recyclableWaste);
                organicCollector.collectWaste(hazardousWaste);
                organicCollector.collectWaste(unknownWaste);
                System.out.println();
    
    }

}
