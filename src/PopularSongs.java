public class PopularSongs {
    private String name;
    private String author;
    private String time;

    public PopularSongs(String name, String author, String time) {
        this.name = name;
        this.author = author;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Название: " + name +
                "Автор: " + author + time ;
    }
}
