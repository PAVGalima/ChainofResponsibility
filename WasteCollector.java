public abstract class WasteCollector {
    protected WasteCollector nextCollector;
    
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }
    
    public void collectWaste(WasteContainer container) {
        if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No collector available for: " + container.getType());
        }
    }
}
