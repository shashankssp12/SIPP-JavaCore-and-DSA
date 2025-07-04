

class ParcelStage {
    String stageName;
    ParcelStage next;

    ParcelStage(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
}

public class ParcelTracker {
    private ParcelStage head;

    // Add stage at the end
    public void addStage(String stageName) {
        ParcelStage newStage = new ParcelStage(stageName);
        if (head == null) {
            head = newStage;
            return;
        }
        ParcelStage current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newStage;
    }

    // Add a checkpoint after a specific stage
    public void addCheckpointAfter(String existingStage, String newStage) {
        ParcelStage current = head;
        while (current != null && !current.stageName.equals(existingStage)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Stage '" + existingStage + "' not found.");
            return;
        }

        ParcelStage checkpoint = new ParcelStage(newStage);
        checkpoint.next = current.next;
        current.next = checkpoint;
    }

    // Simulate a lost parcel by breaking the link after a certain stage
    public void simulateLostParcel(String afterStage) {
        ParcelStage current = head;
        while (current != null && !current.stageName.equals(afterStage)) {
            current = current.next;
        }

        if (current != null) {
            current.next = null;
            System.out.println("Parcel lost after '" + afterStage + "'");
        }
    }

    // Track parcel stages forward
    public void trackParcel() {
        if (head == null) {
            System.out.println("No parcel stages to track.");
            return;
        }

        ParcelStage current = head;
        while (current != null) {
            System.out.print(current.stageName + " → ");
            current = current.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker();

        // Add basic stages
        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        // Insert custom checkpoint
        tracker.addCheckpointAfter("Shipped", "Warehouse Scan");

        // Simulate tracking
        tracker.trackParcel(); // Output: Packed → Shipped → Warehouse Scan → In Transit → Delivered → END

        // Simulate lost parcel
        tracker.simulateLostParcel("In Transit");

        // Track again after loss
        tracker.trackParcel(); // Output: Packed → Shipped → Warehouse Scan → In Transit → END
    }
}