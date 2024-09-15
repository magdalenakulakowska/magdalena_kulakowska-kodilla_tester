public class Color {
    public String selectColor() {
        String color = UserDialogs.getUserColorSelection();

        return switch (color) {
            case "R" -> "Red";
            case "G" -> "Green";
            case "B" -> "Blue";
            case "W" -> "White";
            case "P" -> "Purple";
            default -> "Wrong color selected.";
        };
    }
}
