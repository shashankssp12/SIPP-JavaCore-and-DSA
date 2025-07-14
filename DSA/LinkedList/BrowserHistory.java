public class BrowserHistory {
    private java.util.LinkedList<String> history = new java.util.LinkedList<>();
    private int currentIndex = -1;

    // Encapsulation: history and currentIndex are private

    // Abstraction: navigation methods
    public void visit(String url) {
        // Removing forward history
        while (history.size() > currentIndex + 1) {
            history.removeLast();
        }
        history.add(url);
        currentIndex++;
    }

    public String back() {
        if (currentIndex > 0) {
            currentIndex--;
            return history.get(currentIndex);
        }
        return null; // No previous page
    }

    public String forward() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            return history.get(currentIndex);
        }
        return null; // No next page
    }

    public String getCurrentPage() {
        if (currentIndex >= 0 && currentIndex < history.size()) {
            return history.get(currentIndex);
        }
        return null;
    }
}