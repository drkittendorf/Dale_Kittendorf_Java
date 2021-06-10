package com.challenge.M2ChallengeKittendorfDale.controller;

import com.challenge.M2ChallengeKittendorfDale.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@RestController
public class QuoteController {
    Random random = new Random();


    private static List<Quote> quoteList= new ArrayList<> (Arrays.asList(
            new Quote (1,
                    "John Mason Goode",
                    "Happiness consists in activity. It is running steam, not a stagnant pool."),
            new Quote (2,
                    "Abraham Lincoln",
                    "I will read and prepare myself and one day, my time will come"),
            new Quote (3,
                    "Rene Descartes",
                "It is not enough to have a good mind; the main thing is to use it well."),
            new Quote (4,
                    "Albert Einstein",
                    "It is not that I'm so smart.But I stay with the questions much longer."),
            new Quote (5,
                    "Johnathan Swift",
                    "May You live every day of your life.")



            ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Quote getQuote() {
        Quote newQuote = new Quote();

        int randomQuoteIndex = random.nextInt(quoteList.size());
        Quote randomQuote = quoteList.get(randomQuoteIndex);
//        System.out.println(randomQuote);


        return randomQuote;
    };

}







//- Quote API:
//  - URI: /quote
//  - Method: GET
//  - Request Body: None
//  - Response Body: Quote
//- Quote Object instance variables:
//  - id
//  - author
//  - quote