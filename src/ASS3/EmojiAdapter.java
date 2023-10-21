package ASS3;

public class EmojiAdapter implements ModernEmoji{
    private OldEmoji oldEmoji;

    public EmojiAdapter(OldEmoji oldEmoji) {
        this.oldEmoji = oldEmoji;
    }

    @Override
    public String getModernEmoji() {
        String oldEmoj = oldEmoji.getOldEmoji();
        if (":-)".equals(oldEmoji)){
            oldEmoj = "\uD83D\uDE42";
        }
        return oldEmoj;
    }
}
