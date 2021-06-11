package com.challenge.M2ChallengeKittendorfDale.controller;


import com.challenge.M2ChallengeKittendorfDale.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.challenge.M2ChallengeKittendorfDale.models.Answer.*;

@RestController
public class AnswerController {
    Random random = new Random();

    public static List <Answer> answerList = new ArrayList <> (Arrays.asList(
            new Answer (1, "",
                    "It is Certain."),
            new Answer (2, "",
                     "It is decidedly so."),
            new Answer (3, "",
                     "Without a doubt."),
            new Answer (4, "",
                    " Yes definitely."),
            new Answer (5, "",
                    "You may rely on it."),
            new Answer (6, "",
                    " As I see it, yes."),
            new Answer (7, "",
                    " Most likely."),
            new Answer (8, "",
                    "Outlook good."),
            new Answer (9, "",
                    " Yes."),
            new Answer (10, "",
                    "Signs point to yes."),
            new Answer (11, "",
                    "Reply hazy, try again."),
            new Answer (12, "",
                    "Ask again later."),
            new Answer (13, "",
                    " Better not tell you now."),
            new Answer (14, "",
                    "Cannot predict now."),
            new Answer (15, "",
                    "Concentrate and ask again."),
            new Answer (16, "",
                    "Don't count on it."),
            new Answer (17, "",
                    "My reply is no."),
            new Answer (18, "",
                    " My sources say no."),
            new Answer (19, "",
                    "Outlook not so good."),
            new Answer (20, "",
                    "Very doubtful.")



    ));


    @PostMapping("/magic")
    @ResponseStatus(HttpStatus.OK)
    public Answer magicBall (@RequestBody String question)  {
        int randomAnswerIndex = random.nextInt(answerList.size());
        Answer randomAnswer = answerList.get(randomAnswerIndex);
      answerList.get(randomAnswerIndex).setQuestion(question.trim());
        System.out.println(answerList.get(randomAnswerIndex));
        return answerList.get(randomAnswerIndex);
    }
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