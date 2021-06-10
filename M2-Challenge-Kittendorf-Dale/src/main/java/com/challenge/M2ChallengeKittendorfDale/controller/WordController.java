package com.challenge.M2ChallengeKittendorfDale.controller;

import com.challenge.M2ChallengeKittendorfDale.models.Quote;
import com.challenge.M2ChallengeKittendorfDale.models.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    Random random = new Random();

    private static List<Word> wordList= new ArrayList<>(Arrays.asList(
            new Word(1,
                    "Lexiphanes",
                    "One who uses words pretentiously."),
            new Word (2,
                    "Wiseacre",
                    "One who pretends to knowledge or cleverness; a would-be wise person; a smart aleck."),
            new Word (3,
                    "Transcendental",
                    "Relating to a spiritual or nonphysical realm."),
            new Word (4,
                    "Matrix",
                    "Something within or from which something else originates, develops, or takes form."),
            new Word (5,
                    "Vector",
                    "A one-dimensional array data structure."),
            new Word(6,
                    "Proton",
                    "A stable subatomic particle occurring in all atomic nuclei, with a positive electric charge equal in magnitude to that of an electron, but of opposite sign."),
            new Word (7,
                    "Dystopia",
                    "An imagined state or society in which there is great suffering or injustice, typically one that is totalitarian or post-apocalyptic."),
            new Word (8,
                    "Ensorcell",
                    "To cast a spell, enchant; to captivate."),
            new Word (9,
                    "Susurrus",
                    "A whispering or rustling sound."),
            new Word (10,
                    "Nova",
                    "A transient astronomical event that causes the sudden appearance of a bright, apparently new star, that slowly fades over several weeks or many months.")



    ));

    @GetMapping(value = "/word")
    @ResponseStatus(HttpStatus.OK)
    public Word getWord() {
        Word newWord = new Word();

        int randomWordIndex = random.nextInt(wordList.size());
       Word randomWord = wordList.get(randomWordIndex);
        System.out.println(randomWord);


        return randomWord;
    };

}

//- Word API
//  - URI: /word
//  - Method: GET
//  - Request Body: None
//  - Response Body: Definition
//- Definition Object instance variables:
//  - id
//  - word
//  - definition
