public class Video implements AcoesVideo {
    private String title;
    private int review;
    private int views;
    private int likes;
    private boolean reproduzindo;

    public Video(String title) {
        this.likes = 0;
        this.review = 1;
        this.views = 0;
        this.reproduzindo = false;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Video{" +
                "likes=" + likes +
                ", title='" + title + '\'' +
                ", review=" + review +
                ", views=" + views +
                ", reproduzindo=" + reproduzindo +
                '}';
    }

    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setLikes(this.getLikes() + 1);
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        float newReview = (float) (this.getReview() + review) / this.getViews();

        this.review = (int) newReview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
