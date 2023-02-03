import java.util.Set;

public class CDPlayer {
    private CD cd;

    private final Set<CD> cds;
    private final Playlist playlist;
    public CDPlayer(Set<CD> cds, Playlist playlist) {
        this.cds = cds;
        this.playlist = playlist;
    }
}