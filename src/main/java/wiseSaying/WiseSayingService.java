package wiseSaying;

import java.util.ArrayList;

public class WiseSayingService {

    private final WiseSayingRepository wiseSayingRepository;

    public WiseSayingService(WiseSayingRepository wiseSayingMemRepository) {
        this.wiseSayingRepository = wiseSayingMemRepository;
    }

    public WiseSaying findById(int targetId) {
        return wiseSayingRepository.findById(targetId);
    }

    public void update(WiseSaying wiseSaying, String newContent, String newAuthor) {

        wiseSaying.setContent(newContent);
        wiseSaying.setAuthor(newAuthor);

        wiseSayingRepository.update(wiseSaying);
    }

    public WiseSaying add(String content, String author) {
        return wiseSayingRepository.add(content, author);
    }

    public ArrayList<WiseSaying> findAll() {
        return wiseSayingRepository.findAll();
    }

    public void remove(WiseSaying wiseSaying) {
        wiseSayingRepository.remove(wiseSaying);
    }
}