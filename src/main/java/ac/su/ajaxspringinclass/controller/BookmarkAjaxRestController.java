package ac.su.ajaxspringinclass.controller;

import ac.su.ajaxspringinclass.domain.BookmarkDTO;
import ac.su.ajaxspringinclass.service.BookmarkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookmarkAjaxRestController {

    private final BookmarkService bookmarkService;

    public BookmarkAjaxRestController(BookmarkService bookmarkService) {
        this.bookmarkService = bookmarkService;
    }

    //    @RequestMapping(method = RequestMethod.POST, path = "/bookmarks")
    @PostMapping("/bookmarks")
    public String registerBookmark(@RequestBody BookmarkDTO bookmark) {
        bookmarkService.add(bookmark);
        return "registered";  // 생성된 객체를 그대로 반환하는 형태도 가능 (status 201)
    }

//    @RequestMapping(method = RequestMethod.GET, path = "/bookmarks")
    @GetMapping("/bookmarks")
    public List<BookmarkDTO> getBookmarks() {
        return bookmarkService.getAll(); // (status 200)
    }

}