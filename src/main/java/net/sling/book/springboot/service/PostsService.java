package net.sling.book.springboot.service;

import lombok.RequiredArgsConstructor;
import net.sling.book.springboot.domain.posts.PostsRepository;
import net.sling.book.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
