public class CharacterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char o = scanner.next().charAt(0);
        
        if (Character.isLetter(o)) {
            System.out.println(o + " is an alphabet.");
        } else if (Character.isDigit(o)) {
            System.out.println(o + " is a number.");
        } else {
            System.out.println(o + " is a special character.");
        }   
        
        scanner.close();
    }
} 