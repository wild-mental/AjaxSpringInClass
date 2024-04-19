package ac.su.ajaxspringinclass.domain;

import lombok.Getter;

@Getter
public class BookmarkDTO {
    private Long id;
    private String name;
    private String url;

    public BookmarkDTO() {}

    private BookmarkDTO(Bookmark bookmark) {
        this.id = bookmark.getId();
        this.name = bookmark.getName();
        this.url = bookmark.getUrl();
    }

    public static BookmarkDTO fromEntity(Bookmark bookmark) {
        return new BookmarkDTO(bookmark);
    }

    public Bookmark toEntity() {
        Bookmark bookmark = new Bookmark();
        bookmark.setId(this.id);
        bookmark.setName(this.name);
        bookmark.setUrl(this.url);
        return bookmark;
    }
}
