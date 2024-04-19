package ac.su.ajaxspringinclass.controller;

import ac.su.ajaxspringinclass.domain.Bookmark;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookmarkAjaxRestController {

    private List<Bookmark> bookmarks = new ArrayList<>();

//    @RequestMapping(method = RequestMethod.POST, path = "/bookmarks")
    @PostMapping("/bookmarks")
    public String registerBookmark(@RequestBody Bookmark bookmark) {
        bookmarks.add(bookmark);
        return "registered";  // 생성된 객체를 그대로 반환하는 형태도 가능 (status 201)
    }

//    @RequestMapping(method = RequestMethod.GET, path = "/bookmarks")
    @GetMapping("/bookmarks")
    public List<Bookmark> getBookmarks() {
        return bookmarks; // (status 200)
    }

}