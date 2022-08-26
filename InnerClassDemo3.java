package adprogram;

class ComputerClass {
    double price;



   class Processor {
        double getCatche() {
            return 7.8;
        }
        
        class Storage {
            String storagetype;
            int storageSize;
            float getStorageSize() {
                return 135.5f;
            }
            String getStorageType() {
                return "HDD";
            }
            
        }
    }


   protected class Ram {
        double getClockSpeed() {
            return 5.9;
        }
    }



}

public class InnerClassDemo3 {
    public static void main(String[] args) {
        // Create object for Computer class
        ComputerClass cpu = new ComputerClass();
        // create object for processor
        ComputerClass.Processor processor = cpu.new Processor();
        // create object for ram
        ComputerClass.Ram ram = cpu.new Ram();
        System.out.println(ram.getClockSpeed());
        
        // create object for storage
        ComputerClass.Processor.Storage storage = processor.new Storage();
        System.out.println(storage.getStorageSize());
    }



}
