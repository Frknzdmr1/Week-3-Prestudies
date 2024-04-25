package computers;

public class Computer {
    private String manufacturerName;
    private int processorSpeedMhz;
    private int ramSize;
    private int numOfUSBPorts;
    private double screenSize;
    private String computerType;
    private boolean hasOS;
    private double purchasePrice;
    private double sellingPrice;

    // default constructor
    public Computer(){
    }

    // second constructor
    public Computer(String manufacturerName, double screenSize, boolean hasOs){
        this.manufacturerName = manufacturerName;
        this.screenSize = screenSize;
        this.hasOS = hasOs;
    }

    // third constructor
    public Computer(String manufacturerName, int processorSpeedMhz, int ramSize, int numOfUSBPorts, double screenSize, String computerType, boolean hasOS) {
        this.manufacturerName = manufacturerName;
        this.processorSpeedMhz = processorSpeedMhz;
        this.ramSize = ramSize;
        this.numOfUSBPorts = numOfUSBPorts;
        this.screenSize = screenSize;
        this.computerType = computerType;
        this.hasOS = hasOS;
    }

    public double calculateProfit(){
        return this.sellingPrice - this.purchasePrice;
    }

    public String toString(){
        return "Computer properties: \n" +
                "Manufacturer: " + manufacturerName + "\n" +
                "Processor: " + processorSpeedMhz + "\n"+
                "Ram size in GB: " + ramSize + "\n" +
                "USB ports: " + numOfUSBPorts + "\n" +
                "Screen size: " + screenSize + "\n" +
                "Computer type: " + computerType + "\n" +
                "Has OS: " + hasOS + "\n";
    }

    // getters and setters
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getProcessorSpeedMhz() {
        return processorSpeedMhz;
    }

    public void setProcessorSpeedMhz(int processorSpeedMhz) {
        this.processorSpeedMhz = processorSpeedMhz;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getNumOfUSBPorts() {
        return numOfUSBPorts;
    }

    public void setNumOfUSBPorts(int numOfUSBPorts) {
        this.numOfUSBPorts = numOfUSBPorts;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public boolean isHasOS() {
        return hasOS;
    }

    public void setHasOS(boolean hasOS) {
        this.hasOS = hasOS;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
