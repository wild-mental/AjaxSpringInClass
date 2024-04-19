package ac.su.ajaxspringinclass.service;

import ac.su.ajaxspringinclass.domain.Bookmark;
import ac.su.ajaxspringinclass.domain.BookmarkDTO;
import ac.su.ajaxspringinclass.repository.BookmarkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    public BookmarkService(BookmarkRepository bookmarkRepository) {
        this.bookmarkRepository = bookmarkRepository;
    }

    public void add(BookmarkDTO bookmarkDTO) {
        bookmarkRepository.save(bookmarkDTO.toEntity());
    }

    public List<BookmarkDTO> getAll() {
        List<Bookmark> allBookmarks = bookmarkRepository.findAll();
        return convBookmarkEntityToDTO(allBookmarks);
    }

    public List<BookmarkDTO> convBookmarkEntityToDTO(List<Bookmark> bookmarkList) {
        return bookmarkList.stream()
            .map(BookmarkDTO::fromEntity)
            .collect(Collectors.toList());
    }
}
