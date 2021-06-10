package com.challenge.M2ChallengeKittendorfDale.controller;


import com.challenge.M2ChallengeKittendorfDale.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {
    Random random = new Random();

    public static List <Answer> answerList = new ArrayList <> (Arrays.asList(
            new Answer (1, "",
                    "It is Certain."),
            new Answer (2, "",
                     "It is decidedly so."),
             new Answer (3, "",
                     "Better not tell you now."),
            new Answer (4, "",
                    " Reply hazy, try again.")

    ));


//    @GetMapping (value ="/question")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Answer getAnswer() {@PathVariable Answer question)
//        Answer newAnswer = new Answer();
//        Question newQuestion = new question();
//
//        int randomAnswerIndex = random.nextInt(answerList.size());
//        Answer randomAnswer = answerList.get(randomAnswerIndex);
//
//        Answer.setQuestion(question));
//
//        return Answer;
//
//    }
}
//- Magic 8-ball API:
//  - URI: /magic
//  - Method: POST
//  - Request Body: question
//  - Response Body: Answer
//- Answer Object instance variables:
//  - id
//  - question
//  - answer