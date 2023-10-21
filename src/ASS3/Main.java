package ASS3;

public class Main {
    public static void main(String[] args) {
        OldEmoji oldEmoji = new OldEmojiImpl(":-)");
        ModernEmoji modernEmoji = new EmojiAdapter(oldEmoji);

        System.out.println("Conversion using adapter \nfrom " + oldEmoji.getOldEmoji() + "\nto " + modernEmoji.getModernEmoji() + " -> let's pretend there is a smile face");
    }
}
