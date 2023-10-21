package ASS3;

public class OldEmojiImpl implements OldEmoji{
    private String emoji;

    public OldEmojiImpl(String emoji) {
        this.emoji = emoji;
    }

    @Override
    public String getOldEmoji() {
        return emoji;
    }
}
