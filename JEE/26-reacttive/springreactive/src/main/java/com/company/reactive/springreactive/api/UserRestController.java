package com.company.reactive.springreactive.api;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class UserRestController {
    
    private String[] speech = { "Well,", "you", "were", "born;", "here", "you", "came,", "something", "like", "fifteen",
            "years", "ago,", "and", "though", "your", "father", "and", "mother", "and", "grandmother,", "looking",
            "about", "the", "streets", "through", "which", "they", "were", "carrying", "you,", "staring", "at", "the",
            "walls", "into", "which", "they", "brought", "you,", "had", "every", "reason", "to", "be", "heavy-hearted,",
            "yet", "they", "were", "not,", "for", "here", "you", "were,", "big", "James,", "named", "for", "me.", "You",
            "were", "a", "big", "baby.", "I", "was", "not.", "Here", "you", "were", "to", "be", "loved.", "To", "be",
            "loved,", "baby,", "hard", "at", "once", "and", "forever", "to", "strengthen", "you", "against", "the",
            "loveless", "world.", "Remember", "that.", "I", "know", "how", "black", "it", "looks", "today", "for",
            "you.", "It", "looked", "black", "that", "day", "too.", "Yes,", "we", "were", "trembling.", "We", "have",
            "not", "stopped", "trembling", "yet,", "but", "if", "we", "had", "not", "loved", "each", "other,", "none",
            "of", "us", "would", "have", "survived,", "and", "now", "you", "must", "survive", "because", "we", "love",
            "you", "and", "for", "the", "sake", "of", "your", "children", "and", "your", "children's", "children.", };

    @GetMapping(value = "/speech", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> getSpeech() {
        return Flux.fromArray(speech)
                    .delayElements(Duration.ofSeconds(1))
                    .repeat()
                    .log();
    }
}
